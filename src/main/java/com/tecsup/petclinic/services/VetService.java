package com.tecsup.petclinic.services;

import com.tecsup.petclinic.entities.Vet;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
@Slf4j
public class VetService {

    private final HashMap<Integer, Vet> vetMap = new HashMap<>();

    public Vet create(int id, String firstName, String lastName) {
        Vet vet = new Vet(id, firstName, lastName);
        vetMap.put(id, vet);
        return vet;
    }

    public Vet buscar(int id) {
        return vetMap.get(id);
    }

    public String eliminar(int id) {
        vetMap.remove(id);
        return "eliminado";
    }
}
