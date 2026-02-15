import java.util.ArrayList;
import java.util.List;

public class Collections {
    public static void main(String[] args) {
        
       // Collection<Integer> nums = new ArrayList<Integer>(); //or just typecast as it is initially in object form

        List<Integer> nums = new ArrayList<Integer>();
        nums.add(1);
        nums.add(2);
        nums.add(5);
        nums.add(6);
        nums.add(2);

        for(int num:nums){
            System.out.print(num+" ");
        }

        System.out.println(nums.get(1));
        System.out.println(nums.indexOf(2));
        
    }
}
