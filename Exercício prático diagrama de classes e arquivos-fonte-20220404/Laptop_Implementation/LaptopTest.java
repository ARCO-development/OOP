import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

class LaptopTest {

    @Test
    void calculaImpostoIntel() {
        Laptop laptop = new Laptop("Dell", 3000.0, "intel");
        assertEquals(900.0, laptop.calculaImposto(), 0);
    }

    @Test
    void calculaImpostoAMD(){
        Laptop laptop = new Laptop("Asus", 5000.0, "AMD");
        assertEquals(1250.0, laptop.calculaImposto(), 0);
    }
}