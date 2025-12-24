package aluguel.services;

import aluguel.dto.AluguelDto;
import aluguel.dto.CreateAluguelRequest;

import java.util.List;

public interface IAluguelService {
    void createAluguel(CreateAluguelRequest createAluguelRequest);
    List<AluguelDto> listAluguel();
}
