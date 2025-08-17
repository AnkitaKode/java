@FunctionalInterface
interface A {
    int add(int i,int j);
}

//Lambda Expression works only with functional interface.
public class LambdaAdditionDemo {
    public static void main(String[] args) {
        A obj=(i,j) -> i+j;

        int result=obj.add(5,4);
        System.out.println("result: "+result);

    }
    
}
