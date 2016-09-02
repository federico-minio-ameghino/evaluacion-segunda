/**
 * Created by alumno on 02/09/16.
 */

public class Rectangulo implements Figura {
    int base;
    int altura;

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public double area() {

        return (this.base * this.altura);
    }

    public double perimetro() {
        return (2 * this.base + 2 * this.altura);
    }

}