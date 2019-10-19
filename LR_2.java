
public class LR_2
{
    public static void main(String[] args) {
    String snames = "Окрокверцхов А.Ю.,ocmaeoq@mail.ru.\nЯнварев К.П.,jvyiutnz@mail\nМакушев Ф.Ф.,flwtuq@mail.ru.\nФотеев Ф.Л.,pismvlyb@gmail.com.\nКривонос П.С.,pcjjarxc@mail.ru.\nКурчатов С.И.,fladusna@gmail.com.\nБобр С.М.,edzx@mail.ru.\nЯчменев О.И.,lewkj@mail.ru.\nФурманов П.П.,dvvj@mail.ru.\nСотов Р.А.,larwo@mail.ru.\nСоломин А.Ч.,kgpcfznlyf@gmail.com.\nДругов М.Д.,mvsxxgb@gmail.com.\nБаскаков Н.В.,ipbiqgju@mail.ru.\nЛясковец Т.Е.,podgav@gmail.com.\nБелолипецкий П.М.,vznv@gmail.com.\n";
    Task_2 t = new Task_2(snames);
    System.out.println(t);
    System.out.println("--------------------adding_new-----------------------");
    t.add("Жданов Т.Г.,fxonspsi@gmail.com.");
    System.out.println(t);
    System.out.println("--------------------fixing_domains-----------------------");
    t.fix_domain();
    System.out.println(t);
    }
}