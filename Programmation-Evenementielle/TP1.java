import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TP1{
    public static void main(String[] args){
        //----Fenetre
        JFrame fenetre = new  JFrame("Premiere fenetre java");
        fenetre.setSize(400,200);
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenetre.setLayout(new FlowLayout());

        // ---Composents
        String textInitial = "Bonjour, monde !";      //<- ajout
        JLabel label = new JLabel(textInitial);        //<- modifié
        // JLabel label = new JLabel("Bonjour, monde!");
        JButton bouton = new JButton("Cliquer ici");
        JButton btnReset =new  JButton("Réinitialiser");    //<- ajout

        //---composent de clis 
        final int [] compteur = {0};

      bouton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e){

            
            compteur[0]++;
            label.setText("Vous avez clique : "+compteur[0]+" fois");
            JOptionPane.showMessageDialog(
                fenetre, 
                "Vous avez cliqué "+compteur[0]+" fois !"
            );

            //Desactiver le bouton apres 5 clis
            if(compteur[0]==5){
                bouton.setEnabled(false);
                
                JOptionPane.showMessageDialog(fenetre,
                    "Limite atteinte !",
                    "Attention",
                JOptionPane.WARNING_MESSAGE
                );
                }
         }
      });

      
      // --Evenement : reinitialisation
      btnReset.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                compteur[0] = 0;
                label.setText(textInitial);
               // bouton.setEnabled(true);
            }
      });
        // ----ajouts de composants
        fenetre.add(bouton);
        fenetre.add(btnReset);
        fenetre.add(label);
        //Affichage
        fenetre.setVisible(true);

    }
}
