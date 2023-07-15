// Este código, verifica se um aluno está aprovado ou reprovado considerando sua média e faltas.

package cursoJava.comandosDedecisao;

public class ComandosIfElse {

    public static void main (String[] args){

        // OPRERADORES LÓGICOS EM JAVA:
        // == Igual a...
        // != Diferente de...
        // >  Maior que...
        // <  Menor que...
        // >= Maior ou igual a...
        // <= Menor ou igual a...
        // OBS: O retorno de qualquer comparação realizada por esses operadores retornará os valores booleanos TRUE ou FALSE.
        
        int nota = 85; // Nota do aluno.
        int faltas = 2 ; // Faltas do aluno
        int maxFaltas = 5; // Maximo de faltas toleradas para a aprovação:
        int media = 60; // Média minima para a aprovação

        //Estrutura condicional IF e ELSE:

        if((nota >= media) && (faltas <= maxFaltas)){
            System.out.println("Aluno Aprovado!");
        }else if (nota >= 40){
            System.out.println("O Aluno está de recuperacao!");
        }else{
            System.out.println("Aluno Reprovado!");
        }

        System.out.println ("Fim do programa!");

    }

}
