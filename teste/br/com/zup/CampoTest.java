package br.com.zup;

import static org.junit.Assert.*;

import org.junit.Test;

public class CampoTest {
	private Campo campo = new Campo(5, 5);
	private Rover rover = new Rover(3,3,'N');
	
	
	@Test
	public void naoDevePermitirMovimentarRoverSeCoordenadaNegativa(){
		assertFalse(campo.isAndar(-1, -6));
	}
	
	@Test
	public void naoDevePermitirMovimentarRoverSeCoordenadaMaior(){
		assertFalse(campo.isAndar(10, 4));
	}
}
