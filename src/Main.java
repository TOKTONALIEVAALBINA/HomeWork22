import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        List<Integer> array = new ArrayList<>();
        List<Integer>array1 = new ArrayList<>();
        List<Integer> array2 = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 50; i++) {
            array.add(random.nextInt(100));
            if(array.get(i)%2==0){ array1.add(array.get(i));
            } else array2.add(i);
        }
        System.out.println(array);
        System.out.println(array1);
        System.out.println(array2);




            
        }

    }
