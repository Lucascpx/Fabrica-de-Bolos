/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FabicaBolos;


public class FlorestaNegra extends AbstractBolo {

    public FlorestaNegra() {     
    }
    
    @Override
    public void sobreoBolo() {
        System.out.println("Massa doce de chocolate, chantilly e cerejas.");
        super.sobreoBolo(); 
    }

    @Override
    public void receita() {
        System.out.println("Receita: Essência de baunilha, cereja, água, chocolate em pó, "
                + "\novo, açúcar, creme de leite, fermento e farinha de trigo.");
        super.receita(); 
    }
}