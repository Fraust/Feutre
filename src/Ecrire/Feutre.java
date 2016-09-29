/**************************************************************************
* Source File	:  Feutre.java
* Author                   :  Lycee Bertran de Born  
* Project name         :  Non enregistr�* Created                 :  14/09/2016
* Modified   	:  14/09/2016
* Description	:  Definition of the class Feutre
**************************************************************************/
package Ecrire;

import afficher.TableauBlanc;


public  class Feutre  
{ 
    private Boolean estBouche;
    private static TableauBlanc tableau = null;
    Reservoir encre;
        
    public Feutre(){
        estBouche = true;
        encre = new Reservoir();
        if(null == tableau){
            tableau = new TableauBlanc("Tab");
        }
    }
    
    public Feutre(int capacite, String couleur, TableauBlanc tab){
        estBouche = true;
        encre = new Reservoir(capacite, couleur);
        tableau = tab;
    }
    
    public boolean estBouche() {
        return estBouche;
    }
	
    public void boucher() {
        estBouche = true;
        System.err.println("!!!! Le feutre est bouché");
    }
	
    public void deboucher() {
        estBouche = false;
        System.err.println("!!!! Le feutre est débouché");
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
                System.err.println("#### PLUS D\'ENCRE !");
            }else{
                System.err.println("#### DEBOUCHE LE FEUTRE !");
            } 
        }
        System.err.println("!!!! Il reste : "+encre.getNvEncre()+" caractères dans mon reservoir");
        
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
}


