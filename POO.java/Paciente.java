import javax.swing.JOptionPane;
public class Paciente {

    String nome;
    String rg;
    int anoNascimento;
    String profissao;
    
    public Paciente () { }

    public Paciente (String n){

    nome = n;

    }

    public void cadastraDados() {

    nome = JOptionPane.showInputDialog("Digite seu nome:");
    rg = JOptionPane.showInputDialog("Digite seu RG:");
    profissao = JOptionPane.showInputDialog("Digite seu profissao:");
    anoNascimento = Integer.parseInt(JOptionPane.showInputDialog("Digite ano de nascimento:"));
  
    }  

    public void imprimeDados() {

    JOptionPane.showMessageDialog(null, "Nome:" + this.nome + "\nRG:" + this.rg + "\nProfissao:" + this.profissao + "\nAno de Nascimento: " + this.anoNascimento);
    }

    public int calculaIdade(int anoAtual){

    if (anoAtual >= this.anoNascimento)

    return (this.anoNascimento - anoAtual);

    else { return (-1); }

    }

}