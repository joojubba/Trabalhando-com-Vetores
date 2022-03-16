import java.util.Scanner;

    public class Main {
        public static void main(String[] args){
            Scanner input = new Scanner(System.in);
            System.out.println();
            System.out.println("--- PTI: Trabalhando com Vetores ---");

            System.out.println();
            System.out.println("Informe o tamanho do vetor: ");
            int qtd = input.nextInt();

            if (qtd > 0) {
                int[] vetor = new int[qtd];
                for (int i = 0; i < qtd; i++) {
                    System.out.println("Informe os valores para o vetor de tamanho " + qtd);
                    vetor[i] = input.nextInt();
                }

                System.out.println();
                System.out.println(maiorDiferenca(vetor));
                System.out.println(ordemCrescente(vetor));
            }

        }

        public static int maiorDiferenca(int[] x) {
            int maior = x[0], menor = x[0];
            System.out.println("## A maior diferença entre dois elementos distintos no vetor é: ");
            for (int i = 1; i < x.length; i++) {
                if (x[i] > maior) {
                    maior = x[i];
                }
                if (x[i] < menor){
                    menor = x[i];
                }
            }
            return maior - menor;
        }

        public static boolean ordemCrescente(int[] x) {
            System.out.println();
            System.out.println("## O vetor está em ordem crescente? A mensagem a seguir confirmará true (para verdadeiro) ou false (para falso): ");
            for (int i = 1; i < x.length; i++) {
                if (x[i] < x[i - 1]) {
                    return false;
                }

            }
            return true;
        }

    }
