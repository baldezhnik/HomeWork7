package com.dsd;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("\tHomeWork");

      //  Scanner sc = new Scanner(System.in);   типо мы реализовали сканнер и все такое
      //  String documentNum = sc.nextLine();    но удобнее прямо в коде))
        String documentNum = "5155-aBc-5558-где-1a2b";

        if (Hw.check(documentNum)) {
            System.out.println(Hw.first(documentNum));
            System.out.println(Hw.second(documentNum));
            System.out.println(Hw.third(documentNum));
            System.out.println(Hw.fourth(documentNum));
            System.out.println(Hw.fifth(documentNum));
            System.out.println(Hw.sixth(documentNum));
            System.out.println(Hw.seventh(documentNum));
        }
        else System.out.println("Неккоректный ввод");

        System.out.println("\n\tMade by Dmitry Drako (─‿‿─)");

    }
}
