package opgave1;

public class Strings {

    /**
     * Opgave 1A: This method returns a string formed as a sql select statement
     * based on the input parameters. Example: Column names "id" and "name" and
     * table name "person" returns "select id, name from person;"
     *
     * @param columns String array representing column names in database table
     * @param table String representing a database table name
     * @return string formed as sql select statement
     */
    public String makeSQLString(String[] columns, String table) {
        String result = "select ";
        for (String c : columns) {
            result += c + ", ";
        }
        //jeg laver result.length() - 2 for at fjerne det sidst komma
        result = result.substring(0, result.length() - 2) + " from " + table + ";";
        return result;
    }



    /**
     * Opgave 1B: This method checks whether the input parameter is in lower
     * case. Chars between 'a' and 'z' and the empty string are considered lower
     * case
     *
     * @param str The string to check
     * @return true, if string is lower case
     */
    public boolean isLowerCase(String str) {
        if (str == null){
            return false;
        }
        boolean result = true;
        for (int i = 0; i < str.length(); i++) {
            if ((str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') || (str.charAt(i) >= '0' && str.charAt(i) <= '9')) {
                result = false;
            }
        }
        return result;
    }

    /**
     * Opgave 1C: This method checks whether the input parameter is the same
     * when read forward and backward. "Racecar" is an example of a string, that
     * is the same when read forward and backward. The case of the letters
     * should be ignored. The input string can also be a sentence, in this case
     * the spaces should be ignored. Example: The input string "Never odd or
     * even" is the same read forward and backward
     *
     * @param str The string to check
     * @return true, if and only if the string is the same forward and backward
     */
    public boolean isSameBackwards(String str) {
        if (str == null || str.isEmpty()){
            throw new IllegalArgumentException();
        }
        String reverse = "";
        str = str.toLowerCase();
        str = str.replaceAll("\\s", "");
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }
        return str.equals(reverse);
    }
}
