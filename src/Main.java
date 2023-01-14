public class Main {
    public static void main(String[] args) {
//        PractikaOne pr1 = new PractikaOne(new String[]{"Emilbek0","Emilbek1","Emilbek2","Emilbek3"});
//        int varAble = 0;
//        pr1.getNameIndex(pr1.getName(),varAble);

        Dolphin dolphin = new Dolphin("XOXO",2,5.2,25);
        Cheetah сheetah = new Cheetah("Nemo",2,4.3,95);
        сheetah.setDolphin(dolphin);
        сheetah.comparator();
        сheetah.IQCounter();


    }
}