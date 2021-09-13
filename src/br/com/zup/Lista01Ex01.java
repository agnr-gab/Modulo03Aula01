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
        boolean loop = true;

        while (loop == true) {
            System.out.println("Escolha uma opção:");
            System.out.println("Digite 1 para cadastrar produto.");
            System.out.println("Digite 2 exibir lista de produtos cadastrados.");
            System.out.println("Digite 3 excluir um produto.");
            System.out.println("Digite 4 fechar o programa.");

            int opcaoMenu = leitorProdutos.nextInt();
            leitorProdutos.nextLine();

            switch (opcaoMenu) {
                case 1:
                    System.out.println("Digite o nome do produto");
                    String nomeProduto = leitorProdutos.nextLine();
                    System.out.println("Digite o preço do produto");
                    Double precoProduto = leitorProdutos.nextDouble();
                    listaProdutos.put(nomeProduto, precoProduto);
                    System.out.println("___Produto cadastrado com sucesso___");
                    break;
                case 2:
                    if (listaProdutos.isEmpty()) {
                        System.out.println("Ainda não foram cadastrados produtos no sistema. Faça o cadastro primeiramente!");
                    } else {
                        for (String verificarLista : listaProdutos.keySet()) {
                            System.out.println("Produto: " + verificarLista + "\t\t " + "valor R$ " + listaProdutos.get(verificarLista));
                        }
                    }
                    break;
                case 3:
                    if (listaProdutos.isEmpty()) {
                        System.out.println("Ainda não foram cadastrados produtos no sistema. Faça o cadastro primeiramente!");
                    } else {
                        System.out.println("Digite o nome do produto que deseja excluir da lista:");
                        String produtoDeletado = "";
                        String deletarProduto = leitorProdutos.nextLine();
                        for (String verificaProduto : listaProdutos.keySet()) {
                            System.out.println("A exclusão do cadastro foi realizada com sucesso!");
                            produtoDeletado = deletarProduto;
                        }
                        listaProdutos.remove(produtoDeletado);
                    }
                    break;
                case 4:
                    System.out.println("Obrigada por utilizar nosso sistema!");
                    loop = false;
                    break;
                default:
                    System.out.println("Você inseriu uma opção inválida. Digite uma opção válida!");
                    break;
            }
        }
    }
}