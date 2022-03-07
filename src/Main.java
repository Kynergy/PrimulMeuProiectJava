import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

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
        //CapacitatMedie(aparate);
        AfiseazaPret(aparate);

        System.out.println();
        System.out.println("Numarul lazilor frigorifice din lista este : " + numar(aparate));
        System.out.println("Numarul frigiderelor din lista este : " + numar2(aparate));


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

    public static int PretMediu(ArrayList<AparatFrigorific> aparate) {
        int sum = 0;

        for (var aparat : aparate) {
            sum += aparat.getPret(aparat);

        }
        int avg = sum / aparate.size();
        System.out.println("Media Preturilor aparatelor este: " + avg);

        return sum;
    }

   /* public static ArrayList<AparatFrigorific>CapacitatMedie(ArrayList<AparatFrigorific>aparate){
        Set<Class<?>> capacitate = new HashSet<>();
        ArrayList<AparatFrigorific> finala = new ArrayList<>();
        for(var aparat :aparate){
            capacitate.add(aparat.getClass());
        }
        for(var x:capacitate){
           AparatFrigorific rez = null;
            int total = 0;
          // int capacitate = 0;
           for(var aparat:aparate){
               if ((aparat.getClass() == x)) && (total += aparat.getCapacitate()))){
                   total += aparat.getCapacitate();
                   rez = aparat;
               }
               int avg = total / aparate.size();
           }
            finala.add(rez);
        }
        return finala;
    }
    }
    */
   /*public static int CapacitateMedie (ArrayList<AparatFrigorific> aparate) {
       int total = 0;

       for (var aparat : aparate) {
           total += aparat.getCapacitate(aparat);

       }
       int avg = total / aparate.size();
       System.out.println("Capacitatea medie a aparatelor aparatelor este: " + avg);

       return total;
   }
}*/

    public static ArrayList<AparatFrigorific> AfiseazaPret(ArrayList<AparatFrigorific>aparate){

        int y, z;
        Scanner myObj = new Scanner(System.in);
        System.out.println("Introduceti primul pret: ");
        z = myObj.nextInt();

        System.out.println("Introduceti cel de-al doilea pret: ");
        y = myObj.nextInt();
        Set <Class<?>> intervalPret = new HashSet<>();
        ArrayList<AparatFrigorific>finala = new ArrayList<>();
        for (var i : intervalPret) {
            intervalPret.add(aparate.getClass());
        }
        for (var i :intervalPret){

            AparatFrigorific aparat = null;
            int rezultat = aparat.getClass();
            if ((rezultat >= z) && (rezultat <= y)) {
                aparat = aparat;
                intervalPret = aparat.pret();
                return rezultat;
            }
        }
        finala.add(aparat);
    }



}







