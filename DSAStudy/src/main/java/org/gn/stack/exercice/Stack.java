package org.gn.stack.exercice;

public class Stack {
    private int top;
    private int size;
    private int repeat;
    private int stack[];

    private int retorno;

    public Stack(int size) {
        this.size = size;
        stack = new int[size];
        this.top = -1;
    }

    public int getRetorno() { return this.retorno; }

    public boolean getFull() { return this.top == this.size - 1; }

    public int qtd() { return this.top + 1; }

    public boolean empty() { return this.qtd() == 0; }

    /*
    * @param passa um parametro int
    * */
    public void push(int n) {
        if (getFull()) {
            System.out.println("Não pode inserir valor. Stack esta cheia!");
        } else {
            ++this.top;
            this.stack[this.top] = n;
        }
    }

    /*
    * @return retornando os itens da Stack
    * */
    public void get() {
        if (this.empty()) {
            System.out.println("Sem valores na Stack");
        } else {
            for (int i = this.size - 1; i >= 0 ; i--) {
                System.out.print(this.stack[i] + " ");
            }
        }
    }

    /*
    * Remove o valor do topo
    * */
    public void pop() {
        if (empty()) {
            System.out.println("Sem valores para poder remover... Tente outra opção no Menu!");
            return;
        }
        this.retorno = this.stack[this.top];
        this.top--;
    }

}
