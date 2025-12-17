package AluguelCarro.services.impl;


import AluguelCarro.Dto.ClienteDto;
import AluguelCarro.Dto.CreateClienteRequest;
import AluguelCarro.persistense.entities.ClienteEntity;
import AluguelCarro.persistense.repositories.ClienteRepository;
import AluguelCarro.services.IClienteService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor //cria os contrutores apenas final.
public class ClienteService implements IClienteService {

    private final ClienteRepository clienteRepository;
    private String te;

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
