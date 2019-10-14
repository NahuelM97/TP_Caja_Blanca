package test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import modelo.Empleado;
import modelo.Hijo;

public class EmpleadoTestCajaBlanca {
	
	private Empleado empleado;

	@Before
    public void setUp() throws Exception
    {
        empleado = new Empleado("1236123");
    }

    @After
    public void tearDown() throws Exception
    {
    }

    @BeforeClass
    public static void setUpBeforeClass() throws Exception //antes del primer metodo!!
    {
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception //despues del ultimo metodo!!!
    {
    }
	
	
	@Test
    public void testT1() { //tests sin hijos
    	
    	double resultadoReal=empleado.getIncremento(10000);
    	double resultadoEsperado=0;
    	Assert.assertEquals(resultadoEsperado,resultadoReal,0.01);
    	
    }
	
	@Test
	public void testT2() {
		for(int i =0;i<6;i++)
			empleado.agregarHijo(new Hijo("pepito"+i, 2009, 1, 1));
		double resultadoReal=empleado.getIncremento(10000);
    	double resultadoEsperado=3500;
    	Assert.assertEquals(resultadoEsperado,resultadoReal,0.01);
	}
	
	@Test
	public void testT3() {
		for(int i =0;i<1;i++)
			empleado.agregarHijo(new Hijo("pepito"+i, 1994, 1, 1));
		double resultadoReal=empleado.getIncremento(10000);
    	double resultadoEsperado=0;
    	Assert.assertEquals(resultadoEsperado,resultadoReal,0.01);
	}
	
	@Test
	public void testT4() {
		for(int i =0;i<1;i++)
			empleado.agregarHijo(new Hijo("pepito"+i, 2000, 1, 1));
		double resultadoReal=empleado.getIncremento(10000);
    	double resultadoEsperado=1000;
    	Assert.assertEquals(resultadoEsperado,resultadoReal,0.01);
	}
	
}
