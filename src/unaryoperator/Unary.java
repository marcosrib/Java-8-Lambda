package unaryoperator;

import java.util.function.UnaryOperator;

import org.junit.Test;

public class Unary {
    @Test
	public void name() {
     UnaryOperator<Integer> maisDois = n -> n + 2;
     UnaryOperator<Integer> vezesDois = n -> n * 2;
     UnaryOperator<Integer> aoQuadrado= n -> n * n;
     
     int resultado1 = maisDois
    		.andThen(vezesDois)
    		.andThen(aoQuadrado)
    		.apply(0);
     System.out.println(resultado1);
     
     int resultado2 = aoQuadrado
    		 .compose(vezesDois)
    		 .compose(maisDois)
    		 .apply(0);
     System.out.println(resultado2);
	}
}
