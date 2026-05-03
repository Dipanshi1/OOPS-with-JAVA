import java.io.BufferedReader;
import java.io.FileReader;
;public class TryWith {
    public static void main(String args[]){
        try(BufferedReader br = new BufferedReader(new FileReader("data.txt"))){
            System.out.println(br.readLine());
        }catch(Exception e){
            System.out.println("Exception Occured:" + e.getMessage());
        
        }

    }
}
    

