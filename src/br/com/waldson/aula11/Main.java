package br.com.waldson.aula11;

public class Main {

    public static void main(String[] args) {
        ArvoreBinariaBusca arvore = new ArvoreBinariaBusca();
        arvore.insert(new Node(5));
        arvore.insert(2);
        arvore.insert(-4);
        arvore.insert(3);
        arvore.insert(18);

        Node n = arvore.search(80);
        if (n != null) {
            System.out.println("Elemento encontrado");
        } else {
            System.out.println("Elemento não encontrado");
        }

        arvore.print();
        System.out.println("\n-------\n");
        arvore.remove(5);
        arvore.print();


    }
}
