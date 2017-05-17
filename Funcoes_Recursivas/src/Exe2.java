/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gui Freitas
 */
public class Exe2 {

    public static int naoRecursivo(int numero) {
        int fat = 1;
        for (int i = 1; i <= numero; i++) {
            fat *= i;
        }
        return fat;
    }

    public static int recursivo(int numero) {
        if (numero == 1) {
            return numero;
        } else {
            return numero * recursivo(numero - 1);
        }
    }

}
