package metalab.inscricao.dtos;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import metalab.inscricao.model.ModelInstructor;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DocumentsDTO {
 private  UUID id;
 private String title;
 private  ModelInstructor instructor;

 private String fileUrl;

}
