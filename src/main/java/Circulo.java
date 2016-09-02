import java.util.List;

/**
 * Created by alumno on 02/09/16.
 */
public class Circulo implements Figura {

    public int radio;

    public Circulo (int radio){
        this.radio=radio;
    }

    public double area() {
        return (Math.PI * (this.radio* this.radio));
    }

    public double perimetro() {
        return (Math.PI * this.radio);
    }

}
