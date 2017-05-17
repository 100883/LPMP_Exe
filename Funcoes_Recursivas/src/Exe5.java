/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gui Freitas
 */
public class Exe5 {

    public static int naoRecursivo(int numero) {
        int fibo = 0;     // atual
        int ant = 0;   // anterior

        for (int i = 1; i <= numero; i++) {

            if (i == 1) {
                fibo = 1;
                ant = 0;
            } else {
                fibo += ant;
                ant = fibo - ant;
            }

        }

        return fibo;
    }

    public static int recursivo(int numero) {
        if (numero < 2) {
            return numero;
        } else {
            return recursivo(numero - 1) + recursivo(numero - 2);
        }
    }
}
