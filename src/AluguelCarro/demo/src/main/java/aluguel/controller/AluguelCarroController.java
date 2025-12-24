package aluguel.controller;


import aluguel.dto.AluguelDto;
import aluguel.dto.CreateAluguelRequest;
import aluguel.services.IAluguelService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class AluguelCarroController {

    private final IAluguelService iAluguelService;

    @PostMapping("/aluguel")
    public String createVenda(CreateAluguelRequest createAluguelRequest) {

        if (createAluguelRequest.getCarroId() == null) {
            return "Carro ID é obrigatório";
        }
        if (createAluguelRequest.getClinteId() == null) {
            return "Cliente ID é obrigatório";
        }

        iAluguelService.createAluguel(createAluguelRequest);
        return "Aluguel Cadastrado com sucesso";
    }

    @GetMapping
    public List<AluguelDto> listAluguel() {
        return iAluguelService.listAluguel();
    }
}
