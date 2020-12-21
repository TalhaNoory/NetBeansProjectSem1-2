package opgave2;

import java.util.HashMap;
import java.util.Map;

/**
 * Opgave 2A: This class contains a map of zipcodes and matching city.
 *
 */
public class PostalCodes
{

    private Map<String, String> postalCodes = new HashMap();

    public PostalCodes()
    {
        postalCodes.put("2100", "København Ø");
        postalCodes.put("2200", "København N");
        postalCodes.put("2800", "Kgs Lyngby");
        postalCodes.put("2900", "Hellerup");
        postalCodes.put("3400", "Hillerød");
    }

    public Map<String, String> getPostalCodes() {
        return postalCodes;
    }
}
