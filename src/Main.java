public class Main {
    public static void changeValue (int value){ // к заданию 5
        value = 22;
    }

    public static void main(String[] args) {
        //задание №5
        int value = 33;
        System.out.println("value = " + value);
        changeValue(value);
        System.out.println("value = " + value);


    }
}