public class Voiture extends JVoiture implements Runnable {

    public final static int MIN = 1000;
    public final static int MAX = 5000;

    public Voiture(int num, String nom, String etat) {
        super(num, nom, etat);
    }

    @Override
    public void run() {

            try{
                while(true) {
                    this.setEtat("Je roule");
                    try {
                        Thread.sleep(MIN + (int)(Math.random() * ((MAX - MIN) + 1)));
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    while(Main.NB_PLACES == 0) {
                            this.setEtat("J'attends une place");
                            try {
                                Thread.sleep(1000);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                    --Main.NB_PLACES;
                    this.setEtat("Je suis garé");
                    Thread.sleep(MIN + (int)(Math.random() * ((MAX - MIN) + 1)));
                    ++Main.NB_PLACES;
                    }

                }catch (InterruptedException e) {
                e.printStackTrace();}

        }

    }
