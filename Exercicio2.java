import java.util.Scanner;
public class Exercicio2{
    static public void main(String... args){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite a distancia: ");
        double distancia = leitor.nextDouble(); //liga a função leitor para ler inputs do teclado 
        System.out.println("Digite o consumo em km/l: "); //print
        double consumo = leitor.nextDouble(); //lê dados 
        System.out.println("Preço do litro: ");
        double preco = leitor.nextDouble();
        double litros = distancia/consumo; // calculo
        double custo = litros * preco;
        System.out.println("Litros necessários: " + litros);
        System.out.printf("Custo total R$ %.2f ",custo);
        leitor.close(); //encerra o leitor liberando memoria 
    }
}