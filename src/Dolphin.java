public class Dolphin {
    private String name;
    private int age;
    private double speed;
    private double iq;


    public Dolphin() {
    }

    public Dolphin(String name, int age, double speed, double iq) {
        this.name = name;
        this.age = age;
        this.speed = speed;
        this.iq = iq;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSpeed() {
        return speed;
    }

    public double getIq() {
        return iq;
    }
}
