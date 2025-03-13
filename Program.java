package Desafio1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

    public class Program {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            List<Ninja> bancoDeNinjas = new ArrayList<>();


            Missao missao1 = new Missao("Resgatar um gato", StatusDaMissao.CONCLUIDA, 'D');
            Missao missao2 = new Missao("Patrulha noturna", StatusDaMissao.EM_ANDAMENTO, 'C');
            Missao missao3 = new Missao("Treinamento conjunto", StatusDaMissao.PENDENTE, 'E');
            Missao missao4 = new Missao("Infiltração secreta", StatusDaMissao.EM_ANDAMENTO, 'A');


            Ninja kakashi = new Ninja("Kakashi Hatake", 30, missao4);
            Ninja naruto = new Ninja("Naruto Uzumaki", 16, missao2);
            Ninja sakura = new Ninja("Sakura Haruno", 16, missao1);
            Ninja sasuke = new Ninja("Sasuke Uchiha", 16, missao3);


            bancoDeNinjas.add(kakashi);
            bancoDeNinjas.add(naruto);
            bancoDeNinjas.add(sakura);
            bancoDeNinjas.add(sasuke);


            System.out.println("\n🔹 Lista Inicial de Ninjas e Missões 🔹\n");
            for (Ninja ninja : bancoDeNinjas) {
                System.out.println(ninja + "\n---------------------");
            }

            while (true) {
                System.out.print("\nDeseja adicionar um novo ninja? (s/n): ");
                String resposta = scanner.next().toLowerCase();

                if (resposta.equals("n")) break;


                System.out.print("Nome do Ninja: ");
                scanner.nextLine();
                String nome = scanner.nextLine();

                System.out.print("Idade do Ninja: ");
                int idade = scanner.nextInt();

                System.out.print("Nome da Missão: ");
                scanner.nextLine();
                String nomeMissao = scanner.nextLine();

                System.out.print("Status da Missão (CONCLUIDA, EM_ANDAMENTO, PENDENTE): ");
                StatusDaMissao status = StatusDaMissao.valueOf(scanner.next().toUpperCase());

                System.out.print("Dificuldade da Missão (E, D, C, B, A, S): ");
                char dificuldade = scanner.next().charAt(0);


                Missao novaMissao = new Missao(nomeMissao, status, dificuldade);
                Ninja novoNinja = new Ninja(nome, idade, novaMissao);


                bancoDeNinjas.add(novoNinja);

                System.out.println("\n✅ Ninja adicionado com sucesso!\n");
            }


            System.out.print("\nDeseja ver o banco de ninjas cadastrados? (s/n): ");
            String verBanco = scanner.next().toLowerCase();

            if (verBanco.equals("s")) {

                System.out.println("\n📜 Banco de Ninjas 📜");
                System.out.println("---------------------------------------------------");
                System.out.printf("| %-20s | %-5s | %-15s |\n", "Nome", "Idade", "Missão");
                System.out.println("---------------------------------------------------");

                for (Ninja ninja : bancoDeNinjas) {
                    System.out.printf("| %-20s | %-5d | %-15s |\n",
                            ninja.getNome(),
                            ninja.getIdade(),
                            ninja.getMissao() != null ? ninja.getMissao().getNome() : "Nenhuma");
                }
                System.out.println("---------------------------------------------------");
            }


            System.out.println("\nMuito obrigado por utilizar nosso sistema! Até logo. 👋");
            scanner.close();
        }
    }
