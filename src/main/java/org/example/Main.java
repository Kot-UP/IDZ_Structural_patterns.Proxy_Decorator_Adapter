package org.example;

public class Main {
    public static void main(String[] args) {
        Ints intsCalc = new IntsCalculator();
        System.out.println(intsCalc.sum(2, 2));
        System.out.println(intsCalc.mult(10, 22));
        System.out.println(intsCalc.pow(2, 10));

        BinOps binOps = new BinOps();
        String sum = binOps.sum("1010", "0101");
        System.out.println(sum);

        String mult = binOps.mult("1010", "0101");
        System.out.println(mult);
    }
}