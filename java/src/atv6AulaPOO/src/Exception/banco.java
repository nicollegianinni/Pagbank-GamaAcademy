package Exception;

public class banco {

    //metodo
    public void saque (double valor, conta cliente) throws saldoInsuficienteException {

        if (valor <= cliente.getSaldo()){
            cliente.setSaldo(cliente.getSaldo() - valor);
            System.out.println(cliente.getSaldo());

           /* outra formade fazer o processamento do if:
            double valorFuturo = cliente.getSaldo() - valor;
            cliente.getSaldo(valorFuturo);
           */

        }else {
            throw new saldoInsuficienteException();
        }
    }

    public static void main (String [] args ) throws Exception {

        banco Banco = new banco ();

        conta c1 = new conta ();
        c1.setSaldo(50);

        conta c2 = new conta ();
        c2.setSaldo(8000);

        conta c3 = new conta ();
        c3.setSaldo(200);


        try {
            Banco.saque (10 , c1 );
            System.out.println("novo saldo  : " + c1.getSaldo());

        } catch (saldoInsuficienteException saldo) {
            System.out.println(saldo.getMessage() + "na conta 1.");
        }


        try {
            Banco.saque (9000 , c2);
            System.out.println(" novo saldo é : " + c2.getSaldo());

        } catch (saldoInsuficienteException saldo) {
            System.out.println(saldo.getMessage() + "na conta 2.");
        }   System.out.println("seu saldo é : " + c2.getSaldo());


        try {
            Banco.saque (200 , c3);
            System.out.println(" novo saldo é : " + c3.getSaldo());

        } catch (saldoInsuficienteException saldo) {
            System.out.println(saldo.getMessage() + "na conta 3.");
        }
    }
}
