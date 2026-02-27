package Java_Programs;
public class EvenNumber{
    public static void main(String[] args){
        for(int i = 2; i<=10; i+=1){
            if (i%2==0){
                System.out.println(i + " is an even number");
            }else{
                System.out.println(i + " is an odd number");
            }
        }
    }
}

