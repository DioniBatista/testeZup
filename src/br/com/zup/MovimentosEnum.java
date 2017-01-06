package br.com.zup;
/**
 * Enum de movimentos 
 * @author dioni
 *
 */
public enum MovimentosEnum {
	Move('M'),
	Right('R'),
	Left('L');
	
	private char nome;
	
	MovimentosEnum(char valor){
		this.setNome(valor);
	}
	//getter e setters
	public char getNome() {
		return nome;
	}

	public void setNome(char nome) {
		this.nome = nome;
	}
}
