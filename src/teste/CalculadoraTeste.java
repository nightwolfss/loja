package teste;

import org.junit.Assert;
import org.junit.Test;

public class CalculadoraTeste {
	
	@Test
	public void somar() {
		int a = 4;
		int b = 3;
		Calculadora calc = new Calculadora();
		
		int resultado = calc.somar(a, b);
		
		Assert.assertEquals(8, resultado);
	}

}
