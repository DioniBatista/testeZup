package br.com.zup;
/**
 * Enum Direcao
 * @author dioni
 *
 */
public enum DirecaoEnum {
	North(0,'N'),
	East(1,'E'),
	South(2,'S'),
	West(3,'W');
	
	private char nome;
	private int id;
	
	DirecaoEnum(int id, char valor){
		this.id = id;
		this.setNome(valor);
	}
	//getter e setters
	public static DirecaoEnum getPorId(int id) {
	    for(DirecaoEnum e : values()) {
	        if(e.id == id) return e;
	    }
	    return null;
	 }

	public char getNome() {
		return nome;
	}

	public void setNome(char nome) {
		this.nome = nome;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
