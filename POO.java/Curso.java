import javax.swing.JOptionPane;

public class Curso {

String nome;
int qtdeAlunos;
String turma;
float mensalidade;

public Curso(){}

public Curso (String n, int q, String t, float m ) {

nome = n;
qtdeAlunos = q;
turma = t;
mensalidade = m;

}

public void cadastraCurso(){

    nome =  JOptionPane.showInputDialog("Digite o nome: ");

    qtdeAlunos = Integer.parseInt(JOptionPane.showInputDialog( "Digite a quantidade de alunos"));

    turma = JOptionPane.showInputDialog("Quantidade a turma:");

    mensalidade = Float.parseFloat(JOptionPane.showInputDialog( "Digite a mensaidade"));
}

public void imprimeDados(){
    JOptionPane.showMessageDialog(null, "Nome:" + nome + "\nTurma:" + turma + "\nMensalidade:" + mensalidade + "\nNúmeros de Alunos:" + qtdeAlunos);
}

public float calculaTotalMensalidade(float q, int m){
            if (qtdeAlunos > 0) {

            return (q * m);

            }

            else { return (0);  }
         

        }
    }


