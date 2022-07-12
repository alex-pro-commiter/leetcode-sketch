package L704_binary_search;

public class L704 {


    public static int search(int[] nums, int target) {
        int left,mid,right;
        left=0;
        right=nums.length-1;
        mid= (int) Math.floor((left+right)/2);
        if (nums[left]>target||nums[right]<target)
            return -1;
        while (left<=right){
            if (nums[left]>target||nums[right]<target)
                return -1;
            if (nums[mid]==target){
                return mid;
            }
            if (nums[mid]>target){
                right=mid-1;
            }else {
                left=mid+1;
            }
            mid=(int) Math.floor((left+right)/2);
            System.out.printf("%d:%d:%d%n",left,mid,right);
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] num=new int[]{-1,0,3,5,9,12};
        System.out.println(search(num,9));
    }
}
