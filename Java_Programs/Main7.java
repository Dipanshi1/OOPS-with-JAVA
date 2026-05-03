import java.util.*;

public class Main7 {
    public static void main(String args[]){
        Collection<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println("using iterator");
        Iterator<Integer> itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("using for each loop");
        for(Integer i : list){
            System.out.println(i + " ");
        }
        System.out.println("using for each method");
        list.forEach(i -> System.out.println(i + " "));
        list.remove(20);
        System.out.println("After removing 20:");
        System.out.println(list);
        list.clear();
        System.out.println("After clearing the list:");
        System.out.println(list);
    
    if (list.isEmpty()) {
        System.out.println("The list is empty.");
    } else {
        System.out.println("The list is not empty.");
    }
  }
}

  

