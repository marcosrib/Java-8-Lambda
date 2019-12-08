package exer4;

import org.junit.Test;

public class Exer4 {

	public static void calcular(Matematica m) {
		System.out.println(m.oprerar(10, 10));
	}
	@Test
	public void exer4() {
		calcular((v1,v2)-> v1 + v2);
	}
}
