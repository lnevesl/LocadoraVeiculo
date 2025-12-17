package AluguelCarro.persistense.entities;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Table(name = "tb_aluguel" , schema = "public")
public class AluguelEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Aluguel_id" , nullable = false)
    private Long aluguelId;

    @Setter
    @Column(name = "cliente_Id" , nullable = false)
    private Long clienteId;

    @Setter
    @Column(name = "Carro_Id" , nullable = false)
    private Long carroId;


}
