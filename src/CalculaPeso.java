import java.util.Scanner;

public class CalculaPeso {

    public static void main(String[] args) {
        Planeta[] ordem = {new Mercurio(), new Venus(), new Terra(), new Marte(), new Jupiter(), new Saturno(), new Urano(), new Netuno()};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o seu peso em kg: ");
        double peso = scanner.nextDouble();

        System.out.println("Escolha um planeta para viajar:");
        for (int i = 0; i < ordem.length; i++) {
            System.out.println(i + ". " + ordem[i].getNome());
        }

        System.out.print("Digite o número do planeta escolhido: ");
        int indexPlaneta = scanner.nextInt();

        if (indexPlaneta < 0 || indexPlaneta >= ordem.length) {
            System.out.println("Planeta inválido!");
        } else {

            Planeta planetaSelecionado = ordem[indexPlaneta];
            System.out.println("Seu peso no planeta " + planetaSelecionado.getNome() + " é de " + planetaSelecionado.getPeso(peso) + " Newtowns.");
        }

        scanner.close();
    }
}
