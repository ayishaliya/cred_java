import java.util.ArrayList;
public class ArrayList1 {
    public static void main(String[] args)
    {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Volvo");
        cars.add("Mini Cooper");
        cars.add("Porsche");
        cars.add(2,"Tesla");
        System.out.println("List:");
        for(int i=0;i<cars.size();i++){
            System.out.println(cars.get(i));
        }
        cars.set(0, "Toyota");
        System.out.println("After setting Toyota:");
        for(String i: cars){
            System.out.println(i);
        }
        cars.remove(3);
        cars.remove("Toyota");
        System.out.println("After removing:");
        for(String i: cars){
            System.out.println(i);
        }
        cars.clear();
        for(String i: cars){
            System.out.println(i);
        }

    }
}
