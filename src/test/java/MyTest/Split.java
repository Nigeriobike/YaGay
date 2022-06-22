package MyTest;

import org.testng.annotations.Test;

public class Split {
    public void splitMe(String a,String b)
        {
            String[] aSplited = a.split(b);
            for (String word :aSplited)
            {
                System.out.println(word);
            }
        }
@Test
    void check (){
        splitMe("znatov1881@gmail.com","\\.");
    }
}
