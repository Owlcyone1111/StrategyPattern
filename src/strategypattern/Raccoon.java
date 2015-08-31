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
public class Raccoon extends Character {
    @Override
    public void heal() {
        restorationMagic.useMagic();
    }
    
    @Override
    public void fight() {
        destructionMagic.useMagic();
    }
}
