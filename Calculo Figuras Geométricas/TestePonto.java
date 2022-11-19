import javax.swing.JOptionPane;
public class TestePonto{

    public static void main(String[] args) {

        int resu;
        int continuar;

        Raiz raiz = new Raiz();
            Ponto[] vetor = new Ponto[6];
        do {
            resu = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero correspondente ao calculo desejado:" + 
            "\n1- Cilindro " + 
            "\n2-Cone " + 
            "\n3- Paralelepipedo " + 
            "\n4- Quadrado " + 
            "\n5- Equacao 2Grau " + 
            "\n6- Triangulo" ));
        
            if(resu == 1){
                vetor[0] = new Cilindro();
               vetor[0].solicitaDados();
               JOptionPane.showMessageDialog(null, vetor[0].toString());
            }
            else if(resu == 2){
                vetor[1] = new Cone();
                vetor[1].solicitaDados();
                JOptionPane.showMessageDialog(null, vetor[1].toString());

            }
            else if(resu == 3){
                vetor[2] = new Paralelepipedo();
                vetor[2].solicitaDados();
                JOptionPane.showMessageDialog(null, vetor[2].toString());
            }
            else if(resu == 4){
                vetor[3] = new Quadrado();
                vetor[3].solicitaDados();
                JOptionPane.showMessageDialog(null, vetor[3].toString());
            }
            else if(resu == 5){
                
                raiz.solicitaDados();
                raiz.imprimeDados();

            }
            else if(resu == 6){
                vetor[4] = new Triangulo();
                vetor[4].solicitaDados();
                JOptionPane.showMessageDialog(null, vetor[4].toString());

            }
            else{

                JOptionPane.showMessageDialog(null, "Opcao Invalida !");
            }

            continuar = Integer.parseInt(JOptionPane.showInputDialog("Digite 9 para continuar"));

        }while (continuar == 9);


    }


}