package br.com.dio;

public class MensagemDia {
    public static void HoraDia(int hora){
        if(hora>=5 && hora<=11){
            System.out.println("Bom dia!");
        }else if(hora>=12 && hora<=17){
            System.out.println("Boa tarde!");
        }else if(hora>=18 && hora<=23 || hora>=0 && hora<=4){
            System.out.println("Boa noite!");
        }else{
            System.out.println("Horário inválido!");
        }
    }
}
