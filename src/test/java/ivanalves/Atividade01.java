package ivanalves;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Atividade01 {

	@Test
	@DisplayName("Atividade 01")
	public void validarsoma() {
			
		int soma = 0;
		int entrrada1 = 9;
		int entreda2 = 1;
		
		soma = entrrada1 + entreda2;		
		Assertions.assertEquals(10, soma);

	}
}
