/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ramir.petclinic.services.map;

import com.ramir.petclinic.model.Vet;
import com.ramir.petclinic.services.CrudService;
import java.util.Set;

/**
 *
 * @author ramir
 */
public class VetServiceMap extends AbstractMapService<Vet, Long> implements CrudService<Vet, Long>{

    @Override
    public void delete(Vet object) {
        super.delete(object); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Vet save(Long id, Vet object) {
        return super.save(id, object); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Set<Vet> findAll() {
        return super.findAll(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
