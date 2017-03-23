
package poo.ado1;

public class ProgressaoGeometrica extends SequenciaNumerica {
    private int valorInicial;
    private int razao;
    
    public ProgressaoGeometrica(int valorInicial, int razao) {
        super(valorInicial);
        this.valorInicial = valorInicial;
        this.razao = razao;        
    }

    public void proximoValor() {
        this.valorAtual *= this.razao;       
    }
    
}