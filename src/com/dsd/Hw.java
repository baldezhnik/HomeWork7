package com.dsd;

import java.util.Locale;

public class Hw {
    
    String first (String str) {
        String strout = str.substring(0,4)+str.substring(8,13);
        return strout;
    }

    String second (String str) {
        String strout = null;

        return strout;
    }

    String third (String str) {
        String strout = null;

        return strout;
    }

    String fourth (String str) {
        String strout = null;

        return strout;
    }

    String fifth (String str) {
        String strout = (str.toLowerCase(Locale.ROOT).contains("abc")) ? "Номер документа содержит abc" : "Номер документа не содержит abc";
        return strout;
    }

    String sixth (String str) {
        String strout = (str.indexOf("555")==0) ? "Номер документа начинается с 555" : "Номер документа не начинается с 555";
        return strout;
    }

    String seventh (String str) {
        String strout = (str.lastIndexOf("1a2b")==18) ? "Номер документа заканчивается 1a2b" : "Номер документа не заканчивается 1a2b";
        return strout;
    }

}
