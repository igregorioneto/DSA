package org.gn.stack.exercice;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("--------------------------------------------");
        System.out.println("PROGRAMA PARA ESTUDO DO TAD PILHA");
        System.out.println("--------------------------------------------");
        System.out.println("");
        System.out.print("Tamanho maximo da pilha: ");
        int size = sc.nextInt();

        Stack stack = new Stack(size);
        boolean program = true;

        while (program) {
            System.out.println("\n\n--------------------------------------------");
            System.out.println("PROGRAMA PARA ESTUDO DO TAD PILHA - VERSÃO 1");
            System.out.println("      Conteudo: numeros inteiros");
            System.out.println("      Capacidade:" + size + " elementos");
            System.out.println("--------------------------------------------");
            System.out.println("");
            System.out.println("0 - Encerrar");
            System.out.println("1 - Inserir um elemento");
            System.out.println("2 - Extrair um elemento");
            System.out.println("3 - Imprimir a pilha");
            System.out.println("");

            System.out.print("Opcao: ");

            int opc = sc.nextInt();

            switch (opc) {
                case 0:
                    program = false;
                    break;
                case 1:
                    System.out.print("Valor do elemento a inserir: ");
                    int opc2 = sc.nextInt();
                    stack.push(opc2);
                    break;
                case 2:
                    System.out.println("Removendo valor...");
                    stack.pop();
                    break;
                case 3:
                    System.out.print("Valores da Stack: ");
                    stack.get();
                    break;
            }
        }

    }

}
