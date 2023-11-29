
package com.crudOneToOne.empresagerente.repository;

import com.crudOneToOne.empresagerente.model.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEmpresaRepository extends JpaRepository<Empresa, Long>{
    
}
