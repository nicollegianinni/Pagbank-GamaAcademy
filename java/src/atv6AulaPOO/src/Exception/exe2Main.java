package Exception;

public class exe2Main {

    public void metodo2 (int  numero) throws Exception {
        if (numero > 50 ) {
            throw new exe2Verifica50 (("ok!"));
        } else {
            System.out.println("numero precisa ser maior que 50!");
        }
    }
    public static void main(String[] agrs){

        exe2Main resultado = new exe2Main();

        try {
            resultado.metodo2(10); // para testar so mudar o numero
        } catch (Exception Erro) {
            System.out.println(Erro.getMessage());
        }
    }
}


