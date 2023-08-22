import java.util.Scanner;
public class UI {
    private Scanner sc;

    public UI(Scanner sc) {
        this.sc = sc;
    }
    public String pedeInfo(String msg){
        System.out.println(msg);
        String ler = sc.nextLine();
        return ler;
    }

    public int pedeInt(String mensagem){
        while(true) {
            try{
                return Integer.parseInt(pedeInfo(mensagem));
            } catch (NumberFormatException e){
                escrever("Entrada inválida. Por favor, informe um número inteiro válido");
            }
        }
    }
    public String escrever(String msg){
        System.out.println(msg);
        return msg;
    }

}