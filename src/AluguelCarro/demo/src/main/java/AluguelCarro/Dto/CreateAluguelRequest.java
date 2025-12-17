package AluguelCarro.Dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class CreateAluguelRequest {

    private Long vendaId;
    private Long clinteId;
    private Long carroId;
}
