public class LR_2
{
    public static void main(String[] args) {
    String snames = "Владимиров З.Л.,jismumpgxy@ma.com\nКорнилов В.Л.,qaof@ma.kz\nЖданов Т.Г.,fxonspsi@ma.com\nСитников С.Д.,qrponfweno@ma.com\nСуворов И.П.,qupqxtg@ma.com\nПрохоров В.Д.,lehp@ma.kz\nГорбунов Р.Р.,uegk@ma.kz\nФёдоров П.В.,zddyismy@ma.com\nПанов М.В.,peothnlt@ma.kz\nЩербаков С.В.,eafq@ma.com\nЗимин А.Г.,gjsakkzx@ma.kz\nЖуравлёв М.Д.,rxpnvsfw@ma.com\nКиселёв А.Г.,wsoh@ma.kz\nФокин В.Л.,emgwc@ma.kz\nГригорьев Э.Л.,koavg@ma.kz\nМишин В.А.,jbrd@ma.com\nПанфилов К.Ф.,alwbhkz@ma.com\nТарасов Е.М.,ccoetjnmw@ma.kz\nКотов А.С.,cetosmng@ma.com\nЛарионов И.М.,esrkrruesm@ma.com";
    Task_1 t = new Task_1(snames);
    t.fix_names();
    System.out.println(t.toString());
    System.out.println(t.dot_com());
    String[] as = t.first_letter_snames('В');
    System.out.println(as.length);
    }
}