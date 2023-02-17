package examen1_diegomaradiaga;

import java.awt.Color;

public class Exponencial extends Real{
    private int base;
    private int exponente;

    public Exponencial() {
        super();
    }

    public Exponencial(int base, int exponente) throws ExcepcionNumeral {
        this.base = base;
        this.setExponente(exponente);
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getExponente() {
        return exponente;
    }

    public void setExponente(int exponente) throws ExcepcionNumeral{
        if (exponente>0&&exponente<=10){
            this.exponente = exponente;
        } else{
            throw new ExcepcionNumeral(Color.yellow, "El exponente no puede ser mayor de diez");
        }
        
    }

    @Override
    public String toString() {
        return "Exponencial{"+ base + "^" + exponente + "}";
    }
    @Override
    public int valornumerico() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
