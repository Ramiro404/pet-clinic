/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ramir.petclinic.services;

import java.util.Set;

/**
 *
 * @author ramir
 */
public interface Vet {
    Vet findById(Long id);
    Vet save(Vet vet);
    Set<Vet> findAll();
}
