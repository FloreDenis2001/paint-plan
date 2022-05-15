package ro.mycode;

import java.util.ArrayList;

public class Desen {

    private ArrayList<Figura>figuras;

    public Desen(ArrayList<Figura>figuras){
        this.figuras=figuras;
    }
    //3 metode cerute //afisare duplicare si translate
    public void afisare(){
        for(Figura x:figuras){

            x.afisare();
        }
    }

    public Desen duplicate(){
        ArrayList<Figura>figuri= new ArrayList<>();
        figuri.addAll(this.figuras);
        return new Desen(figuri) ;
    }

    public void translate(int dim){
        for (Figura x:figuras){
            x.translate(dim);
        }
    }


}
