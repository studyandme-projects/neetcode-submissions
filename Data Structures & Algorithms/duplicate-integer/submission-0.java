class Solution {
    public boolean hasDuplicate(int[] nums) {
        if(nums.length <= 0 || nums.length >= 100000) {
            System.out.println("Out of range");
            return false;
        }
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i< nums.length; i++) {
            if(!set.add(nums[i])) {
                return true;
            }
        }
        return false;
    }
}