/**************************************************************************
* Source File	:  Reservoir.java
* Author                   :  Lycee Bertran de Born  
* Project name         :  Non enregistr�* Created                 :  14/09/2016
* Modified   	:  14/09/2016
* Description	:  Definition of the class Reservoir
**************************************************************************/


package Ecrire;



public  class Reservoir  
{ 
    private int nvEncre;
    private String libCouleur;

    public Reservoir(int nb, String lib){
        if(nb<0){
            nvEncre=100;
        }else{
            nvEncre = nb;
        }
        libCouleur = lib;
    }
    
    public Reservoir(){
        this(100,"bleu");
    }
    
    public Reservoir(String lib){
        this(100,lib);
    }
    public void setCouleur(String couleur){
        libCouleur = couleur;
    }
    
    public String getCouleur()
    {
        return libCouleur;
    }
	
    public int getNvEncre()
    {
        return nvEncre;
    }
	
    public void decNvEncre()
    {
        if(0 < nvEncre){
            nvEncre --;
        }
        
    }
    
    public void decNvEncre(int nbcarac)
    {
        if(nvEncre-nbcarac < 0 ){
            nvEncre = 0;
        }else{
            nvEncre -= nbcarac;
        }
    }
    
    public boolean estVide()
    {
        return (0>= nvEncre);
    }
    
    public void AfficherCouleur(){
        System.out.println(libCouleur);
    }
} 


