/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ramir.petclinic.services.map;

import java.util.*;

/**
 *
 * @author ramir
 */
public abstract class AbstractMapService<T, ID> {
    
    protected Map<ID, T> map = new HashMap<>();
    
     Set<T> findAll(){
        return new HashSet<>(map.values());
    }
    
    T findById(ID id) {
        return map.get(id);
    }
    
    T save(ID id, T object){
        map.put(id, object);
        return object;
    }
    
    void deleteById(ID id){
        map.remove(id);
    }
    
    void delete(T object){
        map.entrySet().removeIf(entry  -> entry.getValue().equals(object));
    }
}
