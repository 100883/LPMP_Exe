/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gui Freitas
 */
public class Exe4 {

    public static int naoRecursivo(int k, int n) {
        
        for (int i = 1; i <= n; i++) {
            k *= i;
        }
        return k;
    }

    public static int recursivo(int k, int n) {
        return 0;
    }

}
