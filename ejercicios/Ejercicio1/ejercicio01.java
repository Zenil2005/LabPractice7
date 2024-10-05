package mx.unam.fi.poo.g1.p7.ejercicios.ejercicio01.ejercicio01;
import mx.unam.fi.poo.g1.p7.ejercicios.ejercicio01.Figura.Figura;
import mx.unam.fi.poo.g1.p7.ejercicios.ejercicio01.Rectangulo.Rectangulo;
import mx.unam.fi.poo.g1.p7.ejercicios.ejercicio01.Circulo.Circulo;

public class ejercicio01 {

    public static void main(String[]args){
        Rectangulo rectangulo = new Rectangulo(3.0, 10.0);
        System.out.println(rectangulo);

        System.out.println();

        Circulo circulo = new Circulo(5.0);
        System.out.println(circulo);
    }
    
}
