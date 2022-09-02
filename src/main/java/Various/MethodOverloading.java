package Various;

class MethodOverloading {
    private static void display(int a){
        System.out.println("Arguments: " + a);
    }

    private static void display(int a, int b){
        System.out.println("Arguments: " + a + " and " + b);
    }

    private static void display(String a, double b , Boolean c){
        System.out.println("Arguments: " + a + " and " + b + " and " + c);
    }

    public static void main(String[] args) {
        display(4);
        display(3, 14);
        display("abd", 244.0 , true);
    }
}