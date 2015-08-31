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
public abstract class Character {
    protected RestorationMagicBehavior restorationMagic;
    protected DestructionMagicBehavior destructionMagic;
    
    public abstract void heal();
    
    public abstract void fight();
    
    public void setRestorationMagic(RestorationMagicBehavior r) {
        this.restorationMagic = r;
    }
    
    public void setDestructionMagic(DestructionMagicBehavior d) {
        this.destructionMagic = d;
    }
}
