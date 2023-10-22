
interface NoParameter {
    void print();
}

interface SingleParameter {
    void print(Integer p);
}

interface MultiParameter {
    void print(Integer p, Integer q);
}

interface ReturnParameter{
    boolean returnSomething(Integer p);
}

interface AddNumbers{
    int sum(Integer a, Integer b);
}

public class LambdaSyntax {
    public static void main(String[] args) {

        // NO PARAMETER LAMBDA
        // 1st way to execute noParameter Lambda Expression
        runNoParameter(() -> System.out.println("Hello world using method call"));
        // 2nd way to execute noParameter Lambda Expression
        NoParameter noParameter = () -> System.out.println("Printing Hello world by creating an object");
        noParameter.print();


        // SINGLE PARAMETER LAMBDA
        // 1st way to execute SingleParameter Lambda Expression
        runSingleParameter(p -> System.out.println(p), 11);
        //2nd way to execute SingleParameter Lambda Expression
        SingleParameter singleParameter = p -> System.out.println(p);
        singleParameter.print(11);


        // MULTI PARAMETER LAMBDA
        // 1st way to execute MultiParameter Lambda Expression
        runMultiParameter((p, q) -> System.out.println(p + " " + q), 23, 55);
        //2nd way to execute MultiParameter Lambda Expression
        MultiParameter multiParameter = (p, q) -> System.out.println(p + " " + q);
        multiParameter.print(23, 55);

        //MULTILINE LAMBDA EXPRESSION (In case of multi line lambda expression we must use curly braces)
        runSingleParameter((p) -> {
            if (p % 2 == 0) System.out.println("even");
            else System.out.println("odd");
        }, 20);

        // LAMBDA EXPRESSION WITH RETURN TYPE (if we are using return statement we have to use curly bracket in lambda expression)
        runReturnParameter((o)->{
            if (o%2==0) return true;
            else return false;
        },3);

        //ANOTHER EXAMPLE OF LAMBDA WITH A RETURN TYPE
        runAddNumbers((a,b)->a+b,20,30);
    }

    static void runNoParameter(NoParameter noParameter) {
        noParameter.print();
    }

    static void runSingleParameter(SingleParameter singleParameter, Integer p) {
        singleParameter.print(p);
    }

    static void runMultiParameter(MultiParameter multiParameter, Integer p, Integer q) {
        multiParameter.print(p, q);
    }
    static void runReturnParameter(ReturnParameter returnParameter,Integer p){
        System.out.println(returnParameter.returnSomething(p));
        System.out.println(returnParameter.returnSomething(4));
    }

    static void runAddNumbers(AddNumbers addNumbers,Integer a, Integer b){
        System.out.println(addNumbers.sum(a,b));
    }
}
