public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 2025;
        boolean incluidoNoPLano = false;
        double notaDoFilme = 8.1;
        String tipoPlano = "plus";

        if (anoDeLancamento >= 2024){
            System.out.println("Lançamento recente");
        } else {
            System.out.println("Filme Retro que vale a pena assistir!");
        }

        if (incluidoNoPLano == true || tipoPlano.equals("plus")){
            System.out.println("Filme liberado!");
        } else {
            System.out.println("deve pagar para o plus");
        }
    }
}
