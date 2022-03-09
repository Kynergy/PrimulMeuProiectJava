import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<AparatFrigorific> aparate = new ArrayList<>();
        aparate.add(new AparatFrigorific(330, "Beko", 2500));
        aparate.add(new AparatFrigorific(250, "Indesit", 3800));
        aparate.add(new Congelator(330, "Arctic", 2800, 5));
        aparate.add(new Congelator(120, "Electrolux", 1800, -15));
        aparate.add(new LadaFrigorifica(200, "Hot Point", 1550, -8, 91));
        aparate.add(new LadaFrigorifica(255, "Candy", 2456, -10, 98));
        aparate.add(new SidebySide(150, "Samsung", 1550, 3));
        aparate.add(new SidebySide(250, "Whirpool", 2570, 7));
        aparate.add(new Frigider(180, "Ariston", 1880, 5));
        aparate.add(new Frigider(300, "Bosch", 2890, 8));

        prezentareLista(aparate);
        PretMediu(aparate);
        CapacitateMedie(aparate);
        //AfiseazaPret(aparate);
         //Putere(aparate);

        System.out.println();
        System.out.println("Numarul lazilor frigorifice din lista este : " + numar(aparate));
        System.out.println("Numarul frigiderelor din lista este : " + numar2(aparate));
        // System.out.println("Puterea mai mare d " + Putere(aparate));


    }

    public static void prezentareLista(ArrayList<AparatFrigorific> aparate) {
        for (var aparat : aparate) {
            aparat.afisare();
        }
    }


    public static int numar(ArrayList<AparatFrigorific> aparate) {
        int nr = 0;
        int n = 0;
        for (var aparat : aparate) {
            if (aparat.getClass() == LadaFrigorifica.class)
                nr++;
        }
        return nr;
    }

    public static int numar2(ArrayList<AparatFrigorific> aparate) {

        int n = 0;
        for (var aparat : aparate) {
            if (aparat.getClass() == Frigider.class)
                n++;
        }
        return n;
    }

    public static double PretMediu(ArrayList<AparatFrigorific> aparate) {
        double sum = 0;

        for (var aparat : aparate) {
            sum += aparat.pret;


        }
        double avg = sum / aparate.size();
        System.out.println("Media Preturilor aparatelor este: " + avg);

        return avg;
    }

  /* public static ArrayList<AparatFrigorific> AfiseazaPret(ArrayList<AparatFrigorific>aparate){

         int z, y;
         Scanner myObj = new Scanner(System.in);
         System.out.println("Introduceti primul pret: ");
         z = myObj.nextInt();

         System.out.println("Introduceti cel de-al doilea pret: ");
         y = myObj.nextInt();
         int intervalPret = new HashSet<>();
         ArrayList<AparatFrigorific>finala = new ArrayList<>();
         for (var aparat : aparate) {

         }
         for (var i :intervalPret) {

             AparatFrigorific rez = null;
             int rezultat = rez.getPret();

             for (var aparat : aparate) {
                 if (aparate.getClass() == i && (rezultat >= z) && (rezultat <= y)) {
                     rez = aparat;
                     intervalPret = aparat.pret;
                 }
             }
             finala.add(rez);
         }
         return finala;

     }*/
  /* public static int Putere (ArrayList<LadaFrigorifica> aparate){
        int a =0;
        for (var aparat:aparate){
            if(aparat.getClass() == LadaFrigorifica.class){
                return a++;
            }
        }
        return a;
    }*/

    public static void CapacitateMedie(ArrayList<AparatFrigorific> aparate) {
        double sum = 0;

        for (var aparat : aparate) {
            sum += aparat.capacitate;


        }
        double avg = sum / aparate.size();
        System.out.println("Capacitatea medie a aparatelor este: " + avg);

    }
}






