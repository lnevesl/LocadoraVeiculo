package AluguelCarro.services;

import AluguelCarro.Dto.AluguelDto;
import AluguelCarro.Dto.CarroDto;
import AluguelCarro.Dto.CreateAluguelRequest;

import java.util.List;

public interface IAluguelService {
    void createAluguel(CreateAluguelRequest createAluguelRequest);
    List<AluguelDto> listAluguel();
}
