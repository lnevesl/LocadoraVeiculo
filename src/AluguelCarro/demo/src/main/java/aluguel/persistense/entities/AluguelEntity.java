package aluguel.persistense.entities;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Table(name = "tb_aluguel" , schema = "public")
public class AluguelEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "aluguel_id" , nullable = false)
    private Long aluguelId;

    @Setter
    @Column(name = "cliente_id" , nullable = false)
    private Long clienteId;

    @Setter
    @Column(name = "carro_id" , nullable = false)
    private Long carroId;


}
