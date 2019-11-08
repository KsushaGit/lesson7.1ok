package com.company;

public class Main {// operiruem toloko objects

    public static void main(String[] args) {
	// write your code here


        Girl girl0 = new Girl("Ïra",23);
        Girl girl1 = new Girl("Ásya", 50);

        /*Girl girl1 = new Girl();
        girl1.name = Asya" ;
            girl1.age =30;*/

        girl0.goToCinema();
        girl1.goToCinema();

        System.out.println(girl0.countSum(1, 2, 3, 4, 5, 6, 6));

        System.out.println(girl0.goToRest("Mac"));
        System.out.println(girl1.goToRest("Kuliichi"));

        //System.out.println(girl0.goToRest("Mac")); method c .


        System.out.println(girl0);// peredaem obejct, toString v stroku
        System.out.println(girl1);// peredaem obejct, toString v stroku



        SuperGirl superGirl = new SuperGirl ("Ket", 26);
        System.out.println(superGirl);
        girl0 =null;
        System.gc();




    }
}
