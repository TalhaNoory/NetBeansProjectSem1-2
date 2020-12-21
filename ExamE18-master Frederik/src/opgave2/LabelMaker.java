package opgave2;

public class LabelMaker {

    /**
     * Opgave 2A: This method retrieves a city based on a zip code.
     *
     * @param zipcode The string representing a zip code
     * @return city, that matches zipcode
     * @throws NotFoundZipcodeException if no matching city found
     */
    public String getCity(String zipcode) throws NotFoundZipcodeException {
        if (zipcode == null || zipcode.isEmpty()) {
            throw new IllegalArgumentException();
        }
        PostalCodes pc = new PostalCodes();
        if (!pc.getPostalCodes().containsKey(zipcode)) {
            throw new NotFoundZipcodeException();
        }
        String city = pc.getPostalCodes().get(zipcode);
        return city;
    }

    /**
     * Opgave 2b: This method generates a string to be used as package label
     * (containing NO line shifts).
     *
     * @param name The string representing a name
     * @param adress The string representing an adress
     * @param zipcode The string representing a zipcode
     * @return concatenated string of input values plus city - each word
     * delimited by a space
     * @throws NotFoundZipcodeException if no matching city found
     */
    public String makeLabel(String name, String adress, String zipcode) throws NotFoundZipcodeException {
        String city = "";
        try {
            city = getCity(zipcode);
        } catch (Exception ex) {
            throw new NotFoundZipcodeException();
        }
        String result = name + " " + adress + " " + zipcode + " " + city;
        return result;
    }
    
}
