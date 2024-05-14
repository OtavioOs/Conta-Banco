package com.BancoX.Terminal;

import java.util.Scanner;

/**<h1>ContaBanco</h1>
 * Desafio proposto pelo instrutor de Java <b>Gleyson Sampaio</b>, corresponde á Sintaxe Java.
 * <p>
 * <b>Nota:</b>Neste Desafio contém maioria dos Sintaxe java mostrado no treinamento. Sendo elas: <p>
 * Classes, Tipos de Variáveis, CamelCase, Indicações proibidas em nomes de variáveis, Organização de Arquivos, Concatenação, Java Doc.
 * 
 * @author Otávio de Andrade Alves
 * @version 2.0
 * @since 14/05/2024
 * 
 * @param input Classe. Variável de chamada da classe Scanner, recebendo entrada no terminal do usuario.
 * @param contaCorrente int. Variável de entrada sobre conta corrente.
 * @param agenciaBanco String. Variável de entrada sobre agência Bancaria.
 * @param nomeCompleto String. Variável de entrada sobre Nome completo.
 * @param saldoConta Double. Variável de entrada com valor Decimal 
 * @return Não há tipos de Retornos.
 */

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
