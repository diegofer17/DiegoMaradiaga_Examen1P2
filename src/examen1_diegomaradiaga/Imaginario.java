package examen1_diegomaradiaga;

public class Imaginario {
    private int real;

    public Imaginario() {
    }

    
    public Imaginario(int real) {
        this.real = real;
    }

    public int getReal() {
        return real;
    }

    public void setReal(int real) {
        this.real = real;
    }

    @Override
    public String toString() {
        return  real + "i";
    }
    
    
    
}
