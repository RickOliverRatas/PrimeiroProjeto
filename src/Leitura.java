import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura =  new Scanner(System.in);

        System.out.println("digite seu jogo favorito");
        String jogo = leitura.nextLine();
        System.out.println("qual o ano de lançamento ");
        int ano = leitura.nextInt();
        System.out.println("qual a nota do jogo ");
        double nota = leitura.nextDouble();
        System.out.println(jogo + "\n" + ano + "\n"+ nota);
    }
}
