/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FabicaBolos;


public class Prestigio extends AbstractBolo {
    
    public Prestigio() {
    }
    
    @Override
    public void sobreoBolo() {
        System.out.println("Massa doce de chocolate, coco e chocolate.");
        super.sobreoBolo(); 
    }

    @Override
    public void receita() {
        System.out.println("Receita: Coco ralado, leite, chocolate em pó, leite de coco, "
                + "\nmargarina, ovo, açúcar, oléo, fermento e farinha de trigo");
        super.receita(); 
    }
}
