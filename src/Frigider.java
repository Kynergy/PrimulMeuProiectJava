public class Frigider extends AparatFrigorific {
    public int rafturi;

    public Frigider(int capacitate, String producator, int pret, int rafturi) {
        super(capacitate, producator, pret);
        this.rafturi = rafturi;
    }

    public void afisare() {
        System.out.println("Frigider cu capacitatea de: " + capacitate + "l" + ", produs de: " + producator + " si cu pretul de: " + pret + " lei" + " are: " + rafturi + " rafturi");
    }
}

