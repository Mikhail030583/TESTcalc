package com.company;

public class Calculator {

    private int nunber1;
    private int nunber2;
    private int sum1;
    private int sum2;


    public Calculator( int nunber1, int nunber2){
        this.nunber1 = nunber1;
        this.nunber2 = nunber2;
    };

    public int add(){
        sum1 = nunber1 + nunber2;
        return sum1;
    };
    public int sub(){
        sum1 = nunber1 - nunber2;
        return sum1;
    };
    public int mult(){
        sum1 = nunber1 * nunber2;
        return sum1;
    };
    public int div(){
        sum1 = nunber1 / nunber2;
        return sum1;
    };

    public int proba(char ch1){
        switch (ch1) {
            case '+':
               sum2 = add();
               return sum2;
            case '-':
               sum2 = sub();
               return sum2;
            case '*':
               sum2 = mult();
               return sum2;
            case '/':
               sum2 = div();
               return sum2;
        }return sum2;
    };

}
