package br.com.zup;

public class MeuTesteZup {

	public static void main(String[] args) {
		//Criar matriz
		new Campo(5, 5);
		//criar rover
		Rover rover = new Rover(3,3,'E');
		//receber coordenadas
		rover.coordenadas("MMRMMRMRRM");
		System.out.println(rover.getEixoX()+ " "+ rover.getEixoY()+" "+rover.getDirecao().getNome());
		
		
	}

}
