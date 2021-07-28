package unit1;

public class Unit1Task0 {

    public static void main(String[] args) {

        int month = 6;
        int day = 26;

        System.out.println("arithmetic operators:\n");
        System.out.println("month + day = " + (month + day));
        System.out.println("month - day = " + (month - day));
        System.out.println("month * day = " + (month * day));
        System.out.println("month / day = " + (month / day));
        System.out.println("month % day = " + (month % day));
        System.out.println("month += day = " + (month += day));
        month = 6;
        System.out.println("month -= day = " + (month -= day));
        month = 6;
        System.out.println("month *= day = " + (month *= day));
        month = 6;
        System.out.println("month /= day = " + (month /= day));
        month = 6;
        System.out.println("month %= day = " + (month %= day));
        month = 6;
        System.out.println("month++, ++day = " + (++month) +", "+ (day++));
        month = 6; day = 26;
        System.out.println("day--, --month = " + (--day) +", "+ (month--)); //как сюда правильно добавить \n ?
        System.out.println();
        System.out.println("bitwise operations:\n");
        month = 6; day = 26;
        System.out.println("month & day = " + (month & day));
        System.out.println("month | day = " + (month | day));
        System.out.println("month ^ day = " + (month ^ day));
        System.out.println();
        System.out.println("comparison operators:\n");
        month = 6;
        day = 26;
        if (month > day){
            System.out.println("month > day"); }
        else if (month < day){
            System.out.println("month < day"); }
        else if  //почему else без if в данной строчке не срабатывает?
            (month == day)
            System.out.println("month = day");
        System.out.println();
        System.out.println("logical operations:\n");
        boolean a = true;
        boolean b = false;
        boolean c = true;
        boolean d = false;
        System.out.println("a & b = " + (a & b));
        System.out.println("a & c = " + (a & c));
        System.out.println("b & d = " + (b & d));
        System.out.println();
        System.out.println("a | b = " + (a | b));
        System.out.println("a | c = " + (a | c));
        System.out.println("b | d = " + (b | d));
        System.out.println();
        System.out.println("a ^ b = " + (a ^ b));
        System.out.println("a ^ c = " + (a ^ c));
        System.out.println("b ^ d = " + (b ^ d));
        System.out.println();
        System.out.println("level complete");
        }
    }

