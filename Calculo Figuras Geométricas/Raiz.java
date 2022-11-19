import javax.swing.JOptionPane;
public class Raiz {

    private int a;
    private int b;
    private int c;
    private double x1;
    private double x2;
    private double delta;

    public Raiz(){}

    public Raiz(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }
    public void setA(int a) {
        this.a = a;
    }
    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public double calculaDelta(){
        delta = (b * b) + (-4*a*c);
        return delta;
    }
   
    public double calculaX1(){
        if(this.calculaDelta() < 0){
            JOptionPane.showMessageDialog(null, "Delta não possui raiz real");
            return 0;
        }
        else{
            x1 =  (-b + Math.sqrt(this.calculaDelta())) / (2 * a);
            return x1;
        }
    }
        
    public double calculaX2(){
        if(delta < 0){
            JOptionPane.showMessageDialog(null, "Delta não possui raiz real");
            return 0;
        }
        else{
            x2 = (-b - Math.sqrt(this.calculaDelta())) / (2 * a);
            return x2;
        }   
    }   

    public void solicitaDados(){

        a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de A: "));
        b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de B: "));
        c = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de C: "));
        
    }

    public void imprimeDados(){
        JOptionPane.showMessageDialog(null, "A: " + a + "\nB: " + b + "\nC: " + c + "\n\n" + "\nX1: " + this.calculaX1() + "\nX2: " + this.calculaX2());
        
    }

    
}