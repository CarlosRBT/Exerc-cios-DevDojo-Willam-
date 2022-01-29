import java.util.Scanner;

public class Aplicativo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int retornarMenu = 1;
            System.out.println("\n\nOlá, seja bem vindo a Montadora DevDojo Automóveis, a maior e mais completa montadora de carros do planeta!");
            System.out.println("É uma satisfação enorme recebe-lo, aqui em baixo está uma lista marcas de veículos que temos a disposição.\n");
            System.out.println("1|GM        \t2|Hyundai  \t3|Volkswagen \t4|Audi \t5|Mercedes \t6|Peugeot \t7|SAIR\n" +
                    "|-----------\t|----------\t|------------\t|------\t|----------\t|---------\t|\n" +
                    "| Suburban  \t| Azera    \t| Golf       \t| A4   \t| C 180    \t| 206     \t|\n" +
                    "| Malibu    \t| Sonata   \t| Jetta      \t| Q7   \t| C 200    \t| 208     \t|\n" +
                    "| Silverado \t| Veloster \t| Polo       \t| R8   \t| GLA 200  \t| 2008    \t|\n");


            String[][] arrayMulti = new String[6][3];
            arrayMulti[0][0] = "\n-Suburban";
            arrayMulti[0][1] = "\n-Malibu";
            arrayMulti[0][2] = "\n-Silverado";
            arrayMulti[1][0] = "\n-Azera";
            arrayMulti[1][1] = "\n-Sonata";
            arrayMulti[1][2] = "\n-Veloster";
            arrayMulti[2][0] = "\n-Golf";
            arrayMulti[2][1] = "\n-Jetta";
            arrayMulti[2][2] = "\n-Polo";
            arrayMulti[3][0] = "\n-A4";
            arrayMulti[3][1] = "\n-Q7";
            arrayMulti[3][2] = "\n-R8";
            arrayMulti[4][0] = "\n-C 180";
            arrayMulti[4][1] = "\n-C 200";
            arrayMulti[4][2] = "\n-GLA 200";
            arrayMulti[5][0] = "\n-206";
            arrayMulti[5][1] = "\n-208";
            arrayMulti[5][2] = "\n-2008";

            System.out.println("Por favor, digite um número correspondente a marca que deseja consultar:");

            int marcasVeiculo = scanner.nextInt();
            System.out.println("Sua escolha foi: " + marcasVeiculo);


            if (marcasVeiculo == 1) {
                System.out.printf("Os veículos disponíveis são: ");
                for (int i = 0; i < 1; i++) {
                    for (int j = 0; j < 3; j++) {

                        System.out.print(arrayMulti[i][j]);
                    }

                }


            } else if (marcasVeiculo == 2) {
                System.out.printf("Os veículos disponíveis são: ");
                for (int i = 1; i < 2; i++) {
                    for (int j = 0; j < 3; j++) {

                        System.out.print(arrayMulti[i][j]);
                    }

                }


            } else if (marcasVeiculo == 3) {
                System.out.printf("Os veículos disponíveis são: ");
                for (int i = 2; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {

                        System.out.print(arrayMulti[i][j]);
                    }

                }

            } else if (marcasVeiculo == 4) {
                System.out.printf("Os veículos disponíveis são: ");
                for (int i = 3; i < 4; i++) {
                    for (int j = 0; j < 3; j++) {

                        System.out.print(arrayMulti[i][j]);
                    }

                }
            } else if (marcasVeiculo == 5) {
                System.out.printf("Os veículos disponíveis são: ");
                for (int i = 4; i < 5; i++) {
                    for (int j = 0; j < 3; j++) {

                        System.out.print(arrayMulti[i][j]);
                    }

                }
            } else if (marcasVeiculo == 6) {
                System.out.printf("Os veículos disponíveis são: ");
                for (int i = 5; i < 6; i++) {
                    for (int j = 0; j < 3; j++) {

                        System.out.print(arrayMulti[i][j]);
                    }

                }
            } else if (marcasVeiculo == 7) {
                System.out.println("Encarrando programa");
                break;
            } else if (marcasVeiculo < 1 || marcasVeiculo > 6) {
                System.out.println("Opção inválida");
                continue;
            }


            boolean menu = true;

            while (menu) {
                System.out.println("\n\nPor Favor, digite 1 para voltar ao menu:");
                int valor = scanner.nextInt();
                if (valor == 1) {
                    menu = false;


                } else if (valor != 1) {
                    System.out.println("Opção inválida");
                    continue;
                }

            }


        }

    }

}
