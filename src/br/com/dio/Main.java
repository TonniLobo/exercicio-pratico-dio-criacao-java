package br.com.dio;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        //calculadora
        Double a=0d;
        Double b=0d;

        //hora do dia
        int Hora=0;

        //empréstimo
        int parcelas;
        double valor;

        System.out.println("Digite o Primeiro valor: ");
        a = scan.nextDouble();
        System.out.println("Digite o Segundo valor: ");
        b = scan.nextDouble();

        //Calculadora
        Calculadora.somar(a,b);
        Calculadora.subtrair(a,b);
        Calculadora.dividir(a,b);
        Calculadora.multiplicar(a,b);

        //Mensagem do dia
        System.out.println("Digite a hora do dia (formato 24 h): ");
        Hora = scan.nextInt();
        MensagemDia.HoraDia(Hora);

        //Juros Empréstimo
        parcelas = scan.nextInt();
        valor = scan.nextDouble();
        Emprestimo.calculo(valor,parcelas);
    }
}
