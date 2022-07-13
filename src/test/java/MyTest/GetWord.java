package MyTest;

import org.testng.annotations.Test;

public class GetWord {
    String a = "ya ma ha ya ma hi";
    void getWord()
    {
        if(a.contains("ya")){
            System.out.println("yyyy");
        }
    }
}
