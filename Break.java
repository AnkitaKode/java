public class Break{
    
    public static void main(String []args){
        for(int i=0; i<4; i++){
            for(int j=0; j<3; j++){
                if(i==j)
                break;
                System.out.println(i + " " + j);
            }
        }
    }
}