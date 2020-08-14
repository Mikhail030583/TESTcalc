package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try {
            String st1 = new String();
            String st2 = new String();
            String[] operation = {"+", "-", "*", "/"};
            String[] rim = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
            int ind = 0;
            int sumAll = 0;
            boolean arab1 = false;
            boolean arab2 = false;

            System.out.println("Введите уравнение: ");

            Scanner sc = new Scanner(System.in);
            String stroke = sc.nextLine();

            for (int i = 0; i < stroke.length(); i++) {
                ind = stroke.indexOf(operation[i]);
                if (ind >= 1) {
                    st1 = stroke.substring(0, ind).trim();
                    st2 = stroke.substring(ind + 1).trim();
                    break;
                };
            };

            for (int i = 0; i < 10; i++) {
                if (st1.equals(rim[i])) {
                    arab1 = true;
                    i += 1;
                    st1 = Integer.toString(i);
                    break;
                };
            };

            if (arab1 == true) {
                for (int i = 0; i < 10; i++) {
                    if (st2.equals(rim[i])) {
                        i += 1;
                        st2 = Integer.toString(i);
                        arab2 = true;
                        break;
                    };
                };
            };

            if (arab1 == true && arab2 == false) {
                throw new Exception("Числа должны быть в одном формате!");
            };

            Integer num1 = Integer.valueOf(st1);
            Integer num2 = Integer.valueOf(st2);
            char ch = stroke.charAt(ind);

            if(num1 > 0 && num1 <= 10 && num2 > 0 && num2 <= 10) {
                Calculator calculator = new Calculator(num1, num2);
                sumAll = calculator.proba(ch);
                if (arab1 == true && arab2 == true){
                    Romane romane = new Romane();
                    System.out.println("Результат: "+romane.translation(sumAll));
                }else {
                    System.out.println("Результат: " + sumAll);
                };
            }else{
                throw new Exception("Числа не подходят под заданный диапазон!");
            };
        } catch (Exception e){
            System.out.println(System.err.printf(e.getMessage()));
        };

    };
}
