package MyTest;

import org.testng.annotations.Test;

@Test
public class FizzBuzz
{
    public void main ()
    {
        for (int i =0 ;i<=100;i++){
                if (i==0)
                {
                    System.out.println("0");
                }else if(i%15==0)
                {
                    System.out.println("FizzBazz");
                }else if(i%3==0)
                {
                    System.out.println("Fizz");
                }else if(i%5==0)
                {
                    System.out.println("Bazz");
                }else {
                    System.out.println(i);
                }
        }
    }
}
