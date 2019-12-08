package functions;

import java.util.function.Function;

import org.junit.Test;

public class Functions {
	
	Function<Integer, String> parOuImpar = numero -> numero % 2 == 0 ? "Par" : "impar";
	

	@Test
	public void functions() {
		System.out.println(parOuImpar.apply(4));
		Function<Integer, String> parOuImpar = numero -> numero % 2 == 0 ? "Par" : "impar";
		System.out.println(parOuImpar.apply(4));

		Function<String, String> oResusltadoE = valor -> "O resultado é: " + valor;
		
		Function<String, String> empolgado = valor -> valor + "!!!" ;

		
		String resultadoFinal = parOuImpar
				.andThen(oResusltadoE)
				.andThen(empolgado)
				.apply(32);

		System.out.println(resultadoFinal);
	}
}
