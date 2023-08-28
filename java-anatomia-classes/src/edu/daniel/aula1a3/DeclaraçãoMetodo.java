package edu.daniel.aula1a3;
public class DeclaraçãoMetodo {

    
public static void main(String [] args) {

    String afastamento = " ";
    String primeiroNome = "Daniel";
    String segundoNome = "Conceição";
    String terceiroNome = "Rosario";

    String nomeCompleto = nomeCompleto (primeiroNome,segundoNome,afastamento,terceiroNome);

    System.out.println(nomeCompleto);
}

public static String nomeCompleto (String primeiroNome, String segundoNome, String afastamento, String terceiroNome){

    return "Resultado do método " + primeiroNome.concat(afastamento).concat(segundoNome).concat(afastamento).concat(terceiroNome);

}
}
