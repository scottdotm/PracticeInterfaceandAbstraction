/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practiceinterfaceandabstraction;

/**
 *
 * @author Scott
 */
public class Ray extends MetalGear implements Destruction {
    
    public void destroy(){
        System.out.println("Metal Gear Ray lauches a missle barrage, devistating the landscape and decimating buildings");
    }
}
