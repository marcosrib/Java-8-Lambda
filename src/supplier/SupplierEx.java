package supplier;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

import org.junit.Test;

public class SupplierEx {
	@Test
	public void pub() {
		Supplier<List<String>> umList = () -> Arrays.asList("Ana", "Bia");
		System.out.println(umList.get());
	}
}
