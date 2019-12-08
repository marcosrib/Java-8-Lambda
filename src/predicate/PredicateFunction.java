package predicate;

import java.util.function.Predicate;

import org.junit.Test;

public class PredicateFunction {
	@Test
	public void predicate() {
		Predicate<Integer> isPar = num -> num % 2 == 0;
		Predicate<Integer> isTresDigitos = num -> num >= 100 && num <= 999;
		System.out.println(isPar.and(isTresDigitos).negate().test(3333));
	}
}
