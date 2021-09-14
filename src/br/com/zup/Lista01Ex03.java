package br.com.zup;

import java.util.HashMap;
import java.util.Scanner;

public class Lista01Ex03 {
    public static void main(String[] args) {
        /*   3. Crie um programa para gerenciar o cardápio de um restaurante. Cada prato tem um nome e pode conter diversos ingredientes. No final do programa, o usuário deve decidir se irá adicionar mais de um prato, exibir todos os pratos cadastrados ou excluir um prato pelo nome.   */
        Scanner leitorCardapio = new Scanner(System.in);

        HashMap<String, String> listaCardapio = new HashMap<String, String>();

        System.out.println("Bem-vinde ao nosso restaurante! \nMonte seu prato!");
        int opcaoMenu;
        boolean loop = true;
        while (loop) {
            System.out.println("Digite a opção desejada:");
            System.out.println("[1] para montar seu prato");
            System.out.println("[2] para verificar pratos cadastrados");
            System.out.println("[3] para excluir pratos cadastrados");
            System.out.println("[4] para encerrar o atendimento");

            opcaoMenu = leitorCardapio.nextInt();
            leitorCardapio.nextLine();

            if (opcaoMenu == 1) {
                System.out.println("Qual prato principal deseja?");
                String pratoNome = leitorCardapio.nextLine();
                System.out.println("Escolha os acompanhamentos para o prato principal: \nDigite quantos desejar, separe utilizando a virgula [,]");
                String ingredientesPrato = leitorCardapio.nextLine();
                listaCardapio.put(pratoNome, ingredientesPrato); //acrescenta e armazena os dados inseridos
                System.out.println("Prato cadastrado com sucesso! Bom apetite!");
            }
            if (opcaoMenu == 2) {
                if (listaCardapio.isEmpty()) { //se o usuario não tiver cadastrado nada ainda
                    System.out.println("Ainda não foi cadastrado um prato principal no sistema. Faça o cadastro primeiramente!");
                } else {
                    for (String verificarCardapio : listaCardapio.keySet()) {
                        System.out.println("O prato principal cadastrado foi: " + verificarCardapio + " com os ingredientes adicionais: " + listaCardapio.get(verificarCardapio));
                    }
                }
                if (opcaoMenu == 4) {
                    loop = false;
                    break;
                }
            }

        }
    }

}