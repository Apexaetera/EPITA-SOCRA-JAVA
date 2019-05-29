package com.epita.socra.app;

import com.epita.socra.app.tools.IOAdapter;

public class unmorsify {
    private static int unmorsify(String number)
    {
        int res = 0;
        String tab [] = {
            "_ _ _ _ _", // 0
            "\\. _ _ _ _", // 1
            "\\. \\. _ _ _", // 2
            "\\. \\. \\. _ _", // 3
            "\\. \\. \\. \\. _", // 4
            "\\. \\. \\. \\. \\.", // 5
            "_ \\. \\. \\. \\.", // 6
            "_ _ \\. \\. \\.", // 7
            "_ _ _ \\. \\.", // 8
            "_ _ _ _ \\."  // 9
        };
        while (number.length() > 0)
        {
            for (int i = 0; i < 10; ++i)
            {
                if (number.matches(String.format("^%s.*", tab[i])))
                {
                    res = res * 10 + i;
                    number = number.substring(9);
                    if (number.length() > 0)
                        number = number.substring(1);
                }
            }
        }
        return res;
    }
    public static int run(String number)
    {
        return unmorsify(number);
    }

}
