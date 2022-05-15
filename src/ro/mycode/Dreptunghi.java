package ro.mycode;

public class Dreptunghi implements Figura {
    protected Punct punct1;
    protected Punct punct2;
    protected Punct punct3;
    protected Punct punct4;

    public Dreptunghi(Punct punct1, Punct punct2, Punct punct3, Punct punct4) {
        this.punct1 = punct1;
        this.punct2 = punct2;
        this.punct3 = punct3;
        this.punct4 = punct4;
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

    public Punct getPunct3() {
        return punct3;
    }

    public void setPunct3(Punct punct3) {
        this.punct3 = punct3;
    }

    public Punct getPunct4() {
        return punct4;
    }

    public void setPunct4(Punct punct4) {
        this.punct4 = punct4;
    }

    @Override
    public void translate(int dim) {
        this.punct1.translate(dim);
        this.punct2.translate(dim);
        this.punct3.translate(dim);
        this.punct4.translate(dim);
    }

    @Override
    public void afisare() {
        System.out.println("Punctele Dreptunghiului sunt ");
        System.out.println(this.punct1);
        System.out.println(this.punct2);
        System.out.println(this.punct3);
        System.out.println(this.punct4);
    }

    @Override
    public Figura duplicare() {
        return new Dreptunghi(punct1,punct2,punct3,punct4);
    }
}
