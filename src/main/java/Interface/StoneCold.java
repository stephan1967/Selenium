package Interface;

public class StoneCold implements Wrestler {
    @Override
    public void themeMusic() { System.out.println("Theme from StoneCold");   }

    @Override
    public void finisher() {
        System.out.println("Bye Bye");
    }

    @Override
    public void paymentForWork(int hours) {
        System.out.println("StoneCold makes $" + hours*450 + " in " + hours + " hours.");
    }
}
