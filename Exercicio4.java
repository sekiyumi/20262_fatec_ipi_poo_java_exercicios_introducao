import java.util.Scanner;
public class Exercicio4{
    static public void main(String abc []){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um numero inteiro: ");
        int numero = leitor.nextInt();
        // if(numero%2 == 0){
        //     System.out.println("O numero é par");
        // }
        // else{
        //     System.out.println("O numero é impar");
        // }
        System.out.println(numero%2==0 ? "Par" : "Impar");
        leitor.close();
    }
}