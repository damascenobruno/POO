import javax.swing.JOptionPane;
public class Quadrado extends Ponto{

    private double lado;
 
    public Quadrado() {
    }

    public Quadrado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double calculaArea(){
        setX(lado*lado);
        return getX() ;
    }

    public double calculaPerimetro(){
        setY(lado*4);
        return getY() ;
    }

    public void solicitaDados(){

    lado = Double.parseDouble(JOptionPane.showInputDialog("Digite o lado: "));

    }

    @Override
    public String toString(){

    return "Lado: " + getLado() + "\n\n" + "\nArea do quadrado: " + this.calculaArea() + "\nPerimetro do Quadrado: " + this.calculaPerimetro();
        
    }
    
    
}
