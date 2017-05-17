/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gui Freitas
 */
public class Exe8 {

    public static int naoRecursivo(int numero) {
        return 0;
    }

    public static int recursivo(int numero) {
        if (numero == 0) {
            return numero;
        } else {
            System.out.print(numero + " ");
            return recursivo(numero - 1);
        }
    }

}
