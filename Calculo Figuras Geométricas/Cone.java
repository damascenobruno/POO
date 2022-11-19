import javax.swing.JOptionPane;
public class Cone extends Ponto {

    private double raio;
    private double altura;
    private double geratriz;

    public Cone() {
    }

    public Cone(double raio, double altura, double geratriz) {
        this.raio = raio;
        this.altura = altura;
        this.geratriz = geratriz;
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

    public double getGeratriz() {
        return this.geratriz;
    }

    public void setGeratriz(double geratriz) {
        this.geratriz = geratriz;
    }

    public double calculaArea(){

        setX((3.14*raio*(raio+geratriz)));
        return getX();

    }

    public double calculaVolume(){

        setY((3.14*(raio*raio)*this.calculaArea())/3);
        return getY();

    }

    public void solicitaDados(){

    raio = Double.parseDouble(JOptionPane.showInputDialog("Digite o raio: "));
    altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura: "));
    geratriz = Double.parseDouble(JOptionPane.showInputDialog("Digite a Geratriz: "));

    }

    @Override
    public String toString(){

    return "Raio: " + getRaio() + "\nAltura: " + getAltura() + "\nGeratriz: " + getGeratriz() + "\n\n" + "\nArea do Cone: " + this.calculaArea() + "\nVolume do Cone: " + this.calculaVolume();

    }
 
}
