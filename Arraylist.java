import java.util.ArrayList;
public class Arraylist {
    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<String>();
        name.add("Keshav");
        name.add("lalit");
        name.add("Kumar");
        name.add("xyz");
        name.set(3,"gagan");
        name.remove(2);
        System.out.println(name);
        System.out.println(name.get(0));
    }

}
