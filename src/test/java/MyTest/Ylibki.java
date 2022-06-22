package MyTest;

import org.testng.annotations.Test;

public class Ylibki {
    public void inversionStr(String YaPidor){
    for (int i=YaPidor.length()-1;i>=0;i--)
        {
        System.out.print(YaPidor.charAt(i));
        }
    }
    public int plus (int a ,int b)
    {
        return a+b;
    }
    @Test
    void ScreenCheck(){
        System.out.print(plus(99,3243));
        //inversionStr("shalom");
    }


}
