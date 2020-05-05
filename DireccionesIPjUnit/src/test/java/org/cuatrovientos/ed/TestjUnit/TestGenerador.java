package org.cuatrovientos.ed.TestjUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.cuatrovientos.ed.jUnitDireccionesIP.GeneradorIp;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import junit.extensions.ActiveTestSuite;
import junit.extensions.RepeatedTest;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class TestGenerador extends TestCase {

	private GeneradorIp direccion;
	
	public TestGenerador(String testMethodName) {
		super(testMethodName);
	}
	
	@BeforeEach
	public void setUp() throws Exception {
		direccion = new GeneradorIp();
	}

	@AfterEach
	public void tearDown() throws Exception {
	}

	@Test
	void testGenerarNumero() {
		int num = direccion.generarNumero(0,255);
		assertTrue("Los n�meros se crean correctamente",num>0);
		assertTrue("Los n�mero se crean correctamente",num<255);
		
	}

	@Test
	void testGenerarIP() {
		String ip = direccion.generarIP();
		assertFalse("El n�mero por el que empieza es cero",ip.startsWith("0"));
	}
	
	public static TestSuite suite() {
		TestSuite mySuite = new ActiveTestSuite();
		
		mySuite.addTest(new RepeatedTest(new TestGenerador("testGenerarNumero"), 1));
		mySuite.addTest(new RepeatedTest(new TestGenerador("testGenerarNumero"), 1000));
		
		return mySuite;
		
	}
	

}
