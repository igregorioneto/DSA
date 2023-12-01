package org.example.DSA.arvore.study;


/*
* Classe para testar e instanciar Objetos do TIPO Arvore
* Utilizando para testes de remoção
*
* @author Greg
* @version 1.0
* @since 2023-12-01
* */
public class TesteArvoreBinariaRemovendo {
    public static void main(String[] args) {
        Arvore<Integer> arvore = new Arvore<>();
        arvore.adicionar(10);
        arvore.adicionar(8);
        arvore.adicionar(5);
        arvore.adicionar(9);
        arvore.adicionar(7);
        arvore.adicionar(18);
        arvore.adicionar(13);
        arvore.adicionar(20);

        System.out.println("Em Ordem Crescente");
        arvore.emOrdem(arvore.getRaiz());

        arvore.remover(20);

        System.out.println("\n\nEm-ordem");
        arvore.emOrdem(arvore.getRaiz());

        arvore.remover(5);

        System.out.println("\n\nEm-ordem");
        arvore.emOrdem(arvore.getRaiz());

        arvore.remover(8);

        System.out.println("\n\nEm-ordem");
        arvore.emOrdem(arvore.getRaiz());

        arvore.remover(9);

        System.out.println("\n\nEm-ordem");
        arvore.emOrdem(arvore.getRaiz());

        arvore.remover(13);

        System.out.println("\n\nEm-ordem");
        arvore.emOrdem(arvore.getRaiz());

        arvore.remover(7);
        arvore.remover(18);

        System.out.println("\n\nEm-ordem");
        arvore.emOrdem(arvore.getRaiz());

        arvore.remover(10);

        System.out.println("\n\nEm-ordem");
        arvore.emOrdem(arvore.getRaiz());
    }
}
