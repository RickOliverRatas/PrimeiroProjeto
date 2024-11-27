//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Bem vindo ao Screen Match");
        System.out.println("Filme: Minecraft: O Filme");

        int anoDeLancamento = 2025;
        System.out.println("Ano de Lançamento: "+ anoDeLancamento);
        boolean incluidoNoPLano = true;
        double notaDoFilme = 8.1;

        double media = (9.8 + 6.3 + 8.0) /3;
        System.out.println(media);
        String sinopse;
        sinopse = """
                Filme do Minecraft
                Filme de aventura em um mundo de blocos
                Muito ruim!
                Ano de Lançamento:
                """ + anoDeLancamento;
        System.out.println(sinopse);

        int classificacao = (int) (media/2);
        System.out.println(classificacao);
    }
}