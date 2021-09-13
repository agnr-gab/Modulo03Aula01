package br.com.zup;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Lista01Ex01 {

    public static void main(String[] args) {
        /*	1. Crie um programa para gerenciar uma lista de produtos de um estabelecimento, cada produto tem um nome e um preço. No final do programa, o usuário deve decidir se irá adicionar mais de um produto, exibir todos os produtos cadastrados ou excluir um produto pelo nome. */
        Scanner leitorProdutos = new Scanner(System.in);
        Map<String, Double> listaProdutos = new HashMap<String, Double>();

        System.out.println("___Cadastro de Produtos___");
        //Variáveis

        while (true) {
            System.out.println("Digite 1 para cadastrar produto.");
            System.out.println("Digite 2 exibir lista de produtos cadastrados.");
            System.out.println("Digite 3 excluir um produto.");
            int opcaoMenu = leitorProdutos.nextInt();
            leitorProdutos.nextInt();
            switch (opcaoMenu) {
                case 1:
                    System.out.println("Digite o nome do produto");
                    String nomeProduto = leitorProdutos.nextLine();
            }
        }
    }
}
