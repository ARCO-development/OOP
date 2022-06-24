import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class DroneTest {
 
    @Test
    public void calculaImpostoMaiorIgual4() {
        Drone drone = new Drone("DJI Phantom", 15000, 4);
        assertEquals(1500, drone.calculaImposto(), 0);
    }

    @Test
    public void calculaImpostoMaiorQue4() {
        Drone drone = new Drone("DJI Phantom", 15000, 4);
        assertEquals(3000, drone.calculaImposto(), 0);
    }

}