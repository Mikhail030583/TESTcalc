package com.company;

public class Romane {

   private String[] rom2 = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
   private String[] rom1 = {"X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXX", "XC"};
   private String[] arAll = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};
   private String str2;
   private String str1;



    public String translation(int a){
        String str = Integer.toString(a);
        if(str.length() == 3){
            str = "C";
            return str;
        }else if(str.length() == 2){
            char ch = str.charAt(0);
            String one = String.valueOf(ch);
            String two = str.substring(1);
            b1(one);
            b2(two);
            str = str1 + str2;
            return str;
        }else{
            b2(str);
            str = str2;
            return str;
        }
    };

    public String b1(String c){
        for(int j = 0; j <= 8; j++){
            if(c.equals(arAll[j])){
                this.str1 = rom1[j];
                return str1;
            };
        }return str1;
    };

    public String b2(String c){
        for(int j = 0; j <= 8; j++){
            if(c.equals(arAll[j])){
                this.str2 = rom2[j];
                return str2;
            };
        }str2 = "";
        return str2;
    }

}
