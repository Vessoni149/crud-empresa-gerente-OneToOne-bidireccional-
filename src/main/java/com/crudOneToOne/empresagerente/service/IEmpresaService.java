
package com.crudOneToOne.empresagerente.service;

import com.crudOneToOne.empresagerente.model.Empresa;
import java.util.List;


public interface IEmpresaService {
    public List<Empresa> getEmpresas();
    public void saveEmpresa(Empresa empresa);
    public void deleteEmpresa(Long id);
    public Empresa findEmpresa(Long id);
    public void editEmpresa(Empresa empresa);
}
