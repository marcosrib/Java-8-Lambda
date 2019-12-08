package streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

import org.junit.Test;

public class ImprimindoObjetos {
	@Test
	public void name() {
		List<String> aprovados = Arrays.asList("Lu", "Gui", "luca");
		System.out.println("usando o foreach");
        for( String nome: aprovados) {
        	System.out.println(nome);
        }
        
        System.out.println("\nUsando iterator");
        Iterator<String> it = aprovados.iterator();
        while(it.hasNext()) {
        	System.out.println(it.next());
        }
        
        System.out.println("\nUsando Stream....");
        Stream<String> stream = aprovados.stream();
        stream.forEach(System.out::println);
	}
}
