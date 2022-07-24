import WebTestOlx.Tests.TestHomePage;

import java.util.Scanner;

public class MenuCMD {
    //menu messages
    static String hi ="Hello , this is menu prototype \nTo see what it can just print : /help\n";
    //OLX
    static boolean sansare =true;
    static String searchName;
    static String rangeFrom;
    static String rangeTo;
    //init
    TestHomePage testOlx;
    //cmd
    public static void main(String[] args) {

        do{
        Scanner in = new Scanner(System.in);
        System.out.print(hi);
        searchName = in.nextLine();
        System.out.println(searchName);
        }while (sansare);
    }
}
