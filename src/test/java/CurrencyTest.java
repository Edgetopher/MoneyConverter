import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

public class CurrencyTest {
    final double USD = 1.0;
    final double E = 0.94;
    final double BP = 0.82;
    final double Rupee = 68.32;
    final double AusD = 1.35;
    final double CAD = 1.32;
    final double SPD = 1.43;
    final double SF = 1.01;
    final double MR = 4.47;
    final double YEN = 115.84;
    final double CYR = 6.92;

    @Test
    public void addConverter(){
        Currency currency = new Currency();
        HashMap<String, Double> map = new HashMap<>();
        map.put("USD",1.0);
        HashMap expected = map;
        currency.addConverter("USD", 1.0);
        HashMap actual = currency.getConverter();
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void convertToUSDTest(){
        Currency currency = new Currency();
        double expected = 94.0;
        currency.addConverter("EU", .94);
        double actual = currency.convertToUSD("EU", 100);
        Assert.assertEquals(expected,actual,0.00001);
    }
}
