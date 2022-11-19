import javax.swing.JOptionPane;

public class Torneio{

private String nome;
private int idade;


public Torneio(String nome, int idade){

this.nome = nome;
this.idade = idade;

}

public String getNome() {
    return nome;
}


public void setNumerador(String n) {
    this.nome = n;
}


public int getIdade() {
    return idade;
}


public void setIdade(int i) {
    this.idade = i;
}

public String verificaCategoria(){

    if(idade >=5 && idade <=7){

        return "Infantil";
    }
    else if(idade >=8 && idade <=10){

        return "Juvenil";
    }
    else if(idade >=11 && idade <=15){

        return "Adolescente";
    }
    else if(idade >=16 && idade <=30){

        return "Adulto";
    }
    else{
        return "Adulto";
    }

}

public void imprimiDados(){

JOptionPane.showMessageDialog(null, "Nome: " + nome + "\nIdade: " + idade + "\nCategoria: " + this.verificaCategoria());

}


}