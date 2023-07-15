// Este código, verifica se um aluno está aprovado ou reprovado considerando sua média e faltas.

package cursoJava.comandosDedecisao;

public class ComandosTernarios {

    /**
     * @param args
     */
    public static void main(String[] args) {

        // OPRERADORES LÓGICOS EM JAVA:
        // == Igual a...
        // != Diferente de...
        // > Maior que...
        // < Menor que...
        // >= Maior ou igual a...
        // <= Menor ou igual a...
        // OBS: O retorno de qualquer comparação realizada por esses operadores
        // retornará os valores booleanos TRUE ou FALSE.

        int nota = 85;
        int media = 60;
        String resultado;

        // Estrutura de comandos de decisão ternária:

        resultado = (nota >= media ? "Aprovado" : "reprovado");

        // Como funciona uma operação ternaria: Variável a receber o retorno ou a ser comparada =
        // (condições de teste ? retorno verdadeiro : retorno falso);

        System.out.printf("%s ", "O aluno esta " + resultado + "!");
    }

}
