import javax.swing.JOptionPane;

public class Cilindro extends Ponto {
    
    private double raio;
    private double altura;
    private double areaL;
    private double areaB;

    public Cilindro() {
    }

    public Cilindro(double raio, double altura, double aL, double aB) {
        this.raio = raio;
        this.altura = altura;
        this.areaL = aL;
        this.areaB = aB;
    }
    

    public double getRaio() {
        return this.raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getAreaL() {
        return this.areaL;
    }

    public void setAreaL(double areaL) {
        this.areaL = areaL;
    }

    public double getAreaB() {
        return this.areaB;
    }

    public void setAreaB(double areaB) {
        this.areaB = areaB;
    }

    public double areaBase(){

        setY(3.14*(raio*raio));
        return getY();

    }

    public double areaLateral(){

        setX(2*3.14*raio*altura);
        return getX();

    }
  
    public double calculaArea(){

        return (2*this.areaBase()) + this.areaLateral();

    }

    public double calculaVolume(){

        return 3.14*(raio*raio)*altura;

    }
    
    public void solicitaDados(){
    
        raio = Double.parseDouble(JOptionPane.showInputDialog("Digite o raio do cilindro: "));
        altura = Double.parseDouble(JOptionPane.showInputDialog("Digite o altura do cilindro: "));
        
    }

    @Override
    public String toString(){

      return  "Raio: " + getRaio() + "\nAltura: " + getAltura() + "\n\n" + "\nArea Total do Cilindro: " + this.calculaArea() + "\nVolume do Cilindro: " + this.calculaVolume();
        
    }

    

    
}
