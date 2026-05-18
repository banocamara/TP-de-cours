import javax.swing.*;
import java.awt.*;


public class TP1{
    public static void main(String[] args){
        //---Fenetre
        JFrame fenetre = new JFrame("Premiere Fenetre Java");
        fenetre.setSize(400,200);
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenetre.setLayout(new FlowLayout());
        fenetre.setVisible(true);

        //---composants
        JLabel label = new JLabel("Bonjour, monde!");
        JButton bouton = new JButton("Cliquer ici");

        
        fenetre.add(label);
        fenetre.add(bouton);
        fenetre.setVisible(true);
    }
}