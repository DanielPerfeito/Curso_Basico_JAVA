// Desenvolva um programa que solicite o nome de um aluno, bem como suas três notas (em uma escala de 0 a 10), e calcule a média entre elas. Ao final, o programa deverá exibir uma mensagem contendo o nome do aluno e seu status acadêmico com base na média obtida. O status acadêmico será definido como "Aprovado" se a média for maior ou igual a 7, "Recuperação" se a média for menor que 7 e maior ou igual a 4, e "Reprovado" se a média for menor que 4.

package cursoJava.exercicios;

import java.util.Scanner; // Importação da biblioteca necessária.

public class CalculandoNotas {

    public static void main(String[] args) {

        String nome = ""; // Criação/atribuição da variavel para nome.

        float nota1 = 0, nota2 = 0, nota3 = 0; // Criação/atribuição das variáveis para notas

        Scanner entrada = new Scanner(System.in); // Criação de novo objeto 'Scanner" para coletar os dados inseridos através do teclado, quando solicitado.


        System.out.print("Informe o seu nome: "); // Solicitação de dado.
        nome = entrada.next(); // Coleta do dado solicitado para armazenar em sua respectiva variável.  

        System.out.print("Informe a sua primeira nota: "); // Solicitação de dado.
        nota1 = entrada.nextFloat(); // Coleta do dado solicitado para armazenar em sua respectiva variável.

        System.out.print("Informe a sua segunda nota: "); // Solicitação de dado.
        nota2 = entrada.nextFloat(); // Coleta do dado solicitado para armazenar em sua respectiva variável.

        System.out.print("Informe a sua terceira nota: "); // Solicitação de dado.
        nota3 = entrada.nextFloat(); // Coleta do dado solicitado para armazenar em sua respectiva variável.

        float media = (nota1 + nota2 + nota3) / 3; // Criação/atribuição da variável media.

        if (media >= 7){
            System.out.printf("O aluno %s foi APROVADO com MEDIA %f.", nome, media);
        }else if ((media < 7) && (media >= 4)){
            System.out.printf("O Aluno %s esta de RECUPERACAO, sua MEDIA foi %f.", nome, media);
        }else{
            System.out.printf("O Aluno %s ficou REPROVADO com MEDIA %f.%n", nome, media);
        } // Condições de teste: Cada condição exibe sua respectiva mensagem, de acordo com o enunciado.

    }

}
