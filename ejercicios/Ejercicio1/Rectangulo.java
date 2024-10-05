package mx.unam.fi.poo.g1.p7.ejercicios.ejercicio01.Rectangulo;
import mx.unam.fi.poo.g1.p7.ejercicios.ejercicio01.Figura.Figura;

public class Rectangulo extends Figura{
    private double base, altura;

    public Rectangulo(double base, double altura){
        setBase(base);
        setAltura(altura);
    }

    public void setBase(double base){
        this.base = base;
    }

    public void setAltura(double altura){
        this.altura = altura;
    }

    public double getBase(){
        return this.base;
    }

    public double getAltura(){
        return this.altura;
    }

    @Override
    public double area(){
        return this.base * this.altura;
    }

    @Override
    public String toString(){
        return "El área del rectángulo es: " + this.area();
    }


}