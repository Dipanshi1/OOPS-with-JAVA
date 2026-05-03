import java.util.HashMap;
public class HashMapExample {
    public static void main(String args []) {
        HashMap <String, Integer> marks = new HashMap<>();
        marks.put("Maths", 95);
        marks.put("Science", 90);
        System.out.println("Marks in Maths: " + marks.get("Maths"));
        System.out.println("Marks in Science: " + marks.get("Science"));
        System.out.println("Removed Marks in Science: " + marks.remove("Science"));
        System.out.println("Contains Key 'Science': " + marks.containsKey("Science"));
    }
}