import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JVoiture extends JFrame {

    private JLabel jEtat;

    public JVoiture(int num, String nom, String etat) {
        super(nom);
        //fermeture avec croix rouge
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        // creation des composants
        setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));

        jEtat = new JLabel(etat);
        add(jEtat);
        setEtat(etat);
        pack();
        setSize(300, 60);

        // nombre de voiture logeables sur une ligne
        int screenWidth = Toolkit.getDefaultToolkit().getScreenSize().width;

        int nb = (screenWidth - 100) / 300;
        int nbx = num % nb;
        int nby = num / nb;

        setLocation(50 + 300 * nbx, 100 + 100 * nby);
        setVisible(true);
    }

    public void setEtat(String etat) {
        jEtat.setText(etat);
        if (etat.equals("Je roule")) {
            getContentPane().setBackground(Color.green);
        }
        if (etat.equals("Je suis garé")) {
            getContentPane().setBackground(Color.blue);
        }
        if (etat.equals("J'attends une place")) {
            getContentPane().setBackground(Color.red);
        }

    }


}
