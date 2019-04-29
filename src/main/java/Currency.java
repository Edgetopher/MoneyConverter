import java.util.HashMap;
import java.util.Map;

public class Currency {
    HashMap<String, Double> converter = new HashMap<String, Double>();

    public Currency() {
    }

    public void addConverter(String key, double value){
        converter.put(key,value);
    }

    public HashMap<String, Double> getConverter() {
        return converter;
    }

    public double convertToUSD(String key, double value){
        double convert = converter.get(key);
        double convertedToUSD = value * convert ;
        return convertedToUSD;
    }
    public double usdTo(String key, double value){
        
    }
}

