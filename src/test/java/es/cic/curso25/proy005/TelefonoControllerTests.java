package es.cic.curso25.proy005;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TelefonoControllerTests {
    
    @Autowired
    private TelefonoController telefonoController;
    
    @Test
    void testCreate() {
        long resultadoId = telefonoController.create(null);
        assertTrue(resultadoId > 0);
    }

    @Test
    void testDelete() {

    }

    @Test
    void testGet() {

    }

    @Test
    void testGet2() {

    }

    @Test
    void testUpdate() {

    }
}
