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
        int numero = 5;
        System.out.println("Exe1 - A soma de 1 ate " + numero + " - Não-Recursivo: " + Exe1.naoRecursivo(numero));
        System.out.println("Exe1 - A soma de 1 ate " + numero + " - Recursivo: " + Exe1.recursivo(numero));
        System.out.println("#################");
        System.out.println("Exe2 - O fatorial de " + numero + " - Não-Recursivo: " + Exe2.naoRecursivo(numero));
        System.out.println("Exe2 - O fatorial de " + numero + " - Recursivo: " + Exe2.recursivo(numero));
        System.out.println("#################");
        System.out.println("Exe3 - A soma de S(n) = 1³ ate " + numero + "³ - Não-Recursivo: " + Exe3.naoRecursivo(numero));
        System.out.println("Exe3 - A soma de S(n) = 1³ ate " + numero + "³ - Recursivo: " + Exe3.recursivo(numero));
        System.out.println("#################");
    }
}
