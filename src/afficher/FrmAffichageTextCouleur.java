/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package afficher;

import java.awt.Color;

/**
 *
 * @author sylvain
 */
public class FrmAffichageTextCouleur extends FrmAffichageText {
    
    
    public FrmAffichageTextCouleur(int hauteur, int largeur,int x, int y, String titre, Color couleurForeground, Color couleurBackground) {
        super(hauteur, largeur, x,y,titre);
        this.getTxtTableau().setForeground(couleurForeground);
        this.getTxtTableau().setBackground(couleurBackground);
        
    }
    
    public FrmAffichageTextCouleur(int hauteur, int largeur,int x, int y, String titre) {
        this(hauteur, largeur,x,y,titre,new Color(0xFF0000),new Color(0x000000));
        
    }
}
