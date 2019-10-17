//Вариант 8
public class Task_1
{
    private String[] data;

    public Task_1() {data = null;}
    public Task_1(String text) {data = text.split("\n");}

    public void fix_names()
    {
       for (int i = 0;i<data.length;i++) data[i] = data[i].replace(data[i].split(",")[0], data[i].split(",")[0].toLowerCase());
    }
    public int dot_com()
    {
        int res = 0;
        for (int i = 0; i<data.length; i++)
            if(data[i].split(",")[1].substring(data[i].split(",")[1].lastIndexOf(".")+1).equals("com")) res++;
        return res;
    }
    public String[] first_letter_snames(char letter)
    {
        String res = "";
        for(int i = 0; i<data.length; i++)
            if(data[i].split(",")[0].toLowerCase().charAt(0) == letter || data[i].split(",")[0].toUpperCase().charAt(0) == letter) 
                res+=data[i].split(",")[0] + "\n";
        return res.length() == 0 ? new String[0] : res.split("\n");
    }
    public String toString()
    {
        String str = data[0];
        for (int i = 1;i<data.length; str+="\n"+data[i], i++);
        return str;
    }
}