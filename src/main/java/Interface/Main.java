package Interface;

public class Main {
    public static void main(String[] args){
       Wrestler whrestler1 = new StoneCold();
       whrestler1.themeMusic();
       whrestler1.finisher();
       whrestler1.paymentForWork(3);

       Wrestler whrestler2 = new Kane();
       whrestler2.themeMusic();
       whrestler2.finisher();
       whrestler2.paymentForWork(1);
    }
}
