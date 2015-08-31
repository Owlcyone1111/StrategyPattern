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
public class FlamesBehavior implements DestructionMagicBehavior {

    @Override
    public void useMagic() {
        System.out.println("Burning!");
    }
    
}
