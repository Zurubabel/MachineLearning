/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import classes.DadosRegressao;
import classes.RegressaoLinear;
import java.util.ArrayList;

/**
 *
 * @author Aulas
 */
public class Principal {
    
    public static void main(String args[]) {
        // Exemplo de dados
        ArrayList<DadosRegressao> dadosRegressao = new ArrayList<>();
        dadosRegressao.add(new DadosRegressao(1,1));
        dadosRegressao.add(new DadosRegressao(2,2));
        dadosRegressao.add(new DadosRegressao(3,3));
        
        RegressaoLinear r = new RegressaoLinear(dadosRegressao);
        
        System.out.println(r.retornarFuncaoCusto());
        
        
    }
    
}
