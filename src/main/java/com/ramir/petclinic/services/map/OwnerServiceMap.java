/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ramir.petclinic.services.map;

import com.ramir.petclinic.model.Owner;
import com.ramir.petclinic.services.CrudService;
import java.util.Set;

/**
 *
 * @author ramir
 */
    public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements CrudService<Owner, Long>{

    @Override
    public void delete(Owner object) {
        super.delete(object); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Owner save(Long id, Owner object) {
        return super.save(id, object); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Set<Owner> findAll() {
        return super.findAll(); //To change body of generated methods, choose Tools | Templates.
    }

    
}
