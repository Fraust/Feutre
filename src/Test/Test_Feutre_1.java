/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;
import Ecrire.Feutre;
import afficher.Erreur;
import afficher.TableauBlanc;
/**
 *
 * @author Sostac
 */
public class Test_Feutre_1 {

    /**
     * @param args the command line arguments
     */
    static Feutre monFeutre; 
    
    
    public static void ecrireBcp(Feutre nomF){
        int i;
        for(i=0;i<100;i++){
            monFeutre.ecrire("Je ecry bocoup ");
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        monFeutre = new Feutre();
        monFeutre.deboucher();
        ecrireBcp(monFeutre);
    }   
}
