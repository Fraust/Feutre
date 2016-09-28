package afficher;

import java.awt.*;// bibliothèque graphique originale
import javax.swing.*;// bibliothèque graphique plus 'moderne' qui respecte les Design Pattern

public class FrmAffichageText {
   JFrame frmTableau;
   JTextArea txtTableau;
   JPanel pnlTableau;
   JScrollPane sclTableau;

   public FrmAffichageText(int hauteur, int largeur,int x, int y, String titre) {
 	   //   fenêtre
	   frmTableau = new JFrame(titre);
	   //   taille par défaut
	   //frmTableau.setSize(50, 50);
	   //	 zone de texte
	   txtTableau = new JTextArea(hauteur,largeur);
	   //	 les ascenceurs sont le container de txtTableau
	   sclTableau = new JScrollPane(txtTableau);
	   //	 super container
	   pnlTableau = new JPanel();
	   //    permet d'ajouter les enfants les uns à la suite des autres
       pnlTableau.setLayout(new FlowLayout());
       //    ajoute le container scl (ascenceur) au panel
       pnlTableau.add(sclTableau);
       //    ajoute mon panel au centre de ma fenêtre
       frmTableau.getContentPane().add(pnlTableau, FlowLayout.LEFT);
       //    sort si l'on clique sur fermeture
       frmTableau.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       //    interdit d'écrire dedans car ne donne pas le focus
       txtTableau.setFocusable(false);
       //     réorganise la fenêtre en dimension
       frmTableau.pack();
       //    ajuste la position dans l'écran
       frmTableau.setLocation(x,y);
       //        affiche la fenêtre
       frmTableau.setVisible(true);
   }

   public FrmAffichageText() {
	   this(10,10,0,0,"Sans Titre");
   }

   public FrmAffichageText(String title) {
	   this(10,10,0,0,title);
   }

   public FrmAffichageText(int hauteur, int largeur,int x, int y) {
	   this(hauteur,largeur,x,y,"Sans Titre");
   }

   public FrmAffichageText(int hauteur, int largeur) {
	   this(hauteur,largeur,0,0,"Sans Titre");
   }
   public JFrame getFrame(){
	   return frmTableau;
   }

   public void setAffichage(char texte){
	   txtTableau.append(Character.toString(texte));
   }

   public void setAffichage(String texte){
	   txtTableau.append(texte);
   }

}


