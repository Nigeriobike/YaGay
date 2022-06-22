package MyTest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestYaEbal {
    FunctionFact functionFact = new FunctionFact();
    Ylibki ylibki = new Ylibki();
    Split split1 = new Split();

    @Test
    public void testingShit(){
        Assert.assertTrue(functionFact.fact(1)==1);
        Assert.assertTrue(functionFact.fact(0)==1);
        Assert.assertTrue(functionFact.fact(2)==2);
        Assert.assertTrue(functionFact.fact(3)==6);
        Assert.assertTrue(functionFact.fact(4)==24);
    }
}
