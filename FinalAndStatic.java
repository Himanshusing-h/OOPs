

import java.util.*;
    class Cricketer{
        //sharable variable
        static String country = "NZ";
        int runs;
        String name;
        double avg;
        void print(){//creating this static will give error as runs,name and avg will be different for everyone
            System.out.println(runs+" "+name+" "+avg);
        }
        //shareble method or we can say shareble memory
        static void greet(){
            System.out.println("I only believe in Jassi bhai");
        }
    }
public class FinalAndStatic {
        public static void main(String[] args) {
            Cricketer.greet();
            System.out.println(Cricketer.country);
//        Cricketer c1 = new Cricketer();
//        // c1.country = "England"; Error if country is given final
//        Cricketer c2 = new Cricketer();
//        c1.country = "India";
            //because country is static and one memory is allocated to country which is shareed among all objects and we changed it to india
//        System.out.println(c2.country);
//        c2.greet();


        }
    }

