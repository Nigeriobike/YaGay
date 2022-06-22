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
}
