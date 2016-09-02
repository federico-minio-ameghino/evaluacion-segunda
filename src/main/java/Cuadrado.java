import java.util.List;

/**
 * Created by damian on 26/08/16.
 */
public class Cuadrado implements Figura {
    public int lado;

    public Cuadrado(int i) {

        this.lado = i;
    }

    public double area() {
        return (this.lado * this.lado);
    }

    public double perimetro() {
        return (this.lado * 4);
    }

    public double sumarAreasDeCuadrados(List<Cuadrado> cuadrados) {
        double sum = 0;
        for (Cuadrado c : cuadrados) {
            sum = sum + c.area();
        }
        return sum;
    }


    public double sumarAreasDeFiguras(List<Figura> figuras) {
        double sum =0;
        for (Figura c : figuras){
            sum = sum +c.area();
        }
        return sum;
    }
}





