/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Manoela
 */
public class Tabela extends AbstractTableModel{
    
    private ArrayList linha = null;   
    private String[] coluna = null; // armazenar o nome das colunas
    
    public Tabela(ArrayList i, String[] j){
        setLinha(i);
        setColuna(j);
    }
    
     public ArrayList getLinha() {
        return linha;
    }

    public void setLinha(ArrayList dados) {
        this.linha = dados;
    }

    public String[] getColuna() {
        return coluna;
    }

    public void setColuna(String[] nomeColuna) {
        this.coluna = nomeColuna;
    }
    
    public int getColumnCount(){
        return coluna.length; // qtd decaracteres q terá na coluna
    }
    
    public int getRowCount(){
        return linha.size(); //qnts elementos no array
    }
    
    public String getColumnName(int qtdColuna){
        return coluna[qtdColuna]; // retorna os nomes
        
    }
    
    public Object getValueAt(int qtdLinha, int qtdColuna){ //inform. para montar a tabela
        Object[] linha = (Object[])getLinha().get(qtdLinha); // objeto recebe o nuero de linhas q foi passado por parâmetro
        return linha[qtdColuna]; //retorna para a tabela linhas q foram passadas(dados) de acordo com o número de colunas
    }
}
