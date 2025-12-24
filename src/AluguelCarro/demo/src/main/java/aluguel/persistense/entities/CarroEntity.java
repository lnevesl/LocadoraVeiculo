package aluguel.persistense.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Table(name = "tb_carro" , schema = "public")
public class CarroEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "carro_id" , nullable = false)
    private Long carroId;

    @Setter
    @Column(name = "marca_carro" , nullable = false)
    private String marcaCarro;

    @Setter
    @Column(name = "modelo_carro" , nullable = false)
    private String modeloCarro;

    @Setter
    @Column(name = "ano_carro" , nullable = false)
    private String anoCarro;
}
