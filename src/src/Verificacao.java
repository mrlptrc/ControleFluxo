public class Verificacao {
    static void verificar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm >= parametroDois)
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
    }
}