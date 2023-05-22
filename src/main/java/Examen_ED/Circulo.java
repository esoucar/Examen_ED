package Examen_ED;
/**
 * Clase Circulo.
 * Almacena informacion y metodos para operar sobre un circulo.
 * @author Erick
 * @version 1.0
 */

public class Circulo {
    
    private double radio;
    private String color;
    private static int numCirculos;
    
    /**
     * Constructor de la clase Circulo.
     * @param radio  el radio del circulo
     * @param color el color del circulo
     */
    public Circulo(double radio, String color) {
        this.radio = radio;
        this.color = color;
    }

    /**
     * Getters y setters para los atributos de la clase
     */  
    /**
     * Metodo getRadio.
     * @return el radio del circulo
     */
    public double getRadio() {
        return radio;
    }

    /**
     * Metodo setRadio.
     * @param radio el radio a establecer
     */
    public void setRadio(double radio) {
        this.radio = radio;
    }

    /**
     * Metodo getColor.
     * @return el color del circulo
     */
    public String getColor() {
        return color;
    }

    /**
     * Metodo setColor.
     * @param color el color a establecer
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Metodo getNumCirculos.
     * @return el numero de circulos
     */
    public static int getNumCirculos() {
        return numCirculos;
    }

    /**
     * Metodo setNumCirculos.
     * @param aNumCirculos el numero de circulos a establecer
     */
    public static void setNumCirculos(int aNumCirculos) {
        numCirculos = aNumCirculos;
    }

    /**
     * Método calculoArea
     * Calcula el area del circulo si el radio es mayor que cero.
     * @return el area del circulo
     */
    public double calculoArea(){
        if (this.getRadio()<0)
            throw new IllegalArgumentException("Radio negativo");
        return (Math.pow(getRadio(), 2)*Math.PI);
    }
    
    /**
     * Método calculoPerimetro
     * Calcula el perimetro del circulo si su valor es mayor que 0 o menor que 100
     * @return el perimetro del circulo
     * @throws Exception mensaje de error
     */
    public double calculoPerimetro()throws Exception{
        if (this.getRadio()<0)
            throw new Exception ("Radio negativo");
        else if(getRadio()>=100)
            throw new Exception ("Radio muy grande");
        else 
            return (2*Math.PI*this.getRadio());
    }   
}
