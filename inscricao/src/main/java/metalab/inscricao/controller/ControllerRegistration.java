package metalab.inscricao.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("metalab/inscricao")
@CrossOrigin
public class ControllerRegistration {

    @PostMapping
    public ResponseEntity<ModelRegistration> registerStudent(@RequestBody ModelRegistration registration){
        ModelRegistration registered = serviceRegistration.registerStudent(registration);
        if( registered != null){
            return ResponseEntity.status(HttpStatus.CREATED).body(registered);
        }
        return ResponseEntity.status(HttpStatus.NOT_MODIFIED).build();
    }
    @GetMapping("/{id}")
    public ResponseEntity<RegistrationDTO> listRegistrationById(@PathVariable int id) {
        RegistrationDTO registration = serviceRegistration.listRegistrationById(id);
        if(registration != null){
            return ResponseEntity.ok(registration);
        }

        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        
    }

    @GetMapping
    public ResponseEntity<List<RegistrationDTO>> listRegistrations(){
        List<RegistrationDTO> registrations = serviceRegistration.listRegistrations();
        return ResponseEntity.ok(registrations);
    }

    

}
