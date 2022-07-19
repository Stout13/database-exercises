package Parameterized;

public class Equals {
    public static void main(String[] args) {
        isEqual();
    }


    public static void isEqual() {
        String taco = new String("salad");  // String object
        String potato = new String("salad");

        System.out.println(taco.equals(potato));
        System.out.println(taco == potato);



    }
}
