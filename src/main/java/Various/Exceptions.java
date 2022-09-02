package Various;

public class Exceptions {
    public static void main(String[] args) {
           try  {
                    int[] myNumbers = {1, 2, 3};
                    System.out.println(myNumbers[2]);
                    System.out.println(myNumbers[2]/0);
                }
           catch (Exception e)
                {
                    System.out.println("Something went wrong. Error : " + e);
                }
           finally
                {
                    System.out.println("The 'try catch' is finished.");
                }
    }
}
