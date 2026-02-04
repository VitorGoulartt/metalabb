package metalab.inscricao.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("metalab/pais")
@CrossOrigin
public class ControllerFathers {

    @GetMapping
    public ResponseEntity<List<Fathe>> listFathers(){
        List<Fathe> fathers = serviceFather.listFathers();
        return ResponseEntity.ok(fathers);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Fathe> listFathersById(@PathVariable int id){
        Fathe father = serviceFather.listFathersById(id);
        if( father != null){
            return ResponseEntity.ok(father);
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();

    }

    @GetMapping ("/student/{id}")
     public ResponseEntity<Fathe> listFathersByStudentId(@PathVariable int id){
        Fathe father = serviceFather.listFathersByStudentId(id);
        if( father != null){
            return ResponseEntity.ok(father);
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<ModelFather> updateFather(@RequestBody ModelFather father, @PathVariable int id){
         ModelFather  updatedFather = serviceFather.updateFather(father, id);
        if(updatedFather != null){
            return ResponseEntity.ok(updatedFather);
        }
        return ResponseEntity.status(HttpStatus.NOT_MODIFIED).build();
    }

    
}
