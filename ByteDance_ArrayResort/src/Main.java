public class Main {
    public static void main(String[] args){
        int[] nums={-1, 4, -3, 0, -2, 3};
        int[] r=new int[nums.length];
        r=(new Resort()).resort(nums);
        System.out.println(r);
    }
}
