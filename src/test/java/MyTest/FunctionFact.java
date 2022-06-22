package MyTest;

import org.testng.annotations.Test;


public class FunctionFact {
    @Test
    public int fact(int n)
    {
        if (n==0||n==1){
            return 1;
        }
        for (int i = n;i>=2;i=i-1)
        {
            n*=(i-1);
        }
        return n;
    }
    @Test
    void outScreen()
    {
        System.out.println(fact(-1));
    }
}
