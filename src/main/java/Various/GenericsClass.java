package Various;

public class GenericsClass<T> {

        // variable of T type
            private T data;

        // Constructor
            public GenericsClass(T data) {
                this.data = data;
        }

        // Method that return T type variable
            public T getData() {
                return this.data;
        }


    public static void main(String[] args) {

        // Initialize generic class with Integer data
        GenericsClass<Integer> intObj = new GenericsClass<>(5);
        System.out.println("Generic Class returns: " + intObj.getData());

        // Initialize generic class with String data
        GenericsClass<String> stringObj = new GenericsClass<>("Java Programming");
        System.out.println("Generic Class returns: " + stringObj.getData());
    }


}
