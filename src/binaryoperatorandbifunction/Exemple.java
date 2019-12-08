package binaryoperatorandbifunction;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

import org.junit.Test;

public class Exemple {
	@Test
	public void name() {
		BinaryOperator<Double> media = (n1, n2) -> (n1 + n2) / 2;
		System.out.println(media.apply(5.0, 7.8));
		BiFunction<Double, Double, String> resultado = (n1,n2)->{
			double notafinal = (n1+n2)/2;
			return notafinal >= 7 ? "Aprovado" : "Reprovado";
		};
		System.err.println(resultado.apply(8.9, 5.8));
		
		Function<Double, String> conceito = m -> m >= 7 ? "Aprovado" : "Reprovado";
		
		System.out.println(media.andThen(conceito).apply(9.7, 4.2));
	}
}
