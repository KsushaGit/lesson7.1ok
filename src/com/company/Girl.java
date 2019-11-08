package com.company;

public class Girl {
    String name;
    int age;
// cmd N - okoshko c generacie koda"


    public Girl(String name, int age) { // konstructor -methosd, kot imeet ze seim name as klass, use for inicialization class

       this();// v lubom kostructure vizivaem konstructor , if without parameter to default
        this.name = name;// this- eto link yf tekuwii object
        this.age = age;
    }

    public Girl() { // default constructor

        this.name ="Ket" ;// link na tekushii object
        this.age = 22;
    }

    @Override
    public String toString() {
        return "Girl{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    void goToCinema() {
        System.out.println("goes to cinema = " + name);

    }


    String goToRest(String nameofRest) {

        if ("Mac".equals(nameofRest)){
            return "Said No "  +name;
        }
        else {

            return "ÿes said " +name;

        }

    }


    public int countSum(int ... i) { // i budet massiv
        int sum =0;
        for (int num: i) { // i.for - perebiraem massiv
            sum+= num;
        } return sum;

    }@Override
    protected void finalize() throws Throwable {

        System.out.println("Good Bye");



    }
}
