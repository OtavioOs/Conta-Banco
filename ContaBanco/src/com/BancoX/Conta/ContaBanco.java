package com.BancoX.Conta;

import java.util.Scanner;

public class ContaBanco {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("----- Seja Bem-Vindo(a) ao BancoX -----");
        System.out.println("Para criar uma nova conta, por favor, digite a Conta: ");
        String contaCorrente = input.next();
        System.out.println("Digite Agencia: ");
        String agenciaBanco = input.next();
        System.out.println("Digite seu Nome Completo: ");
        String nomeCompleto = input.next();

        String[] inputArgs = contaCorrente.split(" ");
    }
}
