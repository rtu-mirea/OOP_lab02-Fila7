package com.company;

public class Task_2 {
    private StringBuilder data;
    private Integer size;
    public Task_2() {data = new StringBuilder(""); size = 0;}
    public Task_2(String txt)
    {
        size = txt.split("\n").length;
        data = new StringBuilder(txt);
        data.insert(0, "Количество контактов = "+size+"\n");
    }

    public void add(String one_more)
    {
        String s_size = size.toString();
        data.replace(data.indexOf(s_size), data.indexOf(s_size) + s_size.length(), (++size).toString());
        data.append(one_more+"\n");
    }
    public void fix_domain()
    {
        int index_of_last = 0;
        StringBuilder subStr, result = new StringBuilder("");
        for(int i = 0; i<data.length(); i++)
        {
            if(data.charAt(i) == '\n')
            {
                subStr = new StringBuilder(data.substring(index_of_last, i));
                index_of_last = i+1;
                if(subStr.length() - subStr.lastIndexOf(".com.") != 5 || subStr.length() - subStr.lastIndexOf(".ru.") != 4)
                {
                    if(subStr.length() - subStr.lastIndexOf("@gmail") == 6) subStr.append(".com.");
                    else if (subStr.length() - subStr.lastIndexOf("@mail") == 5) subStr.append(".ru.");
                }
                subStr.append('\n');
                result.append(subStr);
            }
        }
        data = result;
    }

    public String toString() {return data.toString();}
}
