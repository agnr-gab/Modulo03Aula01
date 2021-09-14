package br.com.zup;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Lista01Ex02 {
    public static void main(String[] args) {
        /* 2. Crie um programa para gerenciar uma lista de candidatos de um vestibular, cada candidato tem número de matrícula e uma nota. No final do programa, o usuário deve decidir se irá adicionar mais de um candidato, exibir todos os candidatos cadastrados ou excluir um candidato pelo número de matrícula. */
        Scanner leitorMatricula = new Scanner(System.in);

        Map<Double, Double> listaMatricula = new HashMap<Double, Double>();

        System.out.println("___Cadastro de Vestibular___");
        int opcaoMenu = 0;

        do {
            System.out.println("Escolha uma opção e digite o número correspondente:");
            System.out.println("Digite 1 para matricular candidate.");
            System.out.println("Digite 2 exibir lista de candidates cadastrades.");
            System.out.println("Digite 3 excluir canditade cadastrade.");
            System.out.println("Digite 4 fechar o programa.");

            opcaoMenu = leitorMatricula.nextInt(); //opção que o usuário inseriu
            leitorMatricula.nextLine(); //limpar o buffer evita erro de entrada de dados

            if (opcaoMenu == 1) {
                System.out.println("Digite o número da matrícula do canditade:");
                Double matriculaAlune = leitorMatricula.nextDouble();
                System.out.println("Digite a nota do canditade:");
                Double notaAlune = leitorMatricula.nextDouble();
                listaMatricula.put(matriculaAlune, notaAlune);
                System.out.println("___Canditade cadastrade com sucesso___");
            }
            if (opcaoMenu == 2)//mostra a lista de dos produtos que o usuario já cadastrou
                for (Double verificarLista : listaMatricula.keySet()) {
                    System.out.println("Produto: " + verificarLista + "valor R$ " + listaMatricula.get(verificarLista));
                }
            if (opcaoMenu == 3) {
                System.out.println("Digite o numero da matrícula de canditade que deseja excluir da lista:"); //exclusão de um produto do cadastro
                double matriculaDeletada = 0; //entrada do produto a ser deletado
                double deletarMatricula = leitorMatricula.nextDouble();
                for (Double verificaMatricula : listaMatricula.keySet()) {
                    matriculaDeletada = deletarMatricula;
                }
                System.out.println("A exclusão da matrícula nº " +deletarMatricula+" foi realizada com sucesso !"); //mensagem de confirmção do produto que foi excluido
                listaMatricula.remove(matriculaDeletada);
            }
            if (opcaoMenu == 4) {
                break;
            }
        } while (opcaoMenu >= 3);
    }
}

