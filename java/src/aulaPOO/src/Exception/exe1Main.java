package Exception;

public class exe1Main {

    public void metodo1(int parametro) throws Exception {

        if (parametro < 20) {
            throw new exe1NumeroMenorQuevinteException(("numero precisa ser maior que 20!"));
        } else {
            System.out.println("ok!");
        }
    }

    public static void main(String[] agrs) {

        exe1Main resultado = new exe1Main();

        try {
            resultado.metodo1(10); // para testar so mudar o numero
        } catch (Exception Erro) {
            System.out.println(Erro.getMessage());
        }

    }
}
