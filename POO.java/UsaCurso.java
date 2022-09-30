import javax.swing.JOptionPane;

public class UsaCurso {


public static void main(String[] args) {

Curso c1 = new Curso();

c1.cadastraCurso();
c1.imprimeDados();
c1.calculaTotalMensalidade(0, 200);

JOptionPane.showMessageDialog(null, "Total Mensalidade é:" + c1.calculaTotalMensalidade(0, 200));

}

}

