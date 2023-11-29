
package com.crudOneToOne.empresagerente.service;

import com.crudOneToOne.empresagerente.model.Gerente;
import com.crudOneToOne.empresagerente.repository.IGerenteRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GerenteService implements IGerenteService{

    @Autowired
    private IGerenteRepository gerenteRepo;

    @Override
    public List<Gerente> getGerentes() {
        List<Gerente> listaGerentes = gerenteRepo.findAll();
        return listaGerentes;
    }

    @Override
    public void saveGerente(Gerente gerente) {
        gerenteRepo.save(gerente);
    }

    @Override
    public void deleteGerente(Long id) {
        gerenteRepo.deleteById(id);
    }

    @Override
    public Gerente findGerente(Long id) {
        Gerente gerente = gerenteRepo.findById(id).orElse(null);
        return gerente;
    }

    @Override
    public void editGerente(Gerente gerente) {
        this.saveGerente(gerente);
    }

}
