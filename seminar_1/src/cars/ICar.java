package cars;

public interface ICar {

    default void signal() {
        System.out.println("bi-biiiiik");
    }

    void playMusic(String music);
}
