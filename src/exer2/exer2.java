package exer2;

import org.junit.Test;

public class exer2 {
    @Test
	public void exer8() {
		Calabresa calabresa = new Calabresa();
		Napolitana napolitana = new Napolitana();
		Forno forno = new Forno();
		forno.assar(calabresa);
		forno.assar(napolitana);
	}
}
