/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategypattern;

/**
 *
 * @author Samowl
 */
public class StrategyPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Owl o = new Owl();
        o.setRestorationMagic(new WardBehavior());
        System.out.println("Owl: ");
        o.heal();
        
        Raccoon r = new Raccoon();
        r.setDestructionMagic(new FlamesBehavior());
        System.out.println("Raccoon: ");
        r.fight();
    }
    
}
