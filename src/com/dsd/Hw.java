package com.dsd;

import java.util.Locale;

public class Hw {
    
    static String first (String str) {
        return str.substring(0,4)+str.substring(8,13);
    }

    static String second (String str) {
        String[] st = str.split ("");
        for (int i=0; i<st.length; i++) {
            String s = "1234567890-";
            if (!s.contains(st[i])) st[i]="*";
        }
        return String.join("", st);
    }

    static String third (String str) {
        String[] st = str.split ("-");
        String[] st1 = st[4].split("");
        String[] st2 = {st[1],st[3],st1[1],st1[3]};
        return String.join("/", st2).toLowerCase(Locale.ROOT);
    }

    static StringBuilder fourth (String str) {
        String[] st = str.split ("-");
        String[] st1 = st[4].split("");
        String[] st2 = {st[1],st[3],st1[1],st1[3]};
        String strout = String.join("/", st2).toUpperCase(Locale.ROOT);
        StringBuilder sb = new StringBuilder();
        sb.append("Letters:");
        sb.append(strout);
        return sb;
    }

    static String fifth (String str) {
        return (str.toLowerCase(Locale.ROOT).contains("abc")) ? "Номер документа содержит abc" : "Номер документа не содержит abc";
    }

    static String sixth (String str) {
        return (str.indexOf("555")==0) ? "Номер документа начинается с 555" : "Номер документа не начинается с 555";
    }

    static String seventh (String str) {
        return (str.lastIndexOf("1a2b")==18) ? "Номер документа заканчивается 1a2b" : "Номер документа не заканчивается 1a2b";
    }

    static boolean check (String str){
        String[] st = str.split ("");
        String s = "1234567890";
        String s2 = "-";
        if (!s.contains(st[0])) return false;
        if (!s.contains(st[1])) return false;
        if (!s.contains(st[2])) return false;
        if (!s.contains(st[3])) return false;
        if (!s2.contains(st[4])) return false;
        if (s.contains(st[5])) return false;
        if (s.contains(st[6])) return false;
        if (s.contains(st[7])) return false;
        if (!s2.contains(st[8])) return false;
        if (!s.contains(st[9])) return false;
        if (!s.contains(st[10])) return false;
        if (!s.contains(st[11])) return false;
        if (!s.contains(st[12])) return false;
        if (!s2.contains(st[13])) return false;
        if (s.contains(st[14])) return false;
        if (s.contains(st[15])) return false;
        if (s.contains(st[16])) return false;
        if (!s2.contains(st[17])) return false;
        if (!s.contains(st[18])) return false;
        if (s.contains(st[19])) return false;
        if (!s.contains(st[20])) return false;
        return !s.contains(st[21]);
    }


}
