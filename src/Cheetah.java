public class Cheetah {
    private String name;
    private int age;
    private double speed;
    private double iq;
    private Dolphin dolphin;


    public Cheetah() {
    }

    public Cheetah(String name, int age, double speed, double iq) {
        this.name = name;
        this.age = age;
        this.speed = speed;
        this.iq = iq;
    }

    public void comparator(){

        if(speed > dolphin.getSpeed()){
            speed++;
            System.out.println("Балли Жаныбар!"+speed);
        }else if(speed <dolphin.getSpeed()){
            double v = dolphin.getSpeed() + 1;
            System.out.println("Балли Дельфин!"+v);
        }else {
            System.out.println("Что-то пошло не так!");
        }
    }
    public void IQCounter(){
        if(dolphin.getIq() < iq){
            System.out.println("Балли Жаныбар iq у тебя больще!");
        }else if(speed <dolphin.getIq()){
            System.out.println("Балли Дельфин iq у тебя больще!");
        }else {
            System.out.println("Что-то пошло не так !");
        }
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

    public Dolphin getDolphin() {
        return dolphin;
    }

    public void setDolphin(Dolphin dolphin) {
        this.dolphin = dolphin;
    }


}
