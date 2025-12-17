package AluguelCarro.services.impl;


import AluguelCarro.Dto.AluguelDto;
import AluguelCarro.Dto.CreateAluguelRequest;
import AluguelCarro.persistense.entities.AluguelEntity;
import AluguelCarro.persistense.repositories.AluguelRepository;
import AluguelCarro.services.IAluguelService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor //cria os contrutores apenas final.
public class AluguelService implements IAluguelService {

    private final AluguelRepository aluguelRepository;
    private String te;

    @Override
    public void createAluguel(CreateAluguelRequest createAluguelRequest){

        var aluguelEntity = new AluguelEntity();

        aluguelEntity.setClienteId(createAluguelRequest.getClinteId());
        aluguelEntity.setCarroId(createAluguelRequest.getCarroId());

    }
    @Override
    public List<AluguelDto> listAluguel() {
        return aluguelLista = aluguelRepository.findAll()
                .stream()
                .map(aluguelEntity -> {
                    var aluguelDto = new AluguelDto();

                    aluguelDto.setAluguel(aluguelEntity.getclienteId());
                    aluguelDto.setAluguel(aluguelEntity.getcarroId());

                    return aluguelDto;
                })
                .toList();

        return aluguelLista;
    }
}
