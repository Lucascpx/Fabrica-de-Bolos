/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FabicaBolos;


public class Choconinho extends AbstractBolo {

    public Choconinho() {
    }
    
    @Override
    public void sobreoBolo() {
        System.out.println("Massa doce, leite ninho e chocolate.");
        super.sobreoBolo(); 
    }

    @Override
    public void receita() {
        System.out.println("Receita: Leite em pó, leite, manteiga, ovo, açúcar,"
                + " \noléo, cacau em pó, fermento e farinha de trigo.");
        super.receita(); 
    }
}