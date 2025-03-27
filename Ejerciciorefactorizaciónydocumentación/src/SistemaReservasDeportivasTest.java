import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class SistemaReservasDeportivasTest {

    static SistemaReservasDeportivas sistemaReservas;

    @BeforeAll
    static void setUpBeforeClass() throws Exception {
        sistemaReservas = new SistemaReservasDeportivas(); 
    }

    @Test
    void test() {
    	LocalDateTime fecha = LocalDateTime.now();
        assertTrue(sistemaReservas.reservarPista(null));
        assertFalse(sistemaReservas.reservarPista(null));
        assertTrue(sistemaReservas.reservarPista(null));
        assertTrue(sistemaReservas.reservarPista(null));
        assertTrue(sistemaReservas.reservarPista(null));
    }
    
    @Test
    void testCnacelarPista() {
    	LocalDateTime fecha = LocalDateTime.now();
    	assertTrue(sistemaReservas.reservarPista(null));
    	assertTrue(sistemaReservas.cancelarReserva(0));
    }
    
}

