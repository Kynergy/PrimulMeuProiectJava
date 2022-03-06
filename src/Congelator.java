import java.net.StandardSocketOptions;
import java.nio.file.FileSystemNotFoundException;

public class Congelator extends AparatFrigorific{
    public int temp;

    public Congelator(int capacitate, String producator, int pret, int temp) {
        super(capacitate, producator, pret);
        this.temp = temp;
    }

    public void afisare(){
        System.out.println("Congelator cu capacitatea de: " + capacitate + "l" + ", produs de: " + producator + " si cu pretul de: " + pret + " lei " + "are temperatura minima: " + temp + " grade C");
    }


}
