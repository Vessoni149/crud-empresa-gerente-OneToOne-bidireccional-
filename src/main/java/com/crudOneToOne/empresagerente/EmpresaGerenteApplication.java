package com.crudOneToOne.empresagerente;


import com.crudOneToOne.empresagerente.model.Gerente;
import com.crudOneToOne.empresagerente.service.GerenteService;
import java.util.List;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;


@SpringBootApplication
@EntityScan("com.crudOneToOne.empresagerente.model")
public class EmpresaGerenteApplication {

     @Autowired
    private GerenteService gerenteService;
     
	public static void main(String[] args) {
		SpringApplication.run(EmpresaGerenteApplication.class, args);
                
           
}
        @PostConstruct
        public void mostrarInfo(){
            List<Gerente> listaGerentes = gerenteService.getGerentes();
            for (Gerente gerente : listaGerentes) {
            System.out.println(gerente.getNombre());
            System.out.println(gerente.getEmpresa());
            }
        }
}
