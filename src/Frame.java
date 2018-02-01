import javax.swing.*;
import java.awt.*;
public class Frame extends JFrame {
    JPanel2 pannel=new JPanel2();
    int ll,lc;




    public Frame(int ll,int lc) {
        super("Cyka nuggets");
        this.lc=lc;
        this.ll=ll;
        setSize(10*5*this.lc, 10*5*this.ll);
        setResizable(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //pannel.setLayout(new GridLayout(2*this.ll, 2*lc));

    }

    public void dessinerMatrice(List grille){
        pannel = new JPanel2(grille,ll,lc);
    }


    class JPanel2 extends JPanel{

        List grille;
        int ligne,colonne;

        public JPanel2(){
            super();
            grille = null;
            ligne = colonne = 0;

        }
        public JPanel2(List grille,int  ligne, int colonne){
            this.grille = grille;
            this.ligne = ligne;
            this.colonne = colonne;
        }

        @Override
        public void paintComponent(Graphics g){
            Maillon a = grille.tete;
            while(a!=null){
                g.fillOval(10*(this.colonne+a.getColonne()),10*(this.ligne+a.getLigne()),10,10);
                a=a.getSuiv();
            }


        }

    }




}