package controleur;

import java.awt.*;
import java.awt.event.ActionEvent;

import javax.swing.*; 
import vue.*;

public class Caccueil {
	public void actionPerfomed(ActionEvent e) {
		if(((JButton)e.getSource()).getText().equals("Gestion des réservations")){
			new Greservation();
		}
	}
}
