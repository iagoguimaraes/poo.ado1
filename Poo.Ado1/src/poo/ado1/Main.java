
package poo.ado1;

public class Main {

    public static void main(String[] args) {
        
        System.out.println("Teste da progressao geometrica");
        ProgressaoGeometrica pg = new ProgressaoGeometrica(1, 3);
        for (int i = 0; i < 5; i++) {
            System.out.print(pg.valorAtual() + " ");
            pg.proximoValor();
        }
              
        System.out.println();
        
        System.out.println("Teste do fatorial");
        Fatorial fatorial = new Fatorial();
        for (int i = 0; i < 5; i++) {
            System.out.print(fatorial.valorAtual() + " ");
            fatorial.proximoValor();
        }
             
    }
}
