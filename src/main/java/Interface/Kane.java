package Interface;

public class Kane implements Wrestler {

    @Override
    public void themeMusic() {
        System.out.println("Theme from Kane");
    }

    @Override
    public void finisher() {
        System.out.println("The killer song");
    }

    @Override
    public void paymentForWork(int hours) {
        System.out.println("Kane makes $" + hours*200 + " in " + hours + " hours.");
    }
}
