import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParametrosInvalidosException {
        Scanner sc = new Scanner(System.in);

        UI ui = new UI(sc);
        Verificacao verifica = new Verificacao();
        Contagem conta = new Contagem();

        int parametroUm = ui.pedeInt("Informe o primeiro parametro");
        int parametroDois = ui.pedeInt("Informe o segundo parametro");
        ui.escrever("");

        if (parametroUm > parametroDois) {
            try {
                Verificacao.verificar(parametroUm, parametroDois);
            } catch (ParametrosInvalidosException e) {
                ui.escrever("Exceção Lançada: " + e.getMessage());
                return;
            }
        }
    conta.realizarContagem(parametroUm, parametroDois);
    }
}