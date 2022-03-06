import java.util.ArrayList;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        AparatFrigorific a = new AparatFrigorific(330, "Beko", 2500);
        AparatFrigorific a2 = new AparatFrigorific(250,"Indesit", 3800);
        Congelator c = new Congelator(330,"Arctic", 2800, 5);
        Congelator c1 = new Congelator(120, "Electrolux", 1800, -15);
        LadaFrigorifica l = new LadaFrigorifica(200, "Hot Point", 1550, -8, 91);
        LadaFrigorifica l2 = new LadaFrigorifica(255, "Candy", 2456, -10, 98);
        SidebySide s = new SidebySide(150, "Samsung",1550,3);
        SidebySide s2 = new SidebySide(250, "Whirpool",2570,7);
        Frigider f = new Frigider(180,"Ariston", 1880,5);
        Frigider f2 = new Frigider(300,"Bosch", 2890,8);
        a.afisare();
        a2.afisare();
        c.afisare();
        c1.afisare();
        l.afisare();
        l2.afisare();
        s.afisare();
        s2.afisare();
        f.afisare();
        f2.afisare();

    }



    }