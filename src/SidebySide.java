public class SidebySide extends Frigider{
    public int rafturi;
    public SidebySide(int capacitate, String producator, int pret, int rafturi) {
        super(capacitate, producator, pret, rafturi);
        this.rafturi =rafturi;
    }
    public void afisare(){
        System.out.println("Aparat Side by Side cu capacitatea de: " + capacitate + "l" + ", produs de: " + producator + " si cu pretul de: " + pret + " lei" + " are: " +  rafturi + " rafturi");

    }
}
