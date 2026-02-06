package metalab.inscricao.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Entity
@Table(name = "students")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ModelStudent {

    @Id
    private Integer id;
    private String nome;
    private String email;
    private String telefone;
    private String cpf;

}
