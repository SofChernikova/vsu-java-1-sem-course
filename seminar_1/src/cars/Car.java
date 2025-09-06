package cars;

public abstract class Car implements ICar {
    private double speed;
    private int year;
    private String model;

    public Car(double speed, int year, String model) {
        this.speed = speed;
        this.year = year;
        this.model = model;
    }

    @Override
    public void playMusic(String musicToPlay) {
        System.out.println("Turning on the music: " + musicToPlay);
    }

    public abstract void destination(String d);
}
