package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
	boolean exit_task = false;
	Scanner sc = new Scanner(System.in);
	while(!exit_task)
    {
        System.out.print("1 - Задание 1\n2 - Задание 2\n3 - Задание 3\n4 - Выйти\n");
        int res = sc.nextInt();
        switch(res)
        {
            default: {System.out.println("Выбор неизвестен, попробуйте снова"); break;}
            case 1: {task_1_menu(sc); break;}
            case 2: {task_2_menu(sc); break;}
            case 3: {task_3_menu(sc); break;}
            case 4: {exit_task = true; break;}
        }
    }
	sc.close();
    }

    private static void task_1_menu(Scanner sc) throws FileNotFoundException
    {
        Task_1 t = new Task_1();
        boolean exit = false;
        while(!exit)
        {
            System.out.println("\n1 - Ввести данные.");
            System.out.println("2 - Вывести данные на экран.");
            System.out.println("3 - Исправить записи о контактах, записав Фамилия И.О. прописными буквами.");
            System.out.println("4 - Определить, сколько к домену com относится контактов");
            System.out.println("5 - Сформировать массив фамилий по заданной первой букве.");
            System.out.println("6 - Выбрать другое задание");
            int res  = sc.nextInt();
            switch(res)
            {
                default: {System.out.println("Выбор неизвестен, попробуйте снова"); break;}
                case 1: {
                    try{
                    String data = "";
                    Scanner in = new Scanner(new File("D:\\Java\\Labs\\lab__2\\snames.txt"));
                    while(in.hasNextLine()) data += in.nextLine() + "\n";
                    in.close();
                    t = new Task_1(data);}
                catch(FileNotFoundException e) {System.out.println("Создайте файл snames.txt и добавьте в него записи");}
                    break;}
                case 2: {System.out.println(t.toString()); break;}
                case 3: {t.fix_names(); break;}
                case 4: {System.out.format("К домену com принадлежит %d записей\n", t.dot_com()); break;}
                case 5: {
                    System.out.println("Введите первую букву фамилий");
                    char letter = (sc.next() + sc.nextLine()).charAt(0);
                    System.out.println(String.join("\n", t.first_letter_snames(letter)));
                    break;
                    }
                case 6: {exit = true; break;}
                }
            }
        }

    private static void task_2_menu(Scanner sc) throws FileNotFoundException
    {
    Task_2 t = new Task_2();
    boolean exit = false;
    while(!exit)
    {
        System.out.println("\n1 - Ввести данные.");
        System.out.println("2 - Вывести данные на экран.");
        System.out.println("3 - Добавить запись.");
        System.out.println("4 - Найти адреса, в которых опущено имя домена, и заменить их правильными.");
        System.out.println("5 - Выбрать другое задание");
        int res = sc.nextInt();
        switch(res)
        {
            default: {System.out.println("Выбор неизвестен, попробуйте снова"); break;}
            case 1: {
                try{
                    String data = "";
                    Scanner in = new Scanner(new File("D:\\Java\\Labs\\lab__2\\snames.txt"));
                    while(in.hasNextLine()) data += in.nextLine() + "\n";
                    in.close();
                    t = new Task_2(data);}
                catch(FileNotFoundException e) {System.out.println("Создайте файл snames.txt и добавьте в него записи");}
                break;}
            case 2: {System.out.println(t.toString()); break;}
            case 3:
            {
                System.out.println("Введите запись в фомате Фамилия И.О.,XXXX@gmail(mail).com(ru).");
                String s = sc.next() + sc.nextLine();
                t.add(s);
                break;
            }
            case 4: {t.fix_domain(); break;}
            case 5: {exit = true; break;}
        }
    }
    }

    private static void task_3_menu(Scanner sc) throws FileNotFoundException
    {
        try{
            Task_3 t = new Task_3();
            String data = "";
            Scanner in = new Scanner(new File("D:\\Java\\Labs\\lab__2\\task_3_text.txt"));
            while(in.hasNextLine()) data += in.nextLine() + "\n";
            in.close();
            System.out.format("\nВаш оригинальный текст:\n %s\nИзменённый текст:\n%s\n", data, t.fix_text(data));
        }
        catch(FileNotFoundException e) {System.out.println("Создайте файл task_3_text.txt и добавьте в него текст");}

    }
}
