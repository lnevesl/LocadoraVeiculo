package AluguelCarro.services;

import AluguelCarro.Dto.ClienteDto;
import AluguelCarro.Dto.CreateClienteRequest;

import java.util.List;

public interface IClienteService {
    void createCliente(CreateClienteRequest createClienteRequest);
    List<ClienteDto> listCliente();
}
