package Exception;

public class exe3VerificaValor extends Exception {

    public static void verificaValor(int valores) {

            if (valores < 100 && valores > 0) {
                System.out.println("valores entre 0 e 100.!");
                // teste1
            } else if (valores < 0) {
                System.out.println("valores são negativos !");
                //teste2
            } else if (valores < 50) {
                System.out.println("valores menores que 50 !");
            }

        }

        public static void main (String[]agrs){

            exe3VerificaValor verificaValor = new exe3VerificaValor();

            try {
                verificaValor((int)Math.random()); // para testar so mudar o numero

            } catch (Exception Erro) {
                System.out.println("\n" + Erro.getMessage());
            }

        }
    }

