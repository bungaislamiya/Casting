/*
Nama    : Bunga Islamiya Putri
NPM     : 20191310053
latihan Bab 2
*/

package com.company;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan nilai pembelian RP");
        double nilaiPembelian = input.nextDouble();

        double pajak = nilaiPembelian * 0.08; //pajaknya 0.08%
        System.out.println("Pajak Tanpa casting adalah "+pajak);
        double casting = (int) (pajak*100)/100.0;
        System.out.println("Pajak dengan Casting adalah RP"+casting);// TODO code application logic here
    }
}