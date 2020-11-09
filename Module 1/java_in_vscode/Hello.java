/**
 * Hello
 */
public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello,Sam");
        int[] x = {1,2,3};//test case: x= {1,2,3},y=1 expect result 0.
        System.out.println(findLast(x,1));
        int[] y = {-4,2,0,2,-3}; //test case: x = {-4,2,0,2,-3}, expect result is 2.
        System.out.println(countPositive(y));
    }
    
    public static int findLast (int[] x, int y){
        for (int i=x.length-1;i>=0;i--){
            if(x[i] == y){
                return i;
            }
        }
        return -1;
    }

    public static int countPositive(int[] x){
        int count = 0;
        for(int i=0;i<x.length;i++){
            if(x[i]>0){
                count++;
            }
        }
        return count;
    }
}