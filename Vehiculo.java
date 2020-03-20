/**
 * Clase Vehiculo
 * @author david
 * @version 1
 */
public class Vehiculo {
  /**
   * num_serie es el numero de serie del vehiculo
   * fabricante especifica el fabricante del vehículo
   * color especifica el color del vehiculo
   */
  protected int num_serie;
  protected String fabricante;
  protected Color color;

  public Vehiculo() {
    super();
  }
  
  /**
   * 
   * @return color 
   */
  public Color getColor() {
  	return color;
  }
  
  /**
   * 
   * @param color
   */
  public void setColor(Color color) {
  	this.color = color;
  }

  /**
   * 
   * @return num_serie
   */
  public int getNum_serie() {
  	return num_serie;
  }

  /**
   * 
   * @param num_serie
   */
  public void setNum_serie(int num_serie) {
  	this.num_serie = num_serie;
  }

  /**
   * 
   * @return fabricante
   */
  public String getFabricante() {
  	return fabricante;
  }

  /**
   * 
   * @param fabricante
   */
  public void setFabricante(String fabricante) {
  	this.fabricante = fabricante;
  }

}