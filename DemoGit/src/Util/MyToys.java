/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

/**
 *
 * @author USER
 */
public class MyToys {
    // ham static la ham xai ngay va luon ko can new, ten class.
    public static int computeFactoria(int n){
//        if(n < 0)
//            throw new IllegalArgumentException("invalid argument. it must be >= 0");
//        else if(n == 0 || n == 1)
//            return 1;
//        else
//            return computeFactoria(n - 1) * n;
        // toi uu code, chinh lai code
        //xai vong lap thay vi de quy
        int tmp = 1;
        if (n < 0)
            throw new IllegalArgumentException("invalid argument. it must be >= 0");
        else if(n == 0 || n == 1)
            return 1;
        else {
            for (int i = 2; i <= n; i++) {
                tmp *= i;    //tmp = tmp * i;
                    // ki thuat nhoi con heo dat
                    // m den t tiep chieu
                    // m dua 1 t nhan 1
                    //m dua 2 t nhan 2
                    // m dua n t nhan n
                    // ban dau t la 1
            }
            return tmp;
        }
    }
}
