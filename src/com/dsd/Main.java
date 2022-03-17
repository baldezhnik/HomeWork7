package com.dsd;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Hw hw = new Hw();
        Scanner sc = new Scanner(System.in);
        String documentNum = sc.nextLine();

        System.out.println(hw.first(documentNum));




    }
}
