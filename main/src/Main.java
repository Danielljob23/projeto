import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Criando as instâncias dos animais
        Cachorro cachorro1 = new Cachorro("Max", 2, "Preto");
        Cavalo cavalo1 = new Cavalo("Capitao", 5, "Marrom");
        Passaro passaro1 = new Passaro("Chico", 3, "Marrom");

        // Scanner para entrada do usuário
        Scanner scanner = new Scanner(System.in);

        int escolha;

        do {
                // Exibindo opções de escolha do animal
                System.out.println("Escolha o animal para ver as informações:");
                System.out.println("1 - Cachorro");
                System.out.println("2 - Cavalo");
                System.out.println("3 - Pássaro");
                System.out.println("4 - Fim da compra");

                //Entrada
                escolha = scanner.nextInt();

                try {
                    switch (escolha) {
                        case 1:
                            // Escolher raça para o cachorro
                            cachorro1.escolheRaca("src/Racas/cachorros.txt");

                            System.out.println("\nInformações do Cachorro:");
                            cachorro1.mostrainfo();  // Exibe nome, cor, idade e preço
                            cachorro1.exibirNivelTreinamento();  // Exibe o nível de treinamento
                            cachorro1.Calculapreco();  // Exibe o preço final
                            cachorro1.emitirsom();  // Exibe o som do cachorro
                            break;

                        case 2:
                            // Escolher raça para o cavalo
                            cavalo1.escolheRaca("src/Racas/cavalos.txt");

                            System.out.println("\nInformações do Cavalo:");
                            cavalo1.mostrainfo();  // Exibe nome, cor, idade e preço
                            cavalo1.exibirVelocidade();  // Exibe a velocidade
                            cavalo1.Calculapreco();  // Exibe o preço final
                            cavalo1.emitirsom();  // Exibe o som do cavalo
                            break;

                        case 3:
                            // Escolher raça para o pássaro
                            passaro1.escolheRaca("src/Racas/passaros.txt");

                            System.out.println("\nInformações do Pássaro:");
                            passaro1.mostrainfo();  // Exibe nome, cor, idade e preço
                            passaro1.exibirTamanhoAsa();  // Exibe o tamanho da asa
                            passaro1.Calculapreco();  // Exibe o preço final
                            passaro1.emitirsom();  // Exibe o som do pássaro
                            break;

                        case 4:
                            System.out.println("Fim da compra");
                            break;

                        default:
                            throw new OpcaoInvalidaException("Opção inválida! Por favor, escolha entre 1, 2, 3 ou 4.");
                    }
                } catch (OpcaoInvalidaException e) {
                    e.printStackTrace();
                }
            } while (escolha != 4);
            scanner.close();  // Fecha o scanner
        }
}
