import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LadaFrigorifica extends Congelator {
    public int putere;
    public boolean getPutere;


    public LadaFrigorifica(int capacitate, String producator, int pret, int temp, int putere) {
        super(capacitate, producator, pret, temp);
        this.putere = putere;
    }

    public void afisare() {
        System.out.println("Lada frigorifica cu capacitatea de: " + capacitate + " produsa de " + producator + " are pretul: " + pret + " ,puterea de: " + putere + " si temperatura minima de: " + temp);
    }
}


