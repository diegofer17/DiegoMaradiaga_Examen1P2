package examen1_diegomaradiaga;

import java.awt.Color;
import java.util.ArrayList;

public class Conjunto {
    private String color;
    private ArrayList <NumComplejos> conjunto = new ArrayList();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public ArrayList<NumComplejos> getconjunto() {
        return conjunto;
    }

    public void setconjunto(ArrayList<NumComplejos> conjunto) {
        this.conjunto = conjunto;
    }

    @Override
    public String toString() {
        return "Conjunto{" + "Color=" + color + ", Conjunto=" + conjunto + '}';
    }
    
    
}
