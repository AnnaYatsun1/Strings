public class UkraingNumberToWords extends AllInformation {
    public static String convertLessThanOneThousand(int number) {
 

        if (number % 100 < 20){
            AllInformation.stringNumber = numNamesUkr[number % 100];
            number /= 100;
        }
        else {
            AllInformation.stringNumber = numNamesUkr[number % 10];
            number /= 10;

            AllInformation.stringNumber = tensNamesUkr[number % 10] + AllInformation.stringNumber;
            number /= 10;
        }
        if (number == 0) return AllInformation.stringNumber;
        return numNames2Ukr[number]  + stringNumber;
    }

    public static String getStringBilions(int billions) {
        switch (billions) {
            case 0:
                tradBillions = "";
                break;
            case 1 :
                tradBillions = convertLessThanOneThousand(billions)
                        + miliard;
                break;
            case 2 :
                tradBillions = convertLessThanOneThousand(billions)
                        + miliard+sufixMiliard;
                break;
            case 3 :
                tradBillions = convertLessThanOneThousand(billions)
                        + miliard+sufixMiliard;
                break;
            case 4 :
                tradBillions = convertLessThanOneThousand(billions)
                        + miliard+sufixMiliard;
                break;
            default :
                tradBillions = convertLessThanOneThousand(billions)
                        +miliard+sufixMiliard2;
        }
        return tradBillions;
    }

    public static String getStringMilions(int millions, String result) {
        switch (millions) {
            case 0:
                tradMillions = "";
                break;
            case 1 :
                tradMillions = convertLessThanOneThousand(millions)
                        +million;
                break;
            case 2 :
                tradMillions = convertLessThanOneThousand(millions)
                        +million+sufictToString;
                break;
            case 3 :
                tradMillions = convertLessThanOneThousand(millions)
                        +million+sufictToString;
                break;
            case 4 :
                tradMillions = convertLessThanOneThousand(millions)
                        +million+sufictToString;
                break;

            default :
                tradMillions = convertLessThanOneThousand(millions)
                        +million+sufictToString2;
        }
        result =  result + tradMillions;
        return result;
    }
    public static String getStringThousand(int hundredThousands, String result) {

        switch (hundredThousands) {
            case 0:
                tradHundredThousands = "";
                break;
            case 1 :
                tradHundredThousands = "oдна"+southend+sufictToStringsouth;
                break;
            case 2 :
                tradHundredThousands ="двi "+southend+sufictToStringsouth1;
                break;
            case 3 :
                tradHundredThousands = "три "+southend+sufictToStringsouth1;
                break;
            case 4 :
                tradHundredThousands = "чотири "+southend+sufictToStringsouth1;  ;
                break;
            default :
                tradHundredThousands = convertLessThanOneThousand(hundredThousands)
                        + " тисяч ";
        }
        result =  result + tradHundredThousands;
        return result;
    }


}