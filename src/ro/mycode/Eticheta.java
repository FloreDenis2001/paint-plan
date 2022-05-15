package ro.mycode;

public class Eticheta extends Dreptunghi{
    private String descriere;

    public Eticheta(Punct punct1, Punct punct2, Punct punct3, Punct punct4, String descriere) {
        super(punct1, punct2, punct3, punct4);
        this.descriere = descriere;
    }

    public String getDescriere() {
        return descriere;
    }

    public void setDescriere(String descriere) {
        this.descriere = descriere;
    }

    @Override
    public void afisare(){
        System.out.println("Datele Etichetei sunt : ");
        System.out.println(this.punct1);
        System.out.println(this.punct2);
        System.out.println(this.punct3);
        System.out.println(this.punct4);
        System.out.println(this.descriere);
    }

    @Override
    public Figura duplicare(){
        return new Eticheta(punct1,punct2,punct3,punct4,descriere);
    }

}
