package com.company;

public class Task_1 {
    private String[] data;

    public Task_1() {data = null;}
    public Task_1(String text) {data = text.split("\n");}

    public void fix_names()
    {
        for (int i = 0;i<data.length;i++)
        {
            String s = data[i].split(",")[0];
            data[i] = data[i].replace(s, s.toLowerCase());
        }
    }
    public int dot_com()
    {
        int res = 0;
        for (int i = 0; i<data.length; i++)
        {
            String s = data[i].split(",")[1];
            if(s.substring(s.indexOf(".")+1).equals("com.")) res++;
        }
        return res;
    }
    public String[] first_letter_snames(char letter)
    {
        String res = "";
        for(int i = 0; i<data.length; i++)
        {
            String s = data[i].split(",")[0];
            if(s.toLowerCase().charAt(0) == letter || s.toUpperCase().charAt(0) == letter)
                res += s + "\n";
        }
        if (res.length() == 0)
        {
            res = "Нет фамилий, начинающихся с такой буквы";
        }
        return res.split("\n");
    }
    public String toString()
    { return String.join("\n", data); }
}
