/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import classes.RegressaoLinear;

/**
 *
 * @author Aulas
 */
public class Principal {
    
    public static void main(String args[]) {
        RegressaoLinear r = new RegressaoLinear();
        
        System.out.println(r.retornarPredicao(7));
        
        
    }
    
}
