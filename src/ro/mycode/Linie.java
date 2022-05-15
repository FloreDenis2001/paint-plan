package ro.mycode;

public class Linie implements Figura {
    private Punct punct1;
    private Punct punct2;

    public Linie(Punct punct1, Punct punct2) {
        this.punct1 = punct1;
        this.punct2 = punct2;
    }

    public Punct getPunct1() {
        return punct1;
    }

    public void setPunct1(Punct punct1) {
        this.punct1 = punct1;
    }

    public Punct getPunct2() {
        return punct2;
    }

    public void setPunct2(Punct punct2) {
        this.punct2 = punct2;
    }

    @Override
    public void translate(int dim) {
        this.punct1.translate(dim);
        this.punct2.translate(dim);
    }

    @Override
    public void afisare() {
        System.out.println("Linie cu coordonatele");
        System.out.println(this.punct1);
        System.out.println(this.punct2);
    }

    @Override
    public Figura duplicare() {

        return  new Linie(this.punct1,this.punct2);
    }
}
