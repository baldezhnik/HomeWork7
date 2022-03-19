package com.dsd;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Hw hw = new Hw();
      //  Scanner sc = new Scanner(System.in);
      //  String documentNum = sc.nextLine();
        String documentNum = "5554-abc-5558-где-1a2b";

        System.out.println(hw.first(documentNum));
        System.out.println(hw.second(documentNum));
        System.out.println(hw.third(documentNum));
        System.out.println(hw.fourth(documentNum));
        System.out.println(hw.fifth(documentNum));
        System.out.println(hw.sixth(documentNum));
        System.out.println(hw.seventh(documentNum));

    }
}
