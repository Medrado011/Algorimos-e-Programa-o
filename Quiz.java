import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        String configuracao;
        String resposta;
        int menuInicial;
        System.out.println("\n==== Bem-Vindo ao quiz ====\n");
        System.out.println("1- Jogar");
        System.out.println("2- Configuração\n");
        System.out.println(" Escolha uma opção: ");
        menuInicial = e.nextInt();
        switch (menuInicial) {
            case 1:
                System.out.println("1° pergunta");
                System.out.println("2° pergunta");
                System.out.println("3° pergunta");
                System.out.println("4° pergunta");
                System.out.println("5° pergunta");
                System.out.println("6° pergunta");
                System.out.println("7° pergunta");
                System.out.println("8° pergunta");
                System.out.println("9° pergunta");
                System.out.println("10° pergunta");
                break;
            case 2:
                System.out.println("\n==== configurações ====\n");
                System.out.println("1- Criar pergunta");
                System.out.println("2- Deletar pergunta");
                System.out.println("3- Visualizar pergunta");
                int subMenu = e.nextInt();
                if (subMenu == 1) {
                    System.out.println("Crie uma nova pergunta: ");
                    configuracao = e.next();
                }
                if (subMenu == 2) {
                    System.out.println("Escolha uma pergunta para deletar (ex: 10)");
                    int deletar = e.nextInt();
                }
                if (subMenu == 3) {
                    System.out.println("1° pergunta");
                    System.out.println("2° pergunta");
                    System.out.println("3° pergunta");
                    System.out.println("4° pergunta");
                    System.out.println("5° pergunta");
                    System.out.println("6° pergunta");
                    System.out.println("7° pergunta");
                    System.out.println("8° pergunta");
                    System.out.println("9° pergunta");
                    System.out.println("10° pergunta");
                    System.out.println("1- Alterar pergunta");
                    System.out.println("2- voltar ao menu");
                }
                break;
            default:
                System.out.println("Opção invalida!!!");
        }
    }
}
