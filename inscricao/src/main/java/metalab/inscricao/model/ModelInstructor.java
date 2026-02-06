package metalab.inscricao.model;

import org.springframework.data.repository.cdi.Eager;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "instructors")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ModelInstructor {

    @Id
    private Integer id;
    private String nome;
    private String email;
    private String telefone;
    private
}
