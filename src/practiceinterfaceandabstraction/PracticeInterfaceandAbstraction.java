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
        Scanner keyboard = new Scanner(System.in);
        int name;
 
        Rex metalgear1 = new Rex();
        Ray metalgear2 = new Ray();
        Gekko metalgear3 = new Gekko();
        
        System.out.println("What version of Metal Gear is it?");
        //3 versions of Metal Gear were made Ray, Rex
        name = keyboard.nextInt();
        if (name == 1){
            metalgear1.setPiolt("Ocelot");
            System.out.println("Piolted by " + metalgear1.getPiolt());
            metalgear1.destroy();
        } else if (name == 2) {
            metalgear2.setPiolt("Liquid Snake");
            System.out.println("Piolted by " + metalgear2.getPiolt());
            metalgear2.destroy();
        } else if (name == 3) {
            metalgear3.setPiolt("Artifical Intelligence");
            System.out.println("Piolted by " + metalgear3.getPiolt());
            metalgear3.destroy();
        }
        else {
            System.out.println("An unknown Metal Gear");
        }
        
        
    }
    
}
