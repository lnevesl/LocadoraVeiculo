package AluguelCarro.Dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class CreateCarroRequest {
    private String marcaCarro;
    private String modeloCarro;
    private String anoCarro;
}
