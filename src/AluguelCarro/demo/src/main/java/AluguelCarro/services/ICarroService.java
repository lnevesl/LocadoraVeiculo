package AluguelCarro.services;

import AluguelCarro.Dto.CarroDto;
import AluguelCarro.Dto.ClienteDto;
import AluguelCarro.Dto.CreateCarroRequest;

import java.util.List;

public interface ICarroService {
    void createCarro(CreateCarroRequest createCarroRequest);
    List<CarroDto> listCarro();
}
