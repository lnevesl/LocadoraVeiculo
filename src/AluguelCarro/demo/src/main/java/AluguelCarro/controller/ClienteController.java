package AluguelCarro.controller;

import AluguelCarro.Dto.ClienteDto;
import AluguelCarro.Dto.CreateClienteRequest;
import AluguelCarro.services.IClienteService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class ClienteController {

    private final IClienteService iClienteService;

    @PostMapping
    public String createCliente(CreateClienteRequest createClienteRequest){

        if (createClienteRequest.getNomeCliente() == null) {
            return "O campo Nome do Cliente é obrigatório";
        }
        if (createClienteRequest.getCpfCliente() == null) {
            return "O campo Cpf do Cliente é obrigatório";
        }
        if (createClienteRequest.getEnderecoCliente() == null){
            return "O campo do Endereço do Cliente é obrigatório";

        }

        iClienteService.createCliente(createClienteRequest);
        return "Cliente Cadastrado com sucesso";

    }
    @GetMapping
    public List<ClienteDto> listCliente(){
        return iClienteService.listCliente();


    }



}

