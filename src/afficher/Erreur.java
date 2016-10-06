/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package afficher;

import java.awt.Color;

/**
 *
 * @author sostac
 */
public class Erreur {
        private String contenu;
        private boolean estGraphique  = true;
	private AffichageTxt fenetre;
        private Color texte;
        private Color fond;
        
	
	public Erreur(String titre) {
		this(20,30,0,0,titre);
	}
	
	public Erreur(int hauteur, int largeur, int x, int y, String titre) {
		contenu = new String();
                if(estGraphique){
                    fenetre = new FrmAffichageTextCouleur(hauteur,largeur,x,y,titre,texte.RED,fond.BLACK);

                }else{
                    fenetre = new Console();
                }	
	}	
	
	public void afficher(String texte){
		fenetre.setAffichage(texte);
		contenu += texte;
	}
}
