/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practiceinterfaceandabstraction;
import java.util.Scanner;
/**
 *
 * @author Scott
 */
public class PracticeInterfaceandAbstraction {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ray metalgear1 = new Ray();
        Rex metalgear2 = new Rex();
        metalgear1.setPiolt("Ocelot");
        metalgear2.setPiolt("Liquid Snake");
        
        System.out.println("Piolted by " + metalgear1.getPiolt());
        metalgear1.destroy();
        System.out.println("Piolted by " + metalgear2.getPiolt());
        metalgear2.destroy();
    }
    
}
