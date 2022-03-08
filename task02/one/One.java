package by.training.task02.one;

/*
№56 Дана строка. Придумать алгоритм шифрования данной строки и дешифрования
 */
public class One {
    public static void main(String[] args) {


        String st = "Два щенка щека к щеке щиплют щетку в уголке.";

        char[] ch = st.toCharArray();

        encrypt(ch);

        decryption(ch);

    }

    public static char[] encrypt(char[] ch) {

        String st1 = " АаБбВвГгДдЕеЖжИиЙйКкЛлМмНнОоПпРрСсТтУуФфХхЦцЧчШшЩщЪъЫыЬьЭэЮюЯя ";

        char[] c1 = st1.toCharArray();

        String st2 = " ЛлОоРрГгЪъНнЖжМмЙйКкАаИиЕеБбПпВвТтСсУуФфХхЦцЧчШшЩщДдЫыЬьЭэЮюЯя ";

        char[] c2 = st2.toCharArray();

        for (int i = 0; i < ch.length; i++) {

            for (int j = 0; j < c1.length; j++) {

                if (ch[i] == c2[j]) {

                    ch[i] = c1[j];
                }
            }
        }

        return print(ch);
    }

    public static char[] print(char[] ch) {

        System.out.println("Распечатаем зашифрованный/дешифрованный текст");

        for (char c : ch) {

            System.out.print(c);
        }

        System.out.println();

        return ch;
    }

    public static char[] decryption(char[] ch) {

        String st1 = " АаБбВвГгДдЕеЖжИиЙйКкЛлМмНнОоПпРрСсТтУуФфХхЦцЧчШшЩщЪъЫыЬьЭэЮюЯя ";

        char[] c1 = st1.toCharArray();

        String st2 = " ЛлОоРрГгЪъНнЖжМмЙйКкАаИиЕеБбПпВвТтСсУуФфХхЦцЧчШшЩщДдЫыЬьЭэЮюЯя ";

        char[] c2 = st2.toCharArray();

        for (int i = 0; i < ch.length; i++) {

            for (int j = 0; j < c2.length; j++) {

                if (ch[i] == c1[j]) {

                    ch[i] = c2[j];
                }
            }
        }

        return print(ch);

    }

}






