package br.com.zup;
/**
 * Classe Campo(plato)
 * @author dioni
 *
 */
public class Campo {
	private static double eixoX;
	private static double eixoY;
	/**
	 * Construtor Campo(plato)
	 * @param x
	 * @param y
	 */
	Campo(double x, double y){
		Campo.eixoX = x;
		Campo.eixoY = y;
	}
	/**
	 * metodo verifica se movimento ultrapassará limite do campo(plato)
	 * @param x
	 * @param y
	 * @return
	 */
	public static boolean isAndar(int x, int y){
		if((x >= 0 && x <= Campo.getEixoX()) && (y >= 0 && y <= Campo.getEixoY())){
			return true;
		}else{
			return false;
		}
	}
	//getter e setters
	public static double getEixoX() {
		return eixoX;
	}

	public void setEixoX(double eixoX) {
		Campo.eixoX = eixoX;
	}

	public static double getEixoY() {
		return eixoY;
	}

	public void setEixoY(double eixoY) {
		Campo.eixoY = eixoY;
	}
}
