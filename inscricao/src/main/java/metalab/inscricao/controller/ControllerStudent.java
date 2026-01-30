package metalab.inscricao.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("metalab/aluno")
@CrossOrigin
public class ControllerStudent {

    @GetMapping
    public ResponseEntity<List<StudentDTO>> ListStudent(){
        List<StudentDTO> student = serviceStudent.ListStudent();
        return ResponseEntity.ok(student);
    }

    @GetMapping("/{id}")
    public ResponseEntity<StudentDTO> StudentById(@PathVariable int id){
        StudentDTO student = serviceStudent.StudentById(id);
        if(student != null){
            
            return ResponseEntity.ok(student);
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        
    }

    @GetMapping("/filtro")
    public ResponseEntity<List<StudentDTO>> StudentByFilter(@RequestParam(required = false) String circulo,
                                                            @RequestParam( required = false) Turno turno,
                                                            @RequestParam(required = false) Local local ){
    
                                                            
        List<StudentDTO> student = serviceStudent.StudentByFilter(circulo, turno, local);
        return ResponseEntity.ok(student);
    }
    @GetMapping("/{idFathers}")
    public ResponseEntity<List<StudentDTO>> StudentUnderage(@PathVariable int idFathers{
        List<StudentDTO> student = serviceStudent.StudentFathers(idFathers);
        return ResponseEntity.ok(student);

    })

    @PutMapping("/{id}")
    public ResponseEntity<StudentDTO> UpdateStudent(@PathVariable int id, @RequestBody StudentDTO studentDTO){
        StudentDTO updatedStudent = serviceStudent.UpdateStudent(id, studentDTO);
        if(updatedStudent != null){
            return ResponseEntity.ok(updatedStudent);
        }
        return ResponseEntity.status(HttpStatus.NOT_MODIFIED).build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ModelStudent> DeleteStudent(@PathVariable int id){
        serviceStudent.DeleteStudent(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }


}
