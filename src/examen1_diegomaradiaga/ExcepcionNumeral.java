package examen1_diegomaradiaga;

import java.awt.Color;

public class ExcepcionNumeral extends Exception{
    private Color c;

    public ExcepcionNumeral() {
        super();
    }

    public ExcepcionNumeral(Color c, String message) {
        super(message);
        this.c = c;
    }

    public Color getC() {
        return c;
    }

    public void setC(Color c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "Excepcion{" + "Color=" + c + '}';
    }
}
