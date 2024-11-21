package br.inatel.cdg.po;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int opcao = 0;
        Scanner scanner = new Scanner(System.in);

        Cliente cliente = new Cliente();
        cliente.nome = "PC Mania";

        Computador computador1 = new Computador();
        Computador computador2 = new Computador();
        Computador computador3 = new Computador();

        computador1.marca = "Positivo";
        computador2.marca = "Acer";
        computador3.marca = "Vaio";

        computador1.preco = 9754;
        computador2.preco = 1234 + 9754;
        computador3.preco = 5678 + 9754;

        computador1.sistema.nome = "Linux Ubuntu";
        computador2.sistema.nome = "Windows 8";
        computador3.sistema.nome = "Windows 10";

        computador1.sistema.tipo = 32;
        computador2.sistema.tipo = 64;
        computador3.sistema.tipo = 64;

        // Adicionando os hardwares ao computador 1
        HardwareBasico h1_1 = new HardwareBasico();
        computador1.hardware[0] = h1_1;
        computador1.hardware[0].nome = "Pentium core i3";
        computador1.hardware[0].capacidade = 2200;

        HardwareBasico h1_2 = new HardwareBasico();
        computador1.hardware[1] = h1_2;
        computador1.hardware[1].nome = "8 Gb de Memória RAM";
        computador1.hardware[1].capacidade = 8000;

        HardwareBasico h1_3 = new HardwareBasico();
        computador1.hardware[2] = h1_3;
        computador1.hardware[2].nome = "500 Gb de HD";
        computador1.hardware[2].capacidade = 500;

        // Adicionando a memória USB ao computador 1
        MemoriaUSB memoriaUSB1 = new MemoriaUSB();
        memoriaUSB1.nome = "Pen-drive";
        memoriaUSB1.capacidade = 16;
        computador1.addMemoriaUSB(memoriaUSB1);

        // Adicionando os hardwares ao computador 2
        HardwareBasico h2_1 = new HardwareBasico();
        computador2.hardware[0] = h2_1;
        computador2.hardware[0].nome = "Pentium core i5";
        computador2.hardware[0].capacidade = 3370;

        HardwareBasico h2_2 = new HardwareBasico();
        computador2.hardware[1] = h2_2;
        computador2.hardware[1].nome = "16 Gb de Memória RAM";
        computador2.hardware[1].capacidade = 16000;

        HardwareBasico h2_3 = new HardwareBasico();
        computador2.hardware[2] = h2_3;
        computador2.hardware[2].nome = "1 Tb de HD";
        computador2.hardware[2].capacidade = 1000;

        // Adicionando a memória USB ao computador 2
        MemoriaUSB memoriaUSB2 = new MemoriaUSB();
        memoriaUSB2.nome = "Pen-drive";
        memoriaUSB2.capacidade = 32;
        computador2.addMemoriaUSB(memoriaUSB2);

        // Adicionando os hardwares ao computador 3
        HardwareBasico h3_1 = new HardwareBasico();
        computador3.hardware[0] = h3_1;
        computador3.hardware[0].nome = "Pentium core i7";
        computador3.hardware[0].capacidade = 4500;

        HardwareBasico h3_2 = new HardwareBasico();
        computador3.hardware[1] = h3_2;
        computador3.hardware[1].nome = "32 Gb de Memória RAM";
        computador3.hardware[1].capacidade = 32000;

        HardwareBasico h3_3 = new HardwareBasico();
        computador3.hardware[2] = h3_3;
        computador3.hardware[2].nome = "2 Tb de HD";
        computador3.hardware[2].capacidade = 2000;

        // Adicionando a memória USB ao computador 3
        MemoriaUSB memoriaUSB3 = new MemoriaUSB();
        memoriaUSB3.nome = "Pen-drive";
        memoriaUSB3.capacidade = 64;
        computador3.addMemoriaUSB(memoriaUSB3);

        // Escolha de promoções
        do {
            System.out.println("Escolha a promoção que deseja comprar (1, 2, 3) ou 0 para sair:");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    cliente.addcomputadores(computador1);
                    break;
                case 2:
                    cliente.addcomputadores(computador2);
                    break;
                case 3:
                    cliente.addcomputadores(computador3);
                    break;
                case 0:
                    System.out.println("Finalizando compras.");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);

        // Mostrar compras do cliente
        cliente.mostraCompras();
        cliente.calculaTotalCompras();
        scanner.close();
    }
}
