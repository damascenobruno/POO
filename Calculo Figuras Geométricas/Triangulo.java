import javax.swing.JOptionPane;
public class Triangulo extends Ponto {

    private double ladoBase;
    private double altura;

    public Triangulo() {
    }

    public Triangulo(double ladoBase, double altura) {
        this.ladoBase = ladoBase;
        this.altura = altura;
    }

    public double getLadoBase() {
        return this.ladoBase;
    }

    public void setLadoBase(double ladoBase) {
        this.ladoBase = ladoBase;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public double calculaArea(){
        setX(getLadoBase()*getAltura()/2);
        return getX();

    }

    public double calculaPerimetro(){

    setY(3*getLadoBase());
    return getY();

    }

    public void solicitaDados(){

    ladoBase = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da Base: "));
    altura = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da Altura: "));

    }

    @Override
    public String toString(){
       
    return "Base: " + getLadoBase() + "\nAltura: " + getAltura() + "\n\n" + "\nArea do Triangulo: " + this.calculaArea() + "\nPerimetro do Triangulo: " + this.calculaPerimetro();    

    }

}
