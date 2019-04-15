import java.util.Vector;

public class Main {

    public static int NB_PLACES = 2;

    public static void main(String[] args) {

        Vector<Voiture> voitures = new Vector<>(5);

        voitures.add(new Voiture(1, "Renault", ""));
        voitures.add(new Voiture(2, "Chevrolet", ""));
        voitures.add(new Voiture(3, "Dodge", ""));
        voitures.add(new Voiture(4, "Seat", ""));
        voitures.add(new Voiture(5, "Opel", ""));

        for (Voiture v: voitures ){
            new Thread(v).start();
        }
    }
}
