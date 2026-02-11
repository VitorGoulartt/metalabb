package metalab.inscricao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.api.services.sheets.v4.model.Response;

import metalab.inscricao.service.ServiceDocument;

@RestController
@RequestMapping("metalab/document")
@CrossOrigin
public class ControllerDocument {

    @Autowired
    private ServiceDocument serviceDocument;

    @PostMapping("/upload")
    public ResponseEntity<
}
