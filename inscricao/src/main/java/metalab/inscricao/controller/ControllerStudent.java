package metalab.inscricao.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("metalab/aluno")
@CrossOrigin
public class ControllerStudent {

    @GetMapping
    public ResponseEntity<List<ModelStudent>> ListStudent(){
        List<StudentDTO> student = serviceStudent.ListStudent();
        return ResponseEntity.ok(student);
    }


}
