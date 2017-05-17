/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gui Freitas
 */
public class TesteClasses {

    public static void main(String[] args) {
        int numero = 11;
        System.out.println("Exe1 - A soma de 1 ate " + numero + " - Não-Recursivo: " + Exe1.naoRecursivo(numero));
        System.out.println("Exe1 - A soma de 1 ate " + numero + " - Recursivo: " + Exe1.recursivo(numero));
        System.out.println("#################");
        System.out.println("Exe2 - O fatorial de " + numero + " - Não-Recursivo: " + Exe2.naoRecursivo(numero));
        System.out.println("Exe2 - O fatorial de " + numero + " - Recursivo: " + Exe2.recursivo(numero));
        System.out.println("#################");
        System.out.println("Exe3 - A soma de S(n) = 1³ ate " + numero + "³ - Não-Recursivo: " + Exe3.naoRecursivo(numero));
        System.out.println("Exe3 - A soma de S(n) = 1³ ate " + numero + "³ - Recursivo: " + Exe3.recursivo(numero));
        System.out.println("#################");
        System.out.println("Exe4 - O valor de K elevado a N - Não-Recursivo: " + Exe4.naoRecursivo(5, 3));
        System.out.println("Exe4 - O valor de K elevado a N - Recursivo: " + Exe4.recursivo(5, 3));
        System.out.println("#################");
        System.out.println("Exe5 - O Fibonacci na posição " + numero + " - Não-Recursivo: " + Exe5.naoRecursivo(numero));
        System.out.println("Exe5 - O Fibonacci na posição " + numero + " - Recursivo: " + Exe5.recursivo(numero));
        System.out.println("#################");
        System.out.println("Exe6 -  " + numero + " - Não-Recursivo: " + Exe6.naoRecursivo(numero));
        System.out.println("Exe6 -  " + numero + " - Recursivo: " + Exe6.recursivo(numero));
        System.out.println("#################");
        System.out.println("Exe7 - Sequencia crescente de 0 a " + numero + " - Não-Recursivo: " + Exe7.naoRecursivo(numero));
        System.out.println("Exe7 - Sequencia crescente de 0 a " + numero + " - Recursivo: " + Exe7.recursivo(numero));
        System.out.println("#################");
        System.out.println("Exe8 - Sequencia decrescente de " + numero + " ate 0 - Não-Recursivo: " + Exe8.naoRecursivo(numero));
        System.out.println("Exe8 - Sequencia decrescente de " + numero + " ate 0 - Recursivo: " + Exe8.recursivo(numero));
        System.out.println("#################");
    }
}
