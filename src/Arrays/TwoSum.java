package Arrays;

public class TwoSum {

    public static void main(String[] args) {
        int[] nums=new int[] {1,2,3,4,5};
        int target=5;
//        twoSum( nums, target);
        System.out.println("["+twoSum(nums,target)[0]+","+twoSum(nums,target)[1]+"]");
    }



    public static int[] twoSum(int[] nums, int target) {
        int[] x=new int[2];
        for(int i=0;i<nums.length;i++){

            for(int j=1;j<nums.length;j++){
                if(j>i) {
                    int p;
                    p = nums[i] + nums[j];

                    if (p == target) {

                        x=new int[]{i,j};
                        return x;
                    } else {

                    }
                } else {

                }
            }
        }

        return x;

    }

}