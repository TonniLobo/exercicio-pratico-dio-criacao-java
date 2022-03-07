package br.com.dio;

public class Emprestimo {

    public static double taxaCincoParcelas(){
        return 0.2;
    }
    public static double taxaAcimaCincoParcelas(){
        return 0.6;
    }

    public static void calculo(double valor, int parcelas){
        if(parcelas<=5){
            double valorFinal = valor+(valor*taxaCincoParcelas());
            System.out.println("Valor final do empréstimo para "+parcelas+" Parcelas: R$ "+valorFinal);
        } else if(parcelas>5){
            double valorFinal = valor+(valor*taxaAcimaCincoParcelas());
            System.out.println("Valor final do empréstimo para "+parcelas+" Parcelas: R$ "+valorFinal);
        }else{
            System.out.println("Cálculo inválido");
        }
    }
}
