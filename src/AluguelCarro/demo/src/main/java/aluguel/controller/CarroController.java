package aluguel.controller;

import aluguel.dto.CarroDto;
import aluguel.dto.CreateCarroRequest;
import aluguel.services.ICarroService;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RequiredArgsConstructor
@RestController
public class CarroController {

    private final ICarroService iCarroService;

    @PostMapping
    public String createCarro(CreateCarroRequest createCarroRequest) {

        if (createCarroRequest.getMarcaCarro() == null) {
            return "O campo marca é obrigatório.";
        }
        if (createCarroRequest.getModeloCarro() == null) {
            return "O campo modelo é obrigatório";
        }
        if (createCarroRequest.getAnoCarro() == null) {
            return "O campo ano é obrigatório";

        }

        iCarroService.createCarro(createCarroRequest);
        return "Carro Cadastrado com sucesso";

    }

    @GetMapping
    public List<CarroDto> listCarro() {
        return iCarroService.listCarro();
    }
}

