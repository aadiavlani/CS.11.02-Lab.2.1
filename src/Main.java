// I have neither given nor received unauthorized aid on this piece of work.

public class Main {

    public static void main(String[] args) {

        morningGreeting("zhongguo");

    }

    // 1. add
    public static int add(int a, int b)
    {return a+b;}
    // 2. add
    public static int add(int a, int b, int c, int d){
        return add(a,b) + add(c,d) + add(0,0);
    }
    // 3. morningGreeting
    public static String morningGreeting(String urmom){
        return "早上好, " + urmom + "!";
    }
    // 4. afternoonGreeting
    public static String afternoonGreeting(String urmom) {
        return "下午好, " + urmom + "!";
    }
    // 5. triple
    public static String triple(String urmom) {
        return urmom + urmom + urmom;
    }
    // 6. half
    public static double half(double a){
        return a/2;
    }
    // 7. roundPositiveValueToNearestInteger
    public static int roundPositiveValueToNearestInteger(double a){
        return (int) (a + 0.5);
    }

    public static int roundNegativeValueToNearestInteger(double a) {
        return (int) (a - 0.5);

    }
}
