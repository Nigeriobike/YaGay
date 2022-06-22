package MyTest;

import org.testng.annotations.Test;

public class Inversion {
    public void outInversionStr(String var1){
    for (int i=var1.length()-1;i>=0;i--)
        {
        System.out.print(var1.charAt(i));
        }
    }
    public int plus (int a ,int b)
    {
        return a+b;
    }
    @Test
    private void ScreenCheck(){
        System.out.print(plus(99,3243));
        //inversionStr("shalom");
    }


}
