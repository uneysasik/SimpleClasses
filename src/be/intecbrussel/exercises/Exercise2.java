package be.intecbrussel.exercises;

import java.time.Instant;

public class Exercise2 {
    public static void main(String[] args) {
        Instant instant = Instant.now();
        Instant addSecond = instant.plusSeconds(7);
        Instant addMili = addSecond.plusMillis(5);
        Instant addNano = addMili.minusNanos(3);

        System.out.println(instant);
        System.out.println(addNano);
    }
}

/*
Alternatif;
Main metoddan sonra;
Instant instant = Instant.now();
Instant future = instant.plusSeconds(7).plusMillis(5).plusNanos(3);

System.out.println(instant);
System.out.println(future);
 */