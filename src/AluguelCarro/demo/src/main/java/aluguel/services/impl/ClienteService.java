package aluguel.services.impl;


import aluguel.dto.ClienteDto;
import aluguel.dto.CreateClienteRequest;
import aluguel.persistense.entities.ClienteEntity;
import aluguel.persistense.repositories.ClienteRepository;
import aluguel.services.IClienteService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor //cria os contrutores apenas final.
public class ClienteService implements IClienteService {

    private final ClienteRepository clienteRepository;

    @Override
    public void createCliente(CreateClienteRequest createClienteRequest){

        var clienteEntity = new ClienteEntity();

        clienteEntity.setNomeCliente(createClienteRequest.getNomeCliente());
        clienteEntity.setCpf(createClienteRequest.getCpfCliente());
        clienteEntity.setEndereco(createClienteRequest.getEnderecoCliente());
        clienteRepository.save(clienteEntity);
    }

    @Override
    public List<ClienteDto> listCliente() {
        var clienteLista = clienteRepository.findAll()
                .stream()
                .map(clienteEntity -> {
                    var clienteDto = new ClienteDto();
                    clienteDto.setNomeCliente(clienteEntity.getNomeCliente());
                    clienteDto.setCpf(clienteEntity.getCpf());
                    return clienteDto;
                })
                .toList();

        return clienteLista;
    }

}
