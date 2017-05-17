/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gui Freitas
 */
public class Exe1 {

    public static int naoRecursivo(int numero) {
        int soma = 0;
        for (int i = 1; i <= numero; i++) {
            soma += i;
        }
        return soma;
    }

    public static int recursivo(int numero) {
        if (numero == 1) {
            return numero;
        } else {
            return recursivo(numero - 1) + numero;
        }
    }

}
