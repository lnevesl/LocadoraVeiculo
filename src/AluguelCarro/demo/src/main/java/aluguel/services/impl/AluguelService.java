package aluguel.services.impl;


import aluguel.dto.AluguelDto;
import aluguel.dto.CreateAluguelRequest;
import aluguel.persistense.entities.AluguelEntity;
import aluguel.persistense.repositories.AluguelRepository;
import aluguel.services.IAluguelService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor //cria os contrutores apenas final.
public class AluguelService implements IAluguelService {

    private final AluguelRepository aluguelRepository;

    @Override
    public void createAluguel(CreateAluguelRequest createAluguelRequest){

        var aluguelEntity = new AluguelEntity();

        aluguelEntity.setClienteId(createAluguelRequest.getClinteId());
        aluguelEntity.setCarroId(createAluguelRequest.getCarroId());

        aluguelRepository.save(aluguelEntity);

    }






    @Override
    public List<AluguelDto> listAluguel() {
        var aluguelLista = aluguelRepository.findAll()
                .stream()
                .map(aluguelEntity -> {
                    var aluguelDto = new AluguelDto();

                    aluguelDto.setClienteId(aluguelEntity.getClienteId());
                    aluguelDto.setCarroId(aluguelEntity.getCarroId());

                    return aluguelDto;
                })
                .toList();

        return aluguelLista;
    }
}
