public class PractikaOne {
    private String[] name ;




    public PractikaOne(String[] name) {
        this.name = name;
    }
    public PractikaOne() {

    }
    void getNameIndex(String name [], int a){
        for (int i = 0; i < name.length; i++) {
            if (i == a){

                System.out.println(name[i]);


            }
        }
    }



    public void setName(String[] name) {
        this.name = name;
    }

    public String[] getName() {
        return name;
    }
}
