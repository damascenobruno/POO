public class Chamado{

private String nomecliente;
private String problema;
private double custoatendimento;
private double custopecas;


public Chamado(String nomecliente, String problema){

    this.nomecliente = nomecliente;
    this.problema = problema;

}

public Chamado(String nomecliente, String problema, double custoatendimento, double custopecas ){

    this.nomecliente = nomecliente;
    this.problema = problema;
    this.custoatendimento = custoatendimento;
    this.custopecas = custopecas;

}

public String getNomecliente() {
    return nomecliente;
}

public void setNomecliente(String nomecliente) {
    this.nomecliente = nomecliente;
}

public String getProblema() {
    return problema;
}

public void setProblema(String problema) {
    this.problema = problema;
}

public double getCustoatendimento() {
    return custoatendimento;
}

public void setCustoatendimento(double custoatendimento) {
    this.custoatendimento = custoatendimento;
}

public double getCustopecas() {
    return custopecas;
}

public void setCustopecas(double custopecas) {
    this.custopecas = custopecas;
}

public void acrescentaPeca(double valor){

setCustopecas(getCustopecas() + valor);

}

public void acrescentaPeca(int qtde, double valor){

setCustopecas(getCustopecas() + qtde * valor);

}

public double calculaTotal(){
double result;
result = getCustoatendimento() + getCustopecas();
return result;

}

public String toString(){
String result;
result = getNomecliente();
return result;

}



public String menorValorPeca(Chamado ch){
 
    if(this.getCustopecas() < ch.getCustopecas()){

   return this.getNomecliente();
   
    }
    else{

        return ch.getNomecliente();
    }

}

public Chamado maiorCusto(Chamado ch){

    if(this.calculaTotal() > ch.calculaTotal()){

        return this;

    }
    else{
        return ch;
    }


}

public String exibir(){
String dados;
dados = "Informacoes do chamado" + "\nCliente: " + this.getNomecliente() + "\nProblema: " + this.getProblema() + "\nValor Total do Atendimento: " + this.calculaTotal();
return dados;

}

}