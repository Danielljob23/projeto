package br.inatel.cdg.po;

public class Cliente {
    String nome;
    long cpf;
    Computador[] computadores = new Computador[3]; // Limite de 3 computadores (promoções)

    public void addcomputadores(Computador computador) {
        for (int i = 0; i < computadores.length; i++) {
            if (computadores[i] == null) {
                computadores[i] = computador;
                break;
            }
        }
    }

    public void mostraCompras() {
        System.out.println("Compras do cliente " + nome + ":");
        float total = 0;
        for (int i = 0; i < computadores.length; i++) {
            if (computadores[i] != null) {
                computadores[i].mostraPCConfigs();
                total += computadores[i].preco;
                System.out.println();
            }
        }
        System.out.println("Total da compra: R$ " + total);
    }
    public float calculaTotalCompras() {
        float total = 0;
        for (int i = 0; i < computadores.length; i++) {
            if (computadores[i] != null) {
                total += computadores[i].preco;
            }
        }
        return total;
    }
}
