package classes;

import java.util.ArrayList;
import java.util.List;

/*
    y = a * bx
    ho(x) = a * bx
    Gradient Descent = 1/(2m) * E(ho(x) - y)^ 2
    

*/

public class RegressaoLinear {
    private List<DadosRegressao> listaDadosRegressao;
    private double t0;
    private double t1;
    
    public RegressaoLinear(List<DadosRegressao> dadosRegressao) {
        this.t0 = 1;
        this.t1 = 0;
        
        this.listaDadosRegressao = dadosRegressao;
    }
    
    public double retornarPredicao(double x) {
        return this.t0 + this.t1 * x;
    }
    
    public double retornarFuncaoCusto() {
        double soma = 0; 
        for(DadosRegressao d : this.listaDadosRegressao) {
            soma += Math.pow((retornarPredicao(d.x) - d.y), 2);
        }
        return soma / (2 * this.listaDadosRegressao.size()) ;
    }

    public double getT0() {
        return t0;
    }

    public void setT0(double t0) {
        this.t0 = t0;
    }

    public double getT1() {
        return t1;
    }

    public void setT1(double t1) {
        this.t1 = t1;
    }    
}
