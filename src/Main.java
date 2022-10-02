public class Main {
    public static void changeValueInt (int value){ // к заданию 5
        value = 22;
    }

    public static void changeValueInteger (Integer value){ // к заданию 6
        value = 22;
    }

    public static void changeValueIntegerArray (Integer [] value){// к заданию 7
        value = new Integer[] {3, 4};
    }

    public static void changeValueIntegerFirstElementOfArray (Integer[] value){//к заданию 8
        value[0] = 99;
    }

    public static void changePerson(Person person){ //к заданию 9
        person = new Person("Ilya", "Lagutenko");
    }

    public static void arrayOutput (Integer [] array){// вывод массива
        System.out.print("valueIntegerArray = ");
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        //задание №5
        int value = 33;
        System.out.println("value = " + value);
        changeValueInt(value);
        System.out.println("value = " + value);

        System.out.println();

        //задание №6
        Integer valueInteger = 33;
        System.out.println("valueInteger = " + valueInteger);
        changeValueInteger(valueInteger);
        System.out.println("valueInteger = " + valueInteger);

        System.out.println();

        //Задание №7
        Integer[] valueIntegerArray = new Integer[] {1,2};
        arrayOutput(valueIntegerArray);
        changeValueIntegerArray(valueIntegerArray);
        arrayOutput(valueIntegerArray);

        System.out.println();

        //Задание №8
        arrayOutput(valueIntegerArray);
        changeValueIntegerFirstElementOfArray(valueIntegerArray);
        arrayOutput(valueIntegerArray);

        System.out.println();

        //задание №9
        Person person = new Person("Lyapis", "Trubetskoy");
        System.out.println("person = " + person);
        changePerson(person);
        System.out.println("person = " + person);

    }
}