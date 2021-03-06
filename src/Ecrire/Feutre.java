/**************************************************************************
* Source File	:  Feutre.java
* Author                   :  Lycee Bertran de Born  
* Project name         :  Non enregistr�* Created                 :  14/09/2016
* Modified   	:  14/09/2016
* Description	:  Definition of the class Feutre
**************************************************************************/
package Ecrire;

import afficher.TableauBlanc;
import afficher.Erreur;
import java.util.Objects;


public  class Feutre  
{ 
    private Boolean estBouche;
    private static TableauBlanc tableau = null;
    private static Erreur sortieErr = null;
    private Reservoir encre;
        
    public Feutre(){
        estBouche = true;
        encre = new Reservoir();
        if(null == tableau){
            tableau = new TableauBlanc("Tab");
        }
        if(null == sortieErr){
            sortieErr = new Erreur("Erreur");
        }
    }
    
    public Feutre(int capacite, String couleur, TableauBlanc tab){
        estBouche = true;
        encre = new Reservoir(capacite, couleur);
        tableau = tab;
    }
    
    public Feutre(int capacite, String couleur, TableauBlanc tab, Erreur err){
        estBouche = true;
        encre = new Reservoir(capacite, couleur);
        tableau = tab;
        sortieErr = err;
    }
    
    public boolean estBouche() {
        return estBouche;
    }
	
    public void boucher() {
        estBouche = true;
        erreur("!!!! Le feutre est bouché");
        erreur("\n");
    }
	
    public void deboucher() {
        estBouche = false;
        erreur("!!!! Le feutre est débouché");
        erreur("\n");
    }
	
    public void ecrire(String texte) {
        
        int limite_encre = encre.getNvEncre();
        int long_chaine = texte.length();
        
        if((long_chaine < limite_encre) && !estBouche()){
                afficher(texte);
                afficher("\n");
                encre.decNvEncre(long_chaine);
        }else{
            if(!estBouche() && long_chaine >0){
                String tempo_chaine = "";
                for(int i=0;i<limite_encre;i++ ){
                    tempo_chaine += texte.charAt(i);
                }
                afficher(tempo_chaine);
                afficher("\n");
                encre.decNvEncre(tempo_chaine.length());
                erreur("#### PLUS D\'ENCRE !");
                erreur("\n");
            }else{
                erreur("#### DEBOUCHE LE FEUTRE !");
                erreur("\n");
            } 
        }
        erreur("!!!! Il reste : "+encre.getNvEncre()+" caractères dans mon reservoir");
        erreur("\n");
    }	
    
    private void erreur(String texte){
        sortieErr.afficher(texte);
    }
 
    
    private void afficher(String texte){
        tableau.afficher(texte);
    }
    
    public Reservoir getEncre(){
        return encre;
    }
    
    public TableauBlanc getTableau(){
        return tableau;
    }
    
    public Erreur getErreur(){
        return sortieErr;
    }

    public void getInfoFeutre(){
        afficher(toString());
        System.out.println(toString());
        erreur(toString());
    }
     
    @Override
    public String toString() {
       String xml;
       
       xml = "<Feutre>" +"\n"
               + "   <Reservoir>" +"\n"
                    + "       " + encre.toString() +"\n"
               + "   </Reservoir>" +"\n"
               + "   <EstBouche>" +"\n"
                    + "       " + estBouche.toString()+"\n"
               + "   </EstBouche>" +"\n"
               + "   <Tableau>" +"\n"
                    + "       " + tableau.toString()+"\n"
               + "   </Tableau>" +"\n"
            + "</Feutre>";
       return xml;
    }
    
    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.estBouche);
        hash = 79 * hash + Objects.hashCode(this.encre);
        return hash;
    }

    

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Feutre other = (Feutre) obj;
        if (!Objects.equals(this.estBouche, other.estBouche)) {
            return false;
        }
        if (!Objects.equals(this.encre, other.encre)) {
            return false;
        }
        return true;
    }

    
    
    
}


