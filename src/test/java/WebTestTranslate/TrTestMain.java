package WebTestTranslate;

import org.testng.annotations.Test;

public class TrTestMain extends  TrTestMet{
   // static TrTestMet trTestMet = new TrTestMet();

    @Test
    public void main(String[] args) {
        setupTest();
        startTestT("укр","must be caught or declared to be thrown");
    }
}
