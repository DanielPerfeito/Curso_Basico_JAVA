package cursoJava; // Pacote ou pasta de projetos.

public class ImpressaoEVariaveis {

    public static void main (String [] args){

        int anoAtual = 2023; // Declaração de variável: 1° tipo: int, string, float. etc. | 2° nome da variável: nomeVariavel | 3° atribuição de valor: = + valor.
        int anoNasc = 1996;
        int idade = (anoAtual - anoNasc); // O valor de uma variável pode ser outra variável ou a operação de duas ou mais variáveis.

        System.out.println("Curso de JAVA"); // Imprime no terminal, COM quebra de linha.
        System.out.printf("Aluno: %s%nIdade:%d%n","Daniel",idade); //Imprime no terminal levando em consideração os argumentos informados.
        System.out.println("");
        System.out.print("Bons estudos!"); // Imprime no terminal, SEM quebra de linha. 
    }


    
} // Classe principal.
