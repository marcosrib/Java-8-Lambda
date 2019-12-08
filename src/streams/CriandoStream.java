package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

import org.junit.Test;

public class CriandoStream {
	@Test
	public void name() {
		Consumer<Object> print = System.out::println;

		Stream<String> langs = Stream.of("java ", "lua ", "JS\n");
		langs.forEach(print);

		String[] maisLangs = { "Python ", "Lisp ", "Perl ", "Go\n" };

		Stream.of(maisLangs).forEach(print);
		Arrays.stream(maisLangs).forEach(print);
		Arrays.stream(maisLangs, 1, 4).forEach(print);

		List<String> outrasLangs = Arrays.asList("C ", "PHP ", "kotlin\n");
		outrasLangs.stream().forEach(print);
		outrasLangs.parallelStream().forEach(print);

		//Stream.generate(() -> "a").forEach(print);
		//	1zsStream.iterate(0, n -> n + 1).forEach(print);
	}
}
