package afficher;

public class TableauBlanc {
		
	private String contenu;
	private FrmAffichageText fenetre;
	
	public TableauBlanc(String titre) {
		this(20,100,0,0,titre);
	}
	
	public TableauBlanc(int hauteur, int largeur, int x, int y, String titre) {
		contenu = new String();
		fenetre = new FrmAffichageText(hauteur,largeur,x,y,titre);
	}	
	
	public void afficher(String texte){
		fenetre.setAffichage(texte);
		contenu += texte;
	}
	
}
