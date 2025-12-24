package aluguel.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class CreateClienteRequest {
    private String nomeCliente;
    private String cpfCliente;
    private String enderecoCliente;
}
