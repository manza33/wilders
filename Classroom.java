package com.company;

public class Classroom {
    public static void main(String[] args) {
        Wilder veronique = new Wilder("Véronique", false);
        Wilder yanis = new Wilder("Yanis", false);
        Wilder valerian = new Wilder("Valérian", true);

        System.out.println(veronique.whoAmI());
        System.out.println(yanis.whoAmI());
        System.out.println(valerian.whoAmI());

    }
}