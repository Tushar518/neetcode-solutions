class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Initialize the result array
        int[] result = new int[2];
        Map<Integer,Integer> checkmap = new HashMap<>();
        
        // Populate the map with value and index
        for (int i = 0; i < nums.length; i++) {
            checkmap.put(nums[i], i);
        }

        // Search for the two numbers
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];

            // Check if the difference exists in the map and is not the same index
            if (checkmap.containsKey(diff) && checkmap.get(diff) != i) {
                result[0] = i;
                result[1] = checkmap.get(diff);
                return result; // Returning the result as soon as a match is found
            }
        }
        return new int[0];
    }
}