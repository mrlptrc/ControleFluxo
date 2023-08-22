import java.util.Scanner;

public class Contagem {
    private Scanner sc;
    UI ui = new UI(sc);

    void realizarContagem(int parametroUm, int parametroDois){
        int quantidadeNumeros = parametroDois - parametroUm + 1;
        int totalOcorrencias = 0;

        for (int i = 1;i <quantidadeNumeros; i++) {
            int numero = parametroUm + i;
            ui.escrever(i + "\t" + numero);
            totalOcorrencias++;
        }

        System.out.println("Total de ocorrências: " + totalOcorrencias);
    }
}
