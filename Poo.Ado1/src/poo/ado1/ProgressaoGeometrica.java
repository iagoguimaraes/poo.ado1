/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.ado1;

/**
 *
 * @author iago.guimaraes
 */
public class ProgressaoGeometrica {
    // Colocar a lista de atributos que achar necessário.
    private int valorInicial;
    private int razao;
    private int valorAtual;
    
    public ProgressaoGeometrica(int valorInicial, int razao) {
        // implementar o código do construtor.
        this.valorAtual = valorInicial;
        this.valorInicial = valorInicial;
        this.razao = razao;       
    }

    public void proximoValor() {
        // implementar o código
        this.valorAtual *= this.razao;       
    }

    public int valorAtual() {
        // implementar o código
        return this.valorAtual;
    }
}
