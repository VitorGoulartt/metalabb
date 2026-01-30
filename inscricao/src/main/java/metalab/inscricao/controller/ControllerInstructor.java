package metalab.inscricao.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("metalab/instrutor")
@RestController
@CrossOrigin
public class ControllerInstructor {


    @GetMapping
    public ResponseEntity<List<InstructorDTO>> listInstructors(){
        List<InstructorDTO> instructors = serviceInstructor.listInstructors();
        return ResponseEntity.ok(instructors);
    }

    @GetMapping("/{id}")
    public ResponseEntity<InstructorDTO> listInstructorById(@PathVariable int id){
        InstructorDTO instructo = serviceIntructor.listInstructorById(id);
        if( instructo != null){
            return ResponseEntity.ok(instructo);
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    

    }

    @
   


}
