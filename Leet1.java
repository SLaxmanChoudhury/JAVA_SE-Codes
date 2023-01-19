class Leet1{

    public static void main(String [] args){
        int[] arr1 = {3,2,4};
        int target = 6;
        int[] arr = twoSum(arr1, target);
        System.out.println("[" + arr[0] + ", " + arr[1] + "]");
    }

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[]{0,0};
    }
}