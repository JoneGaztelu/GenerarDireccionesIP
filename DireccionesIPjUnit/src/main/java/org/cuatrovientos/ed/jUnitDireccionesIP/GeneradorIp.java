package org.cuatrovientos.ed.jUnitDireccionesIP;

import java.util.Random;

public class GeneradorIp {
	Random rnd = new Random();
	
	public int generarNumero(int min, int max) {
		int numero =rnd.nextInt(max);
		return numero;
	}
	
	public String generarIP() {
		String direccionIp="";
		
		for(int i=0; i<3;i++) {
			int num = generarNumero(0,255);
			if (i==3) {
				direccionIp = direccionIp + num;
			}else {
				direccionIp = (num + ".");
			}
			
		}
		return direccionIp;
	}
}
