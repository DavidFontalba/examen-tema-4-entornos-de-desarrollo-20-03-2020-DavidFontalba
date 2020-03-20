/**
 * @author Jaime Rabasco Ronda
 */
/*Refactorización
Extrae una superclase Vehículo con los campos
	num_serie
	fabricante
	color
y los métodos
	getNum_serie(), setNum_serie()
	getFabricante(), setFabricante()
	getColor(), setColor()*/
enum Color {
	ROJO, AZUL, VERDE, AMARILLO, NARANJA
};

/**
 * Clase coche que extiende de la superclase Vehiculo
 * @author david
 * @version 1
 */
public class Coche extends Vehiculo {
	private int cilindrada;
	protected Coche(int num_serie, int cilindrada, String fabricante, Color color) {
		this.num_serie = num_serie;
		this.cilindrada = cilindrada;
		this.fabricante = fabricante;
		this.color = color;
	}
	
	/**
	 * 
	 * @return cilindrada
	 */
	public int getCilindrada() {
		return cilindrada;
	}

	
	/**
	 * 
	 * @param cilindrada
	 */
	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

}
