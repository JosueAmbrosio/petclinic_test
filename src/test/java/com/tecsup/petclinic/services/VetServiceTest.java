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
    private VetRepository vetRepository;

    @Test
    public void testCreateVet() {
        VetService vetService = new VetService(vetRepository);

        Vet vet = new Vet();
        vet.setFirstName("Jhon");
        vet.setLastName("Doe");

        Vet resultado = vetService.create(vet);

        Assertions.assertEquals("Jhon", resultado.getFirstName());
        Assertions.assertEquals("Doe", resultado.getLastName());

        Assertions.assertNotNull(resultado.getId());
    }
}
