package examen1_diegomaradiaga;

public class NumComplejos {
    private Real real;
    private Imaginario imaginario;

    public NumComplejos() {
    }

    public NumComplejos(Real real, Imaginario imaginario) {
        this.real = real;
        this.imaginario = imaginario;
    }

    public Real getReal() {
        return real;
    }

    public void setReal(Real real) {
        this.real = real;
    }

    public Imaginario getImaginario() {
        return imaginario;
    }

    public void setImaginario(Imaginario imaginario) {
        this.imaginario = imaginario;
    }


    @Override
    public String toString() {
        return "Numero Complejo {"+real+" + " +imaginario+" ";
    }
    
    
}
