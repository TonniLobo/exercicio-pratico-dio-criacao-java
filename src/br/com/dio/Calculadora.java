package br.com.dio;

public class Calculadora {

    public static void somar(Double a, Double b){
        Double resultado = a+b;
        System.out.println("Soma: "+resultado);
    }
    public static void subtrair(Double a, Double b){
        Double resultado = a-b;
        System.out.println("Subtração: "+resultado);
    }
    public static void dividir(Double a, Double b){
        Double resultado = a/b;
        System.out.println("Divisão: "+resultado);
    }
    public static void multiplicar(Double a, Double b){
        Double resultado = a*b;
        System.out.println("Multiplicação: "+resultado);
    }

}
