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
public class Fatorial {

    private int valorAtual;
    private int fatorial;
    
    public Fatorial() {
        // implementar o código do construtor.
        this.valorAtual = 1;
        this.fatorial = 0;
    }

    public void proximoValor() {
        // implementar o código      
        this.valorAtual *= ++fatorial;      
    }

    public int valorAtual() {
        // implementar o código       
        return this.valorAtual;       
    }

}
