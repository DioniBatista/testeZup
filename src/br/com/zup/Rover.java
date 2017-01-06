package br.com.zup;
/**
 * Classe Rover
 * @author dioni
 *
 */
public class Rover {

	private int eixoX;
	private int eixoY;
	private DirecaoEnum direcao;
	/**
	 * Construtor Rover
	 * @param x
	 * @param y
	 * @param direcao
	 */
	public Rover(int x, int y, char direcao){
		this.setEixoX(x);
		this.setEixoY(y);
		switch (direcao) {
		case 'N': this.setDirecao(DirecaoEnum.North);			
			break;
		case 'E': this.setDirecao(DirecaoEnum.East);
			break;
		case 'S': this.setDirecao(DirecaoEnum.South);
			break;
		case 'W': this.setDirecao(DirecaoEnum.West);
		break;

		default: throw new IllegalArgumentException("Direção incorreta: "+ direcao);
		}
	}
/**
 * Metodo recebe coordenadas Rover
 * @param coordenadas
 */
	public void coordenadas(String coordenadas){
		for(char c : coordenadas.toUpperCase().toCharArray()){
			try{
				switch (c) {
					case  'R': alterarDirecao(MovimentosEnum.Right);				
						break;
					case 'L': alterarDirecao(MovimentosEnum.Left);
						break;
					case 'M': andar();
						break;
		
					default: throw new IllegalArgumentException("Coordenada incorreta: "+ c);
				}
			}catch(IllegalArgumentException e){
				System.out.println(e.getMessage());
				//descomentar para gerar excecao para o Junit
				//throw e; 
			}
		}
	}
	/**
	 * metodo altera direcao Rover Right - Left
	 * @param movimento
	 */
	public void alterarDirecao(MovimentosEnum movimento){
		if(movimento.equals(MovimentosEnum.Right)){
			if(this.getDirecao().equals(DirecaoEnum.West)){
				this.setDirecao(DirecaoEnum.North);
			}else{
				this.setDirecao(DirecaoEnum.getPorId(this.getDirecao().getId() + 1));
			}
		}else if(movimento.equals(MovimentosEnum.Left)){
			if(this.getDirecao().equals(DirecaoEnum.North)){
				this.setDirecao(DirecaoEnum.West);
			}else{
				this.setDirecao(DirecaoEnum.getPorId(this.getDirecao().getId() - 1));
			}
		}
	}
	/**
	 * metodo movimento Rover N - S - E - W
	 */
	public void andar(){
		switch (this.getDirecao()) {
		case  North: this.setEixoY(this.getEixoY() + 1);				
			break;
		case South: this.setEixoY(this.getEixoY() - 1);
			break;
		case East: this.setEixoX(this.getEixoX() + 1);
			break;
		case West: this.setEixoX(this.getEixoX() - 1);;
			break;
		}
	}
//getters e setter
	public DirecaoEnum getDirecao() {
		return direcao;
	}

	public void setDirecao(DirecaoEnum direcao) {
		this.direcao = direcao;
	}

	public int getEixoY() {
		return eixoY;
	}

	public void setEixoY(int eixoY) {
		//Verifica se o movimento ultrapassa plato
		try{
			if(Campo.isAndar(this.getEixoX(), eixoY)){
				this.eixoY = eixoY;
			}else{
				throw new IndexOutOfBoundsException("Movimento excede campo('plato') eixoY:" + eixoY+".\n Mantido posição anterior: " + this.eixoY);
			}
		}catch(IndexOutOfBoundsException i){
			System.out.println(i.getMessage());
			//descomentar para gerar excecao para o Junit
			//throw i; 
		}
		
	}

	public int getEixoX() {
		return eixoX;
	}

	public void setEixoX(int eixoX) {
		//Verifica se o movimento ultrapassa plato
		try{
			if(Campo.isAndar(eixoX, this.getEixoY())){
				this.eixoX = eixoX;
			}else{
				throw new IndexOutOfBoundsException("Movimento excede campo('plato') eixoX:" + eixoX+".\n Mantido posição anterior: " + this.eixoX);
			}
		}catch(IndexOutOfBoundsException i){
			System.out.println(i.getMessage());
			//descomentar para gerar excecao para o Junit
			//throw i; 
		}
	}
}
