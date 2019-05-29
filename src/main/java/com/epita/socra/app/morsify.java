package com.epita.socra.app;

import com.epita.socra.app.tools.IOAdapter;

public class morsify {
    private static String morsify(String number)
    {
        String tab [] = {
            "_ _ _ _ _", // 0
            ". _ _ _ _", // 1
            ". . _ _ _", // 2
            ". . . _ _", // 3
            ". . . . _", // 4
            ". . . . .", // 5
            "_ . . . .", // 6
            "_ _ . . .", // 7
            "_ _ _ . .", // 8
            "_ _ _ _ ."  // 9
        };
        return number.length() > 0 ? tab[number.charAt(0) - '0']  + " " + morsify(number.substring(1)): "";
    }
    public static void run(String number, IOAdapter adapter)
    {

            number = String.format("%d", Integer.parseUnsignedInt(number));
            adapter.write(morsify(number));
    }
}
