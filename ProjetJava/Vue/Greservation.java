package vue;

import java.awt.*;
import javax.swing.*; 

public class Greservation extends JFrame {

	    
      JLabel label = new JLabel("Gérer les réservations");
        JLabel label1 = new JLabel("Quelle action voulez vous effectuer :");
		JButton b1=new JButton("Voir les disponibilitées");
		JButton b2=new JButton("Ajouter une réservation");
		JButton b3=new JButton("Annuler un séjour ");
        
      public Greservation() {
      this.add(label);

      this.add(label1); 
      
      this.setTitle("Bienvenue sur le site de gestion de l'hôtel");
      JPanel fenetreA = new JPanel();
      this.getContentPane().add(fenetreA);
      fenetreA.setLayout(new BorderLayout());
      fenetreA.add(BorderLayout.NORTH, label);
      fenetreA.add(BorderLayout.CENTER, label1);

      //Faire les boutons
  	JPanel panneauB = new JPanel();
  	GridLayout position = new GridLayout(1,4);

  	panneauB.add(b1); 
  	panneauB.add(b2);
  	panneauB.add(b3);

  	fenetreA.add(BorderLayout.SOUTH, panneauB);
  	

      this.setVisible(true);
      this.pack();
      }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Greservation();
	}

}
