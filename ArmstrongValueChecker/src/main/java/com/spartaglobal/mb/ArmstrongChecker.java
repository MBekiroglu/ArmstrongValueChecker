package com.spartaglobal.mb;

public class ArmstrongChecker {
    public boolean isArmstrong(Integer number) {
        int armstrongValue = 0;
        String string = number.toString();
        for (int i = 0; i < string.length(); i++) {
            armstrongValue += Math.pow(Integer.parseInt(String.valueOf(string.charAt(i))), 3);
        }
        return armstrongValue == number;
    }
}
