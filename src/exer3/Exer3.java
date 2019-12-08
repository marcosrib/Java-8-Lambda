package exer3;

import org.junit.Test;

import exer2.Forno;

public class Exer3 {
	@Test
	public void exer3() {
		Forno forno = new Forno();
		forno.assar(() -> System.out.println("Pizza lambda"));
		forno.assar(() -> {
			System.out.println("queijo");
			System.out.println("molho");
		});

	}
}
