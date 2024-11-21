package br.inatel.cdg.po;

public class Computador {
    String marca;
    float preco;
    HardwareBasico[] hardware;
    SistemaOperacional sistema;
    MemoriaUSB memoria;

    public Computador() {

        hardware = new HardwareBasico[3];
        sistema = new SistemaOperacional();
    }

    public void mostraPCConfigs() {

        System.out.println("Marca: " + marca);
        System.out.println("Preço: R$ " + preco);
        for (int i = 0; i < hardware.length ; i++) {
            if (hardware[i] != null)
                System.out.println(hardware[i].nome + hardware[i].capacidade);
        }
        System.out.println("Sistema Operacional: " + sistema.nome + " - " + sistema.tipo);
        if (memoria != null) {
            System.out.println("Memória USB: " + memoria.nome + " - " + memoria.capacidade + " GB");
        }
    }

    public void addMemoriaUSB(MemoriaUSB musb) {
        this.memoria = musb;

    }
}
