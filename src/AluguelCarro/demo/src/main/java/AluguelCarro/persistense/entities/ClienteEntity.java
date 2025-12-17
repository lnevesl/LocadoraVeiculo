package AluguelCarro.persistense.entities;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Table(name = "tb_cliente" , schema = "public")
public class ClienteEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Cliente_id" , nullable = false)
    private Long clienteId;

    @Setter
    @Column(name = "nome_Cliente" , nullable = false)
    private String nomeCliente;

    @Setter
    @Column(name = "CPF" , nullable = false)
    private String cpf;

    @Setter
    @Column(name = "Endereco" , nullable = false)
    private String endereco;
}
