
package poo.ado1;

public class Fatorial extends SequenciaNumerica {
    
    private int fatorial;
    
    public Fatorial() {
        super(1);
        this.fatorial = 0;
    }

    public void proximoValor() {  
        this.valorAtual *= ++fatorial;      
    }
}