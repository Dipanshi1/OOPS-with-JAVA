import java.util.*;
public class Compare{
    public static void main(String args[]){
        ArrayList<Integer>list = new ArrayList<>();
        list.add(7);
        list.add(10);
        list.add(28);
        Collections.sort(list);
        System.out.println("Sorted list :" + list);
    }
}