package iso;

import org.junit.Before;
import org.junit.jupiter.api.Test;


class Ejercicio2Test {
	private Ejercicio2 e;
	@Before
	public void setUp() throws Exception 
	{
      e = new Ejercicio2();
	}
	
	@Test
	public void testcalculaCaso() {
		e.calculaCaso(4);
		e.calculaCaso(150);
		e.calculaCaso(250);
		e.calculaCaso(350);
		e.calculaCaso(600);
	}

	@Test
	public void testcalcula() {
		e.calcula(10, 25, true, true, false, false, 0);
		e.calcula(10, 25, true, false, false, false, 0);
		e.calcula(70, 25, true, false, false, false, 0);
		e.calcula(10, 25, false, false, false, false, 1);
		e.calcula(70, 25, false, false, false, false, 1);
		e.calcula(10, 25, true, false, false, false, 2);
		e.calcula(70, 25, true, false, false, false, 2);
		e.calcula(10, 25, true, false, false, false, 3);
		e.calcula(70, 25, false, false, false, false, 3);
		e.calcula(10, 25, true, false, false, false, 4);
		e.calcula(70, 25, true, false, false, false, 4);


	}
	
	@Test
	public void testMain() {
		e.main(null);
	}

}
