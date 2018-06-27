package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Krasaycheg {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Виталик", "не знает почему не компилится piblic.", "Поэтому Виталик - лошарик");

        String text = list.stream()
                .map(p -> {
                    if (p.contains("лошарик"))
                        p = p.replace("лошарик", "Красаучег");
                    if (p.contains("не знает"))
                        p = p.replace("не знает", "ЗНАЕТ");
                    return p;
                })
                .collect(Collectors.joining(" ", "", "!!!"));
        System.out.println(text);

        String[] test = text.split("");

//        for (String st : test
//                ) {
//            System.out.println(st);
//        }

    }
}
