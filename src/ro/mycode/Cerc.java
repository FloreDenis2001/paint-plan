package ro.mycode;

public class Cerc implements Figura {
    private Punct punct;
    private int raza;

    public Cerc(Punct punct, int raza) {
        this.punct = punct;
        this.raza = raza;
    }

    public Punct getPunct() {
        return punct;
    }

    public void setPunct(Punct punct) {
        this.punct = punct;
    }

    public int getRaza() {
        return raza;
    }

    public void setRaza(int raza) {
        this.raza = raza;
    }

    @Override
    public void translate(int dim) {
        this.punct.translate(dim);
    }

    @Override
    public void afisare() {
        System.out.println("Dimensiunile Cercului sunt : ");
        System.out.println(this.punct);
        System.out.println("Raza = " + this.raza);
    }

    @Override
    public Figura duplicare() {
        return new Cerc(this.punct, this.raza);
    }
}
