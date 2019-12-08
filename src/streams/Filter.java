package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

import org.junit.Test;

public class Filter {
	@Test
	public void name() {
		Aluno a1 = new Aluno("Ana", 7.8);
		Aluno a2 = new Aluno("Bia", 5.8);
		Aluno a3 = new Aluno("Daniel", 9.8);
		Aluno a4 = new Aluno("Gui", 6.8);
		Aluno a5 = new Aluno("Barbara", 7.1);
		Aluno a6 = new Aluno("Pedro", 8.8);

		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6);
		Predicate<Aluno> aprovado = a -> a.nota >= 7;
		Function<Aluno, String> saudacaoAproado = a -> "Parabéns  " + a.nome + "! você foi aprovado!!";

		alunos.parallelStream()
			.filter(aprovado)
			.map(saudacaoAproado)
			.forEach(System.out::println);

	}
}
