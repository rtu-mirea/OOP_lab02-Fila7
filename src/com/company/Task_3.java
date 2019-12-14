package com.company;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task_3 {
    private Pattern p = Pattern.compile("(?:\\d{1,3})((?:[,.|`]{1})(?:\\d{3}))*");

    public String fix_text(String text)
    {
        String[] txt = text.split(" ");
        for(int i = 0;i<txt.length; i++)
        {
            Matcher mat = p.matcher(txt[i]);
            if(mat.find())
            {
                // Сначала избавляемся от лишних знаков препинания перед и после необходимой последовательности символов (напр. если ",,,321.111.000!!!!")
                ArrayList<String> comas_back = new ArrayList<String>();
                ArrayList<String> comas_before = new ArrayList<String>();
                // Удаление символов перед необходимой последовательностью (станет "321.111.000!!!!")
                while(!Character.isDigit(txt[i].charAt(0)))
                {
                    comas_before.add(txt[i].substring(0, 1));
                    txt[i] = txt[i].substring(1, txt[i].length());
                }
                // Удаление символов после необходимой последовательности (станет "321.111.000")
                while(!Character.isDigit(txt[i].charAt(txt[i].length() - 1)))
                {
                    comas_back.add(txt[i].substring(txt[i].length() - 1));
                    txt[i] = txt[i].substring(0, txt[i].length() - 1);
                }
                String new_line = txt[i];
                Matcher m = p.matcher(txt[i]);
                // Проверка, действительно ли совпадает число с необходимым нам
                if(m.matches())
                {
                    String[] buf = txt[i].split("[,.|`]");
                    new_line = String.join("", buf);
                }
                txt[i] = String.join("", comas_before) + new_line + String.join("", comas_back);
            }
        }
        return String.join(" ", txt);
    }
}
