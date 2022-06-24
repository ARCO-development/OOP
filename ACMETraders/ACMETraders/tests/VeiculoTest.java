package tests;
import objetos.Veiculo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;

public class VeiculoTest {

@Test
public void getAnoTest() {
    Veiculo veiculo = new Veiculo("Tesla", "Model X plaid", 2022, "Branco");
    assertEquals(2022.0, (double)veiculo.getAno());
}

@Test
public void getMarcaTest() {
    Veiculo veiculo = new Veiculo("Tesla", "Model X plaid", 2022, "Branco");
    assertEquals("Tesla", veiculo.getMarca());
}

@Test
public void getModeloTest() {
    Veiculo veiculo = new Veiculo("Tesla", "Model X plaid", 2022, "Branco");
    assertEquals("Model X plaid", veiculo.getModelo());
}

@Test
public void getCorTest() {
    Veiculo veiculo = new Veiculo("Tesla", "Model X plaid", 2022, "Branco");
    assertEquals("Branco", veiculo.getCor());
}

@Test
public void setMarcaTest() {
    Veiculo veiculo = new Veiculo("Tesla", "Model X plaid", 2022, "Branco");
    veiculo.setMarca("Bugatti");
    assertEquals("Bugatti", veiculo.getMarca());
}

@Test
public void setModeloTest() {
    Veiculo veiculo = new Veiculo("Tesla", "Model X plaid", 2022, "Branco");
    veiculo.setModelo("Chiron Sport");
    assertEquals("Chiron Sport", veiculo.getModelo());
}

@Test
public void setAnoTest() {
    Veiculo veiculo = new Veiculo("Tesla", "Model X plaid", 2022, "Branco");
    veiculo.setAno(2018);
    assertEquals(2018, veiculo.getAno());
}

@Test
public void setCorTest() {
    Veiculo veiculo = new Veiculo("Tesla", "Model X plaid", 2022, "Branco");
    veiculo.setCor("Preto");
    assertEquals("Preto", veiculo.getCor());
}

}