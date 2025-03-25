/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.pertemuan4;

import java.util.Scanner;

/**
 *
 * @author LAB F
 */
public class Pertemuan4 {

    public static void main(String[] args) {
        String [] nama = new String[5];
       
        nama[0] = "Arka";
        nama[1] = "Yudi";
        nama[2] = "Yanti";
        nama[3] = "Linda";
        nama[4] = "Ali";
        
        System.out.println("Data ke 1: "+nama[0] );
        
        for(int i=0;i<nama.length;i++){
            System.out.println("indek ke-"+i+": "+nama[i]);
        }
        Scanner scan = new Scanner(System.in);
        for(int y=0;y<5;y++){
               System.out.print("Isi Data Teman: ");
               nama[y] = scan.nextLine();
            }   
        System.out.println("-------");
        }
    }

