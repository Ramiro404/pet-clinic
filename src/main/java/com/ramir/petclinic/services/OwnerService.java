/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ramir.petclinic.services;

import com.ramir.petclinic.model.Owner;
import java.util.Set;

/**
 *
 * @author ramir
 */
public interface OwnerService extends CrudService<Owner, Long>{
    Owner findByLastName(String lastName);

}
