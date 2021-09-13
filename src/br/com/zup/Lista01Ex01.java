package br.com.zup;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Lista01Ex01 {

    public static void main(String[] args) {
        /*	1. Crie um programa para gerenciar uma lista de produtos de um estabelecimento, cada produto tem um nome e um preço. No final do programa, o usuário deve decidir se irá adicionar mais de um produto, exibir todos os produtos cadastrados ou excluir um produto pelo nome. */

        Scanner leitorProdutos = new Scanner(System.in); //entrada do usuario

        Map<String, Double> listaProdutos = new HashMap<String, Double>(); //lista map

        System.out.println("___Cadastro de Produtos___");
        boolean loop = true;
        //início do laço
        while (loop) {
            System.out.println("Escolha uma opção:");
            System.out.println("Digite 1 para cadastrar produto.");
            System.out.println("Digite 2 exibir lista de produtos cadastrados.");
            System.out.println("Digite 3 excluir um produto.");
            System.out.println("Digite 4 fechar o programa.");

            int opcaoMenu = leitorProdutos.nextInt(); //opção que o usuário inseriu
            leitorProdutos.nextLine(); //limpar o buffer evita erro de entrada de dados
            //início do menu
            switch (opcaoMenu) {
                case 1: //cadastro do produto
                    System.out.println("Digite o nome do produto");
                    String nomeProduto = leitorProdutos.nextLine();
                    System.out.println("Digite o preço do produto");
                    Double precoProduto = leitorProdutos.nextDouble();
                    listaProdutos.put(nomeProduto, precoProduto);
                    System.out.println("___Produto cadastrado com sucesso___");
                    break;
                case 2:
                    if (listaProdutos.isEmpty()) { //se o usuario não tiver cadastrado nada ainda
                        System.out.println("___Ainda não foram cadastrados produtos no sistema. Faça o cadastro primeiramente!___");
                    } else { //mostra a lista de dos produtos que o usuario já cadastrou
                        for (String verificarLista : listaProdutos.keySet()) {
                            System.out.println("Produto: " + verificarLista + "\t\t " + "valor R$ " + listaProdutos.get(verificarLista));
                        }
                    }
                    break;
                case 3:
                    if (listaProdutos.isEmpty()) { //se o usuario não tiver cadastrado nada ainda
                        System.out.println("___Ainda não foram cadastrados produtos no sistema. Faça o cadastro primeiramente!___");
                    } else {
                        System.out.println("Digite o nome do produto que deseja excluir da lista:"); //exclusão de um produto do cadastro
                        String produtoDeletado = ""; //entrada do produto a ser deletado
                        String deletarProduto = leitorProdutos.nextLine();
                        for (String verificaProduto : listaProdutos.keySet()) {
                            produtoDeletado = deletarProduto;
                        }
                        System.out.println("A exclusão do produto " +deletarProduto+" foi realizada com sucesso do cadastro!"); //mensagem de confirmção do produto que foi excluido
                        listaProdutos.remove(produtoDeletado);
                    }
                    break;
                case 4: //finaliza o programa
                    System.out.println("___Obrigada por utilizar nosso sistema!___");
                    loop = false; //encerra o loop
                    break;
                default: //usuário inseriu opção inválida
                    System.out.println("___Você inseriu uma opção inválida. Digite uma opção válida!___");
                    break;
            }
        }
    }
}