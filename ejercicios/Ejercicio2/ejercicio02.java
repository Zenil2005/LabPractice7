package mx.unam.fi.poo.g1.p7.ejercicios.ejercicio02.ejercicio02;
import mx.unam.fi.poo.g1.p7.ejercicios.ejercicio02.CuentaBanco.CuentaBanco;
import mx.unam.fi.poo.g1.p7.ejercicios.ejercicio02.CuentaAhorro.CuentaAhorro;

public class ejercicio02 {


    public static void main(String [] args){
        System.out.println("Se crea un objeto Cuenta Banco (C/b No. CB1234) con un saldo de $5000");
        CuentaBanco CB1234 = new CuentaBanco("CB1234", 5000.0);

        System.out.println("Se depositan $1000 a la cuenta CB1234");
        CB1234.depositar(1000.0);
        System.out.println("Saldo nuevo " + CB1234.getSaldo());

        System.out.println("Se retiran $600 pesos de la cuenta");
        CB1234.retirar(600.0);
        System.out.println("Saldo nuevo: " + CB1234.getSaldo());

        System.out.println("\n Creando un objeto CuentaAhorro (C/a No. CA1000) con un saldo inicial de $450");
        CuentaAhorro CA1000 = new CuentaAhorro("CA1000", 450);

        System.out.println("Se retiran 300 pesos de la cuenta de Ahorro");
        CA1000.retirar(300.0);
        System.out.println("Nuevo saldo: " + CA1000.getSaldo());

        System.out.println("\n Creando un objeto CuentaAhorro (C/a No. CA1001) con un saldo inicial de $100");
        CuentaAhorro CA1001 = new CuentaAhorro("CA1001", 100);
        System.out.println("Se intenta retiro por $250");
        CA1001.retirar(250.0);
        System.out.println("Sueldo actual: " + CA1001.getSaldo());
    }
    
}
