package MyTest;

import org.testng.annotations.Test;

public class Inversion {
    public void outInversionStr(String var1){
    for (int i=var1.length()-1;i>=0;i--)
        {
        System.out.print(var1.charAt(i));
        }
    }
    @Test
    private void ScreenCheck(){
        outInversionStr("shalom");
        //inversionStr("shalom");
    }


}
