
package com.crudOneToOne.empresagerente.repository;

import com.crudOneToOne.empresagerente.model.Gerente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IGerenteRepository extends JpaRepository<Gerente, Long>{
    
}
