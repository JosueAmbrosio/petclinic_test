package com.tecsup.petclinic.services;

import com.tecsup.petclinic.entities.Vet;
import com.tecsup.petclinic.repositories.VetRepository;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class VetServiceTest {

    @Autowired
    private VetService vetService;

    @Autowired
    private VetRepository vetRepository;

    @Test
    public void testCreateVet() {

        Vet esperado = new Vet(1,"Josue","Ambrosio");

        VetService verService = new VetService();

        final Vet resultado = verService.create(1,"Josue","Ambrosio");

        Assertions.assertEquals(esperado, resultado);

    }
}
