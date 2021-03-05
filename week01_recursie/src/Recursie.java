import java.util.ArrayList;
import java.util.List;

public class Recursie {


    // Oefening 1: n-de Fibonacci-getal

    public static int fibonacci(int getal) {
        if (getal <= 0) {
            throw new IllegalArgumentException("getal mag niet kleiner zijn dan 1");
        } else if (getal <= 2) {
            return 1;
        } else {
            return fibonacci(getal - 1) + fibonacci(getal - 2);
        }
    }

    // Oefening 2 : som van cijfers

    public static int somVanCijfers(int getal) {
        if (getal < 0) {
            return somVanCijfers(getal * -1);
        } else if (getal < 10) {
            return getal;
        } else {
            return getal % 10 + somVanCijfers(getal / 10);
        }
    }

    // Oefening 3: keer een string om
    public static String keerOm(String s) {
        if (s == null) {
            throw new IllegalArgumentException("String is leeg");
        } else if (s.isEmpty()) {
            return "";
        } else {
            String eerste = s.substring(0,1);
            String rest = s.substring(1);
            return keerOm(rest) + eerste;
        }
    }

    //oefening 4: countX

    public static int countX(String s) {
        if (s == null) {
            throw new IllegalArgumentException("String is leeg");
        } else if (s.isEmpty()) {
            return 0;
        } else {
            int count = 0;
            if (s.substring(0, 1).equals("x")){
                count ++;
            }
            return count + countX(s.substring(1));
        }
    }

    //oefening 5 : countHi
    public static int countHi(String s) {
        if (s == null) {
            throw new IllegalArgumentException("String is leeg");
        } else if (s.length() <= 1) {
            return 0;
        } else {
            int count = 0;
            if (s.substring(0, 2).equals("hi")){
                count ++;
            }
            return count + countHi(s.substring(1));
        }
    }

    // oefening 6
    public static String changeXY(String s) {
        if (s == null) {
            throw new IllegalArgumentException("String is leeg");
        } else if (s.isEmpty()) {
            return "";
        } else {
            String eerste = s.substring(0, 1);
            if (eerste.equals("x")) {
                eerste = "y";
            }
            return eerste + changeXY(s.substring(1));
        }
    }

    // oefening 7

    public static String changePi(String s) {
        if (s == null) {
            throw new IllegalArgumentException("Geen sting gevonden");
        } else if (s.length() < 2) {
            return s;
        } else {
            String eerste2 = s.substring(0, 2);
            if (eerste2.equals("pi")) {
                eerste2 = "3.14";
                return eerste2 + changePi(s.substring(2));
            } else {
                return s.substring(0, 1) + changePi(s.substring(1));
            }
        }
    }

    // oefening 8:
    public static int tweelog(int getal) {
        if (getal <= 0) {
            throw new IllegalArgumentException("getal mag niet 0 of negatief zijn");
        } else if (getal == 1) {
            return 0;
        } else {
            return 1 + tweelog(getal / 2);
        }
    }

    // oefening 9;
/*    public static double findMaximum(List<Double> lijst) {
        if (lijst == null || lijst.equals("")) {
            throw new IllegalArgumentException("geen lijst gevonden of lijst is leeg");
        } else if (lijst.size() < 1) {
            return lijst;
        } else if (lijst.subList(0, 1) == lijst.subList(1, 2)) {

        }
        return 0;
    } */

    // oefening 10;
    public static ArrayList<String> findSubstrings(String string) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

}