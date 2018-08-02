import java.text.DecimalFormat;

public class AllInformation {
    static String tradBillions="";
    static String miliard=" мiльярд";
    static String sufixMiliard="и";
    static String sufixMiliard2="iв";;
    static String tradHundredThousands="";
    static String southend="тисяч";
    static String sufictToStringsouth="a";
    static String sufictToStringsouth1="i";
    static String tradMillions="";
    static String million=" мiльйон";
    static String sufictToString="и";
    static String sufictToString2="iв";
    static String nulls ="";
    public static final String[] tensNamesUkr = {
            "",
            " десять",
            " двадцять",
            " тридцять",
            " сорок",
            " п'ятдесят",
            " шістдесят",
            " сімдесят",
            " вісімдесять",
            " дев'яносто"
    };

    public static final String[] numNamesUkr = {
            "",
            " один",
            " два",
            " три",
            " чотири",
            " п'ять",
            " шість",
            " сім",
            " вісім",
            " дев'ять",
            " десять",
            " одинадцять",
            " дванадцять",
            " тринадцять",
            " чотирнадцять",
            " п'ятнадцять",
            " шістнадцять",
            " сімнадцять",
            " вісімнадцять",
            " дев'ятнадцять"
    };


    public static final String[] numNames2Ukr = {
            "",
            " сто",
            " двісті",
            " триста",
            " чотириста",
            " п'ятьсот",
            " шістьсот",
            " сімсот",
            " вісімсот",
            " дев'ятьсот"

    };
    public static   String stringNumber;
    static String convertLessThanOneThousand(int number){
        return stringNumber;
    }
    public static String convert(long number) {

        if (number == 0) {
            return nulls;
        }

        String snumber = Long.toString(number);

        // pad with "0"
        Converts converts = new Converts(number);
        int billions = converts.getBillions();
        int millions = converts.getMillions();
        int hundredThousands = converts.getHundredThousands();
        int thousands = converts.getThousands();

        String result = getStringBilions(billions);

        result = getStringMilions(millions, result);

        result = getStringThousand(hundredThousands, result);

        String tradThousand;
        tradThousand = convertLessThanOneThousand(thousands);
        result = result + tradThousand;
        return result.replaceAll("^\\s+", "").replaceAll("\\b\\s{2,}\\b", " ");
    }

    public  static String getStringBilions(int billions){
        return null;
    }
    public static String getStringThousand(int hundredThousands, String result){
        return result;
    }
    public static String getStringMilions(int millions, String result){
        return result;
    }

    public static class Converts {

        public int billions;
        public int millions;
        public int hundredThousands;
        public int thousands;

        public Converts(long number) {
            String snumber;
            String mask = "000000000000";
            DecimalFormat df = new DecimalFormat(mask);
            snumber = df.format(number);

            // XXXnnnnnnnnn
            billions = Integer.parseInt(snumber.substring(0, 3));
            // nnnXXXnnnnnn
            millions = Integer.parseInt(snumber.substring(3, 6));
            // nnnnnnXXXnnn
            hundredThousands = Integer.parseInt(snumber.substring(6, 9));
            // nnnnnnnnnXXX
            thousands = Integer.parseInt(snumber.substring(9, 12));
        }

        public int getBillions() {
            return billions;
        }

        public int getMillions() {
            return millions;
        }

        public int getHundredThousands() {
            return hundredThousands;
        }

        public int getThousands() {
            return thousands;
        }


    }
}
