package examen1_diegomaradiaga;

import java.awt.Color;

public class Racional extends Real{
    private int numerador;
    private int denominador;

    public Racional() {
        super();
    }

    public Racional(int numerador, int denominador) throws ExcepcionNumeral {
        this.numerador = numerador;
        this.setDenominador(denominador);
    }

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) throws ExcepcionNumeral{
        if(denominador!=0){
            this.denominador = denominador;
        }else{
            throw new ExcepcionNumeral(Color.red, "El denominador no puede ser 0");
        }
        
    }

    @Override
    public String toString() {
        return "Racional{" + numerador + "/" + denominador + "}";
    }
    
    @Override
    public int valornumerico() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
