package com.tecsup.petclinic.services;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.tecsup.petclinic.entities.Vet;
import com.tecsup.petclinic.services.VetService;

public class VetServiceTest {

    private VetService vetService;

    @BeforeEach
    void setUp() {
        vetService = new VetService();
    }

    @Test
    void testCreate() {
        Vet vet = vetService.create(1, "Aaron", "Ambrosio");
        assertNotNull(vet);
        assertEquals(1, vet.getId());
        assertEquals("John", vet.getFirstName());
        assertEquals("Doe", vet.getLastName());
    }

    @Test
    void testBuscar() {
        vetService.create(1, "Abner", "Antezano");
        Vet vet = vetService.buscar(1);
        assertNotNull(vet);
        assertEquals(2, vet.getId());
    }

    @Test
    void testEliminar() {
        vetService.create(1, "Yahaira", "Chavez");
        String result = vetService.eliminar(1);
        assertEquals("eliminado", result);
        assertNull(vetService.buscar(1));
    }
}
