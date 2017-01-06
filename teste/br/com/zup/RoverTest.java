package br.com.zup;

import org.junit.Test;

public class RoverTest {
	private Rover rover;
	private Campo campo = new Campo(5, 5);
	
	@Test(expected = IllegalArgumentException.class)
	public void naoDeveAceitarDirecoesDiferentesNESW(){
		this.rover = new Rover(3,3,'X');
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void naoDeveAceitarCoordenadasDiferentesRLM(){
		this.rover = new Rover(3,3,'N');
		this.rover.coordenadas("MMRMMRMXRRM");
	}
	
	@Test(expected = IndexOutOfBoundsException.class)
	public void naoDeveAndarSeMovimentoMaiorQueCampo() throws Exception{
		this.rover = new Rover(3,10,'N');
		this.rover.coordenadas("MMRMMRMRRM");
	}
}
