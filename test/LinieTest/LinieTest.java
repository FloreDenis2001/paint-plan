package LinieTest;

import org.junit.jupiter.api.Test;
import ro.mycode.*;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class LinieTest {
    @Test
    public void test(){


        ArrayList<Figura> figuras=new ArrayList<>();
        figuras.add(new Linie(new Punct(4,5),new Punct(3,7)));
        figuras.add(new Linie(new Punct(2,6),new Punct(4,2)));
        figuras.add(new Linie(new Punct(9,1),new Punct(5,7)));
        figuras.add(new Dreptunghi(new Punct(4,3),new Punct(3,2),new Punct(4,7),new Punct(9,3)));
        figuras.add(new Dreptunghi(new Punct(5,2),new Punct(2,7),new Punct(3,8),new Punct(4,3)));
        figuras.add(new Eticheta(new Punct(5,2),new Punct(2,7),new Punct(3,8),new Punct(4,3),"text1"));
        figuras.add(new Eticheta(new Punct(9,1),new Punct(4,7),new Punct(5,2),new Punct(6,5),"text2"));
        figuras.add(new Eticheta(new Punct(4,2),new Punct(3,1),new Punct(2,1),new Punct(7,6),"text3"));


       Desen desen = new Desen(figuras);


       desen.afisare();

    }

}