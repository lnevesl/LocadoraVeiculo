package aluguel.services;

import aluguel.dto.CarroDto;
import aluguel.dto.CreateCarroRequest;

import java.util.List;

public interface ICarroService {
    void createCarro(CreateCarroRequest createCarroRequest);
    List<CarroDto> listCarro();
}
