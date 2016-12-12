package classes;

/*
    y = a * bx
    ho(x) = a * bx
    Gradient Descent = 1/(2m) * E(ho(x) - y)^ 2
    

*/

public class RegressaoLinear {
    
    private double t0;
    private double t1;
    
    public RegressaoLinear() {
        this.t0 = 5;
        this.t1 = 1;
    }
    
    public double retornarPredicao(double x) {
        return this.t0 + this.t1 * x;
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
