/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ramir.petclinic.services.map;

import com.ramir.petclinic.model.Pet;
import com.ramir.petclinic.services.CrudService;
import java.util.Set;

/**
 *
 * @author ramir
 */
public class PetServiceMap extends AbstractMapService<Pet, Long> implements CrudService<Pet, Long>{

    @Override
    public void delete(Pet object) {
        super.delete(object); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Pet save(Long id, Pet object) {
        return super.save(id, object); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Set<Pet> findAll() {
        return super.findAll(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
