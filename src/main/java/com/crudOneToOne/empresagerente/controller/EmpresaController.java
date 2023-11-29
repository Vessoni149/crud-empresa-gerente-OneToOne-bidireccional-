package com.crudOneToOne.empresagerente.controller;

import com.crudOneToOne.empresagerente.model.Empresa;
import com.crudOneToOne.empresagerente.service.IEmpresaService;
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
public class EmpresaController {

    @Autowired
    IEmpresaService empresaServ;
    @GetMapping
    public String home(){
        return "home";
    }
    
    @GetMapping("/empresas/traer")
    public List<Empresa> getEmpresas(){
        List empresas = empresaServ.getEmpresas();
        return empresas;
    }
    
    @GetMapping("/empresas/traer/{id}")
    public Empresa getEmpresa(@PathVariable Long id){
    Empresa empre = empresaServ.findEmpresa(id);
    return empre;
    }
    
    @PostMapping("/empresas/crear")
    public String crearEmpresa(@RequestBody Empresa empre){
        empresaServ.saveEmpresa(empre);
        return "Empresa creada correctamente";
    }
    
    @PutMapping("/empresas/editar")
    public String editarEmpresa(@RequestBody Empresa empre){
        empresaServ.editEmpresa(empre);
        return "Empresa editada correctamente";
    }
    
    @DeleteMapping("/empresas/borrar/{id}")
    public String eliminarEmpresa(@PathVariable Long id){
        empresaServ.deleteEmpresa(id);
        return "Empresa eliminada correctamente";
    }
}
