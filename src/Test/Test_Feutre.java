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
public class Test_Feutre {

    /**
     * @param args the command line arguments
     */
    static Feutre monFeutre; 
    static Feutre monFeutre2;
    static Feutre monFeutre3;
    static Feutre monFeutre4;
    static Feutre monFeutre5;
    static TableauBlanc monTableau;
    public static void main(String[] args) {
        // TODO code application logic here
        monFeutre = new Feutre();
        monFeutre2 = new Feutre();
        monFeutre2.deboucher();
        monFeutre.ecrire("Bonjour le monde 1");
        monFeutre.deboucher();
        monFeutre.ecrire("Bonjour le monde 2! ");
        monFeutre2.ecrire("Bonjour le monde Feutre 2");
        monFeutre.ecrire("Bonjour le monde 3! ");
        
        
        monFeutre5 = new Feutre(100, "Rouge", monFeutre.getTableau(), monFeutre.getErreur());
        monFeutre5.deboucher();
        monFeutre5.ecrire("FF15");
        //monFeutre.ecrire(monFeutre.toString());
        monFeutre.getInfoFeutre();
        /*
        monFeutre5 = new Feutre(100, "Rouge", new TableauBlanc("test"), new Erreur("testErr"));
        monFeutre5.deboucher();
        monFeutre5.ecrire("FF14");*/
    }
    
}
