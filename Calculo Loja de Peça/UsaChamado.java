import javax.swing.JOptionPane;

public class UsaChamado{

public static void main(String[] args) {
double valor;
int qtde;
String result;

Chamado c1 = new Chamado("Bruno", "Coração Partido");
Chamado c2 = new Chamado("", "", 00, 00);

c1.setCustoatendimento(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do Atendimento: ")));
c1.setCustopecas(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da Peca: ")));

JOptionPane.showMessageDialog(null, c1.exibir());

valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor adiscional: "));
qtde = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade: "));

c1.acrescentaPeca(qtde ,valor);

JOptionPane.showMessageDialog(null, c1.exibir());

c2.setNomecliente(JOptionPane.showInputDialog("Digite Nome: "));
c2.setProblema(JOptionPane.showInputDialog("Digite o Problema: "));
c2.setCustoatendimento(Double.parseDouble(JOptionPane.showInputDialog("Digite o custo do Atendimento: ")));
c2.setCustopecas(Double.parseDouble(JOptionPane.showInputDialog("Digite o custo da Peca: ")));

JOptionPane.showMessageDialog(null, c2.exibir());

valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor adiscional: "));

c2.acrescentaPeca(valor);

JOptionPane.showMessageDialog(null, c2.exibir());


Chamado c3;

c3 = c1.maiorCusto(c2);
result = c1.menorValorPeca(c3);

JOptionPane.showMessageDialog(null, c1.exibir());

JOptionPane.showMessageDialog(null, c2.exibir());

JOptionPane.showMessageDialog(null, "Chamado de maior custo entre o chamado 1 e o chamado 2: " + "\nInformacoes do chamado: " + "\nCliente: " + c3 + "\nProblema: " + c3.getProblema() + "\nValor Total do Atendimento: " + c3.calculaTotal() + "\nNome do Cliente com menor valor de peca}: " + result);


}

}
