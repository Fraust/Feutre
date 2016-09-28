/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;
import Ecrire.Feutre;
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
    static TableauBlanc monTableau;
    public static void main(String[] args) {
        // TODO code application logic here
        monFeutre = new Feutre();
        monFeutre2 = new Feutre();
        monTableau = new TableauBlanc("Tableau colla");
        monFeutre2.deboucher();
        monFeutre.ecrire("Bonjour le monde 1");
        monFeutre.deboucher();
        monFeutre.ecrire("Bonjour le monde 2! ");
        monFeutre2.ecrire("Bonjour le monde Feutre 2");
        monFeutre.ecrire("Bonjour le monde 3! ");
        
        monFeutre.ecrire("Feutre 1",monTableau);
        monFeutre2.ecrire("Feutre 2",monTableau);
        
        monFeutre3 = new Feutre(100, "bleu",monTableau);
        monFeutre3.deboucher();
        monFeutre3.ecrire("F3");
        
        monFeutre4 = new Feutre(100, "bleu",monTableau);
        monFeutre4.deboucher();
        monFeutre4.ecrire("F4");
    }
    
}
