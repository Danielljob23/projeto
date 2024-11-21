public class Cachorro extends Animal {
    private String nivelTreinamento;
    // Construtor que passa nome, idade e cor para a classe base
    public Cachorro(String nome, int idade, String cor) {
        super(nome, idade, cor);
        this.nivelTreinamento = "Iniciante"; // Valor padrão
    }
    public void setNivelTreinamento(String nivel) {
        this.nivelTreinamento = nivel;
    }

    public void exibirNivelTreinamento() {
        System.out.println("O nível de treinamento do cachorro é: " + nivelTreinamento);
    }
    // Implementação do método abstrato `emitirsom` para o cachorro
    @Override
    public void emitirsom() {
        System.out.println("O cachorro faz AU-AU");

    }

    @Override
    public void Calculapreco() {
        if (idade >= 1 && idade <= 5) {
            preco = 500; //
        } else if (idade > 5) {
            preco = 450;
        }
        System.out.println("O preço final do " + nome + " é: R$ " + preco);
    }
    }

