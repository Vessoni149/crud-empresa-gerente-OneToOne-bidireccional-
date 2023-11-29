
package com.crudOneToOne.empresagerente.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Empresa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_empresa")
    private Long idEmpresa;

    private String nombre;

    //@OneToOne
    //private Gerente gerente;

    //Para relacion  bidireccional:
    
    @OneToOne(mappedBy="empresa")
    @JsonManagedReference
    private Gerente gerente;
 
    
    
    @Override
    public String toString() {
        return nombre;  
    }
}
