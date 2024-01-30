package org.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

public class Lambda {
    static void printCond(Collection<Integer> c, Predicate<Integer> p) {
        for (Integer x : c)
            if (p.test(x)) System.out.print(x + " ");
        System.out.println();
    }

    public static void main(String[] args) {

        List<Integer> al = new ArrayList<>(Arrays.asList(10,5,20,7,30));
      
        // CODE BY CREATING A CLASS
        class MyPredicateEven implements Predicate<Integer> {
            public boolean test(Integer x) {
                return (x % 2 == 0);
            }
        }
        printCond(al,new MyPredicateEven());

        // CODE BY CREATING AN ANONYMOUS INNER CLASS
        Predicate<Integer> myPredicate = new Predicate<>(){
            public boolean test(Integer x){
                return (x%2==0);
            }
        };
        printCond(al,myPredicate);

        // CODE BY USING ANONYMOUS INNER CLASS DIRECTLY AS PARAMETER IN METHOD CALL

        printCond(al, new Predicate<>() {
            public boolean test(Integer x) {
                return (x % 2 == 0);
            }
        });

        // CODE BY USING LAMBDA EXPRESSION
        printCond(al, x-> x%2==0);



    }
}
