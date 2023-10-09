package org.gn.stack.exercice;

public class StackSimple {
    static class Stack {
        private int topo;
        private int tamanho;
        private int stack[];
        private int retorno;

        public Stack(int tamanho) {
            this.tamanho = tamanho;
            this.topo = -1;
            this.stack = new int[this.tamanho];
        }

        private int getTamanho() { return this.topo + 1; }

        private boolean empty() { return this.topo == -1; }

        public void push(int valor) {
            if (this.topo == this.tamanho - 1) {
                System.out.println("Stack esta cheia...");
            } else {
                this.topo++;
                this.stack[this.topo] = valor;
            }
        }

        public int pop() {
            if (this.topo == -1) {
                System.out.println("Stack vazia...");
                return -1;
            } else {
                this.retorno = this.stack[this.topo];
                this.topo--;
                return this.retorno;
            }
        }

        public int peek() {
            if (this.topo == -1) {
                System.out.println("Valor do topo esta vazio...");
                return -1;
            } else {
                return this.stack[this.topo];
            }
        }

        public void asc() {
            for (int i = 0; i < tamanho; i++) {
                for (int j = 0; j < tamanho - 1; j++) {
                    if (this.stack[j] > this.stack[j + 1]) {
                        int temp = this.stack[j];
                        this.stack[j] = this.stack[j + 1];
                        this.stack[j + 1] = temp;
                    }
                }
            }
        }

        public void desc() {
            for (int i = 0; i < tamanho; i++) {
                for (int j = 0; j < tamanho - 1; j++) {
                    if (stack[j] < stack[j + 1]) {
                        int temp = stack[j + 1];
                        stack[j + 1] = stack[j];
                        stack[j] = temp;
                    }
                }
            }
        }

        public void reverse() {
            System.out.println("REVERTENDO...");
            int arr[] = new int[tamanho];
            int count = 0;
            int dec = tamanho - 1;
            while (count < tamanho) {
                arr[count] = stack[dec];
                count++;
                dec--;
            }
            stack = arr;
        }

        public int max() {
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < tamanho; i++) {
                if (stack[i] > max) {
                    max = stack[i];
                }
            }
            return max;
        }

        public int min() {
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < tamanho; i++) {
                if (stack[i] < min) {
                    min = stack[i];
                }
            }
            return min;
        }

        public void display() {
            if (topo == -1) {
                System.out.println("Stack vazia...");
            } else {
                System.out.println("Elementos da Stack: ");
                for (int i = 0; i <= topo ; i++) {
                    System.out.print(this.stack[i] + " ");
                }
                System.out.println();
            }
        }

    }
    public static void main(String[] args) {
        Stack stack = new Stack(5);
        System.out.println("Stack inicial...");
        stack.display();

        stack.push(5);
        stack.push(2);
        stack.push(3);
        stack.push(6);
        stack.push(8);
        stack.push(5);

        System.out.println("Imprimindo Stack...");
        stack.display();

        System.out.println("Removendo valores da Stack...");
        //stack.pop();
        stack.display();
        //stack.push(5);
        //stack.get();

        System.out.println("============ORDENANDO CRESCENTE============");
        stack.asc();
        stack.display();

        System.out.println("============ORDENANDO DECRESCENTE============");
        stack.desc();
        stack.display();

        System.out.println("============REVERTENDO============");
        stack.reverse();
        stack.display();

        System.out.println("============MÁXIMO E MÍNIMO============");
        System.out.println("Valor Máximo: " + stack.max());
        System.out.println("Valor Mínimo: " + stack.min());
    }
}
