package aluguel.services.impl;


import aluguel.dto.CarroDto;
import aluguel.dto.CreateCarroRequest;
import aluguel.persistense.entities.CarroEntity;
import aluguel.persistense.repositories.CarroRepository;
import aluguel.services.ICarroService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor //cria os contrutores apenas final.
public class CarroService implements ICarroService {

    private final CarroRepository carroRepository;

    @Override
    public void createCarro(CreateCarroRequest createCarroRequest){

        var carroEntity = new CarroEntity();

        carroEntity.setMarcaCarro(createCarroRequest.getMarcaCarro());
        carroEntity.setModeloCarro(createCarroRequest.getModeloCarro());
        carroEntity.setAnoCarro(createCarroRequest.getAnoCarro());
        carroRepository.save(carroEntity);

    }

    @Override
    public List<CarroDto> listCarro() {
        var carroLista = carroRepository.findAll()
                .stream()
                .map(carroEntity -> {
                    var carroDto = new CarroDto();
                    carroDto.setMarca(carroEntity.getMarcaCarro());
                    carroDto.setAno(carroEntity.getAnoCarro());
                    carroDto.setModelo(carroEntity.getModeloCarro());

                    return carroDto;
                })
                .toList();

        return carroLista;
    }
}
