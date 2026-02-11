package metalab.inscricao.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import metalab.inscricao.model.ModelDocument;

@Repository
public interface RepositoryDocument extends JpaRepository<ModelDocument, UUID> {

}
