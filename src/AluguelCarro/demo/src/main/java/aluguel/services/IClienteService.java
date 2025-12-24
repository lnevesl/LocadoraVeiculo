package aluguel.services;

import aluguel.dto.ClienteDto;
import aluguel.dto.CreateClienteRequest;

import java.util.List;

public interface IClienteService {
    void createCliente(CreateClienteRequest createClienteRequest);
    List<ClienteDto> listCliente();
}
