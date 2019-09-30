package com.company;

public class AtoI {

    public static int atoi(String num){
        if(num.length() == 0)
            return 0;

        StringBuilder parsedNum = new StringBuilder();
        int multiplier = 0;
        int intVal = 0;

        // loop to get the actual string number to be converted after some parsing
        for(int i = 0; i < num.length(); i++){
            if(i == 0 && (num.charAt(i) == '+' || num.charAt(i) == '-'))
                continue;
            else if(Character.isDigit(num.charAt(i))) {
                parsedNum.append(num.charAt(i));
                multiplier++;
            }
            else if(Character.isSpaceChar(num.charAt(i)) || Character.isLetter(num.charAt(i)))
                break;
        }

        // loop to convert the string number to integer
        for(int j = 0; j < parsedNum.length(); j++){
            double val = Character.getNumericValue(parsedNum.charAt(j)) * Math.pow(10, multiplier - 1 - j);
            intVal += val;
        }

        if(num.charAt(0) == '-')
            return (-1)*intVal;
        else
            return intVal;
    }
}
