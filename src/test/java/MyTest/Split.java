package MyTest;

import org.testng.annotations.Test;

public class Split {
    public void outSplitWordBy(String a,String b)
        {
            String[] aSplited = a.split(b);
            for (String word : aSplited)
            {
                System.out.println(word);
            }
        }
@Test
   private void check (){
    outSplitWordBy("znatov1881@gmail.com","\\.");
    }
    @Test
    void var () {
        int n = 0;
        while (n < 100){
            System.out.println(n);
            n++;
        }
    }
}

