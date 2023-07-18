//Este código coleta dados atraves do objéto Scanner(Importado da biblioteca java.util) e imprime esses dados e as suas operações no terminal. 

package cursoJava;

import java.util.Scanner; // Biblioteca de onde o objéto Scanner foi importado.

public class EntradaDeDados {

public static void main (String [] args){

    Scanner scan = new Scanner(System.in); // definição de um novo objeto (new), que recebeu o nome de 'scan' e seu valor corresponderá os dados inseridos pelo teclado (System.in).

    int num1=0, num2=0, res=0;

    String nome="";

    System.out.print("Digite seu nome: ");
    nome=scan.nextLine();
    
    System.out.print("Digite algum numero: ");
    num1=scan.nextInt();

    System.out.print("Digite outro numero: ");
    num2=scan.nextInt();

    // O metodo "next()" determina qual é o tipo da entrada de dado, sendo "next()" e "nextLine()" para textos e "nextInt()" para números inteiros.

    res=num1+num2;

    System.out.printf("%s, A soma de %d e %d e igual a %d.%n",nome,num1,num2,res);

}
    
}
