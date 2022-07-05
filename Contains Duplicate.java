class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> number = new HashSet<Integer>();
        
        for(int num : nums) {
            if(number.contains(num)) return true;
            
            number.add(num);
        }
        return false;
    }
}
