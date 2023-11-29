
package com.crudOneToOne.empresagerente.controller;

import com.crudOneToOne.empresagerente.model.Gerente;
import com.crudOneToOne.empresagerente.service.IGerenteService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GerenteController {
    
    @Autowired 
    IGerenteService gerenteServ; 
    
    @GetMapping("/gerentes/traer")
    public List<Gerente> getGerentes(){
        List<Gerente> gerentes = gerenteServ.getGerentes();
        return gerentes;
    }
    
    @GetMapping("/gerentes/traer/{id}")
    public Gerente getGerente(@PathVariable Long id){
        return gerenteServ.findGerente(id);
    }
    
    @PostMapping("/gerentes/crear")
    public String crearGerente(@RequestBody Gerente gerente){
    gerenteServ.saveGerente(gerente);
    return "Gerente creado correctamente";
    }
    
    @PutMapping("/gerentes/editar")
    public String editarGerente(@RequestBody Gerente gerente){
        gerenteServ.editGerente(gerente);
        return "Gerente editado correctamente";
    }
    
    @DeleteMapping("/gerentes/borrar/{id}")
    public String eliminarGerente(@PathVariable Long id){
        gerenteServ.deleteGerente(id);
        return "Gerente eliminado correctamente";
    }
}
