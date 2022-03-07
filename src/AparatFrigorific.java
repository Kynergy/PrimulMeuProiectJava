public class AparatFrigorific {
    int capacitate;
    String producator;
    int pret;
    public AparatFrigorific(){
        capacitate = 0;
        producator = "null";
        pret = 0;
    }

    public int getCapacitate() {
        return capacitate;
    }

    public void setCapacitate(int capacitate) {
        this.capacitate = capacitate;
    }

    public String getProducator() {
        return producator;
    }

    public void setProducator(String producator) {
        this.producator = producator;
    }

    public int getPret(AparatFrigorific aparat) {
        return pret;
    }

    public void setPret(int pret) {
        this.pret = pret;
    }

    public AparatFrigorific(int capacitate, String producator, int pret){
        this.capacitate = capacitate;
        this.producator = producator;
        this.pret = pret;

    }
    public void afisare(){
        System.out.println("Aparat frigorific cu capacitatea de: " + capacitate + "l" + ", produs de: " + producator + " si cu pretul de: " + pret + " lei");

    }

    public int getPret() {
        return 0;
    }
}
