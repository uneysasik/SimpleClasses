package be.intecbrussel;

public class WrapperApp {
    public static void main(String[] args) {
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.max(45,88));

        int a=4;
        int b=8;
        int c=3;
        int d=9;

        System.out.println(Integer.max(Integer.max(a,b), Integer.max(c,d)));

//      Integer myInt = new Integer(45); -- Java 5'ten itibaren boyle yazmaya gerek yok. Ustunu cizer.
        Integer myInt = 45; // autoboxing

        Double mydouble = 45.33;
        long myLong = a;
        Long veryLong = myLong;
        Long mLong = 34L;

        int smallInt = 10;
        Integer objectInt =10;
        incrementInteger(smallInt);
        incrementInteger(objectInt);
        System.out.println(smallInt);
        System.out.println(objectInt);

        String s1 = new String("hello");
        String s2 = new String("hello");
        String s3 = "hello";
        String s4 = "hello";
        System.out.println("s1==s2: " + (s1==s2));
        System.out.println("s1.equals(s2): " + s1.equals(s2));
        System.out.println("s1 == s3: " + (s1 == s3));
        System.out.println("s3==s4: "+ (s3==s4));


        Integer i1 = 128; //127 olsaydi true verecekti. onun icin .equals metodunu kullanmak garanti.
        Integer i2 = 128;
        int i3 = 4;
        int i4 = 4;

        System.out.println("i1 == i2: "+ (i1 == i2));
        System.out.println("i1.equals(i2): " + i1.equals(i2));
        System.out.println("i3 == i4: " + (i3 == i4));


    }
    private static void incrementInt(int number) {
        number++;
    }
    private static void incrementInteger(Integer number) {
        number++;

    }
}
