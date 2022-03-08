package by.training.task02.two;
/*
Дан текст. Найти сумму имеющихся в нем цифр.
 */

public class Two {

    public static void main(String[] args) {

        String str = "Прив-ую 33 вас 6 уважаемые 44 знатоки! ";

        sum(str);

    }

    public static int sum(String str) {

        String str2 = "0,1,2,3,4,5,6,7,8,9";

        int rez = 0;

        for (int i = 0; i < str.length(); i++) {

            for (int j = 0; j < str2.length(); j++) {

                if (str.charAt(i) == str2.charAt(j)) {

                    rez += Integer.parseInt(String.valueOf(str2.charAt(j)));
                }
            }
        }
        return print(rez);
    }

    public static int print(int rez) {

        System.out.println(rez);

        return rez;
    }
}
