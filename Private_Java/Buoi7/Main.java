class Main{
    public static void main(String[] args){
        Thread car1 = new Thread(new Car("Lambor", 200));
        Thread car2 = new Thread(new Car("Ducati", 300));

        car1.start();
        car2.start();
    }
}