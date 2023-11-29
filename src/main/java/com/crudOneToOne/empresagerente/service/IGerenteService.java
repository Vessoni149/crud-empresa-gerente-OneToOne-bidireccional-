
package com.crudOneToOne.empresagerente.service;

import com.crudOneToOne.empresagerente.model.Gerente;
import java.util.List;


public interface IGerenteService {
    public List<Gerente> getGerentes();
    public void saveGerente(Gerente gerente);
    public void deleteGerente(Long id);
    public Gerente findGerente(Long id);
    public void editGerente(Gerente gerente);
}
