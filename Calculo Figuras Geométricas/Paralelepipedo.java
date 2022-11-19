import javax.swing.JOptionPane;
public class Paralelepipedo extends Ponto{
    
    private double comprimento;
    private double altura;
    private double largura;

    public Paralelepipedo() {
    }

    public Paralelepipedo(double comprimento, double altura, double largura) {
        this.comprimento = comprimento;
        this.altura = altura;
        this.largura = largura;
    }

    public double getComprimento() {
        return this.comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargura() {
        return this.largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }


    public double calculaVolume(){
        setX(getComprimento() * getLargura() * getAltura());
       return getX();
    }
    public double calculaAreaTotal(){
        setY(2 * (getLargura() * getComprimento()) + (getLargura() * getAltura()) + getComprimento() * getAltura());
        return getY();
    }

    public void solicitaDados(){

    comprimento = Double.parseDouble(JOptionPane.showInputDialog("Digite o comprimento: "));
    altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura: "));
    largura = Double.parseDouble(JOptionPane.showInputDialog("Digite a largura: "));

    }

    @Override
    public String toString(){
        
  return "Comprimento: " + getComprimento() + "\nAltura: " + getAltura() + "\nLargura: " + getLargura();

    }

}
