import java.util.Random;

public class Car implements Runnable{
    private String name;
    private double speed;

    public Car(String name, double speed) {
        this.name = name;
        this.speed = speed;
    }

    @Override
    public void run(){
        Random rand = new Random();
        for (int i = 1; i <= 30; i++){

            int ran = rand.nextInt(100);
            if (ran < 10){
                try{
                    throw new BrokenCarException("Xe "+ this.name + " đã bị nổ lốp");
                } catch (BrokenCarException e) {
                    System.out.println(e.getMessage());
                    return;
                }
            }

            long sleepTime = rand.nextLong((int)this.speed - 100 + 1) + 100;
            try {
                Thread.sleep(sleepTime);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println(this.name + " đã chạy được " + i + " km");
        }
    }
}
