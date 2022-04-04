

package FabicaBolos;


public class TesteFabrica {
    public static void main(String[] args) {
        
        Abacaxi abacaxi = new Abacaxi();
        
       abacaxi.setNome("Bolo de abacaxi");          
       abacaxi.setTipo("Sobremesa");      
       abacaxi.setValor(20.00f);     
        System.out.println("Sabor: "+abacaxi.getNome());       
        System.out.println("Tipo: "+abacaxi.getTipo());        
        System.out.println("Valor: " + abacaxi.getValor()+ "R$");       
        abacaxi.sobreoBolo();       
        abacaxi.receita();
        
        System.out.println("\t");
        
        Choconinho choconinho= new Choconinho();       
       choconinho.setNome("Bolo de choconinho");          
       choconinho.setTipo("Sobremesa");      
       choconinho.setValor(22.50f);     
        System.out.println("Sabor: "+choconinho.getNome());       
        System.out.println("Tipo: "+choconinho.getTipo());        
        System.out.println("Valor: "+choconinho.getValor()+ " R$");       
        choconinho.sobreoBolo();       
        choconinho.receita();
        
        System.out.println("\t");
        
        FlorestaNegra florestanegra = new FlorestaNegra();      
       florestanegra.setNome("Bolo de floresta negra");          
       florestanegra.setTipo("Sobremesa");      
       florestanegra.setValor(28.00f);     
        System.out.println("Sabor: "+florestanegra.getNome());       
        System.out.println("Tipo: "+florestanegra.getTipo());        
        System.out.println("Valor: "+florestanegra.getValor()+ " R$");       
        florestanegra.sobreoBolo();       
        florestanegra.receita();
        
        System.out.println("\t");
        
        Prestigio prestigio = new Prestigio();
       prestigio.setNome("Bolo de prestigio");          
       prestigio.setTipo("Sobremesa");      
       prestigio.setValor(25.00f);     
        System.out.println("Sabor: "+prestigio.getNome());       
        System.out.println("Tipo: "+prestigio.getTipo());        
        System.out.println("Valor: "+prestigio.getValor()+ " R$");       
        prestigio.sobreoBolo();       
        prestigio.receita();
        
        
  
    }
    
}
