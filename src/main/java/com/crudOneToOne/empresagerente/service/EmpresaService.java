
package com.crudOneToOne.empresagerente.service;

import com.crudOneToOne.empresagerente.model.Empresa;
import com.crudOneToOne.empresagerente.repository.IEmpresaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpresaService implements IEmpresaService{
    @Autowired
    private IEmpresaRepository empresaRepo;

    @Override
    public List<Empresa> getEmpresas() {
        List<Empresa> listaEmpresas = empresaRepo.findAll();
        return listaEmpresas;
    }

    @Override
    public void saveEmpresa(Empresa empresa) {
     empresaRepo.save(empresa);
    }

    @Override
    public void deleteEmpresa(Long id) {
        empresaRepo.deleteById(id);
    }

    @Override
    public Empresa findEmpresa(Long id) {
        Empresa empre = empresaRepo.findById(id).orElse(null);
        return empre;
    }

    @Override
    public void editEmpresa(Empresa empresa) {
        this.saveEmpresa(empresa);
        
    }
}
