/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.pertemuan402;

/**
 *
 * @author LAB F
 */
public class Pertemuan402 {
    public static String[][] meja= new String [2][2];
    public static void main(String[] args) {
        meja[0][0] = "data brs 0 klm 0";
        meja[0][1] = "data brs 0 klm 1";
        
        meja[1][0] = "data brs 1 klm 0";
        meja[1][1] = "data brs 1 klm 1";
        
        for(int br=0;br<2;br++){
            for(int kl=0;kl<2;kl++){
                System.out.println("Posisi "+br+":"+kl+" = "+ meja[br][kl]);
            }
        }
    }
}
