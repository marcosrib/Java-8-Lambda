package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

import org.junit.Test;

public class Map {
	@Test
	public void name() {
		Consumer<String> print = System.out::print;
		List<String> marcas = Arrays.asList("BMW ", "Audi ", "Honda ");
		marcas.stream().map(m-> m.toUpperCase()).forEach(print);
		
		System.out.println("\n\nUsando composição....");
		marcas.stream()
		.map(Util.maiuscula)
		.map(Util.primeiraLetra)
		.map(Util::grito)
		.forEach(print);
	}
}
