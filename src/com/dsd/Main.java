package com.dsd;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("\tHomeWork");

        Hw hw = new Hw();
      //  Scanner sc = new Scanner(System.in);
      //  String documentNum = sc.nextLine();
        String documentNum = "5555-abc-5558-где-1a2b";

        if (hw.check(documentNum)) {
            System.out.println(hw.first(documentNum));
            System.out.println(hw.second(documentNum));
            System.out.println(hw.third(documentNum));
            System.out.println(hw.fourth(documentNum));
            System.out.println(hw.fifth(documentNum));
            System.out.println(hw.sixth(documentNum));
            System.out.println(hw.seventh(documentNum));
        }
        else System.out.println("Неккоректный ввод");

        System.out.println("\n\tMade by Dmitry Drako (─‿‿─)");

    }
}
