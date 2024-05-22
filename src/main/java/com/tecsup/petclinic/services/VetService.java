package com.tecsup.petclinic.services;

import com.tecsup.petclinic.entities.Vet;
import com.tecsup.petclinic.repositories.VetRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
@Slf4j
public class VetService {

    private final HashMap<Integer, Vet> vet = new HashMap<>();

    public Vet create(int id, String nombre, String apellido) {
        vet.put(id,new Vet(id, nombre, apellido));
        return vet.get(id);
    }
}
