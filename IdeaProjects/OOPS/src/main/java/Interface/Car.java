package Interface;

public class Car implements  Engine, Media{
    @Override
    public void start() {
        System.out.println("noremal car start");
    }

    @Override
    public void stop() {
        System.out.println("noremal car stop");

    }

    @Override
    public void acc() {
        System.out.println("noremal car acc");

    }
}
