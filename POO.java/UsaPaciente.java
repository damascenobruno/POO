import javax.swing.JOptionPane;

public class UsaPaciente {

public static void main(String[]args){


Paciente p1 = new Paciente();

p1.cadastraDados();
p1.imprimeDados();
p1.calculaIdade(2022);

JOptionPane.showMessageDialog(null, "Sua Idade é: " + p1.calculaIdade(2022));

}

}
