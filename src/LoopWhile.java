import java.util.Scanner;

public class LoopWhile {
        public static void main(String[] args) {
        Scanner leitura =  new Scanner(System.in);
        double media = 0;
        double nota = 0;
        int i = 0;

        while (nota != -1) {
            System.out.println("qual a nota do jogo ou -1 para encerrar");
            nota = leitura.nextDouble();

            if (nota != -1) {
                media += nota;
                i++;
            }
        }
        System.out.println("Media das notas "+ media/i);
    }
}
