package metalab.inscricao.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import metalab.inscricao.repository.RepositoryDocument;

@Service
public class ServiceDocument {

    @Autowired
    private RepositoryDocument repositoryDocument;

}
