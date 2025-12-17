package AluguelCarro.persistense.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Table(name = "tb_carro" , schema = "public")
public class CarroEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Carro_Id" , nullable = false)
    private Long CarroId;

    @Setter
    @Column(name = "Marca_Carro" , nullable = false)
    private String marcaCarro;

    @Setter
    @Column(name = "Modelo_Carro" , nullable = false)
    private String modeloCarro;

    @Setter
    @Column(name = "AnoCarro" , nullable = false)
    private String anoCarro;
}
