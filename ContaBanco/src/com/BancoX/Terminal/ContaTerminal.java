package com.BancoX.Terminal;

import java.util.Scanner;

public class ContaTerminal {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("----- Seja Bem-Vindo(a) ao BancoX -----");

        System.out.println("Para criar uma nova conta, por favor, digite a Conta: ");
        int contaCorrente = input.nextInt();
        input.nextLine();

        System.out.println("Digite Agência: ");
        String agenciaBanco = input.nextLine();

        System.out.println("Digite seu Nome Completo: ");
        String nomeCompleto = input.nextLine();

        System.out.println("Digite valor de Depósito: ");
        double saldoConta = input.nextDouble();
        
        input.close();

        System.out.println("Olá "+nomeCompleto+", obrigado por criar uma conta em nosso banco, sua agência é "+agenciaBanco+ ", conta "+contaCorrente+" e seu saldo R$"+saldoConta+" já está disponivel para saque.");

        
    }
    
}
