package metalab.inscricao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import metalab.inscricao.Model.ModelFather;

@Repository
public interface RepositoryFather extends JpaRepository<ModelFather, Integer> {

}
