class Solution {
public:
    int longestConsecutive(vector<int>& nums) {
        set<int> set;
        for(int i : nums){
            set.insert(i);
        }
        
        int longestStreak = 0;
        
        for(int i : nums){
            if (!set.count(i-1)){
                int currentNum = i;
                int currentStreak = 1;
                
                while (set.count(currentNum + 1)){
                    currentNum +=1;
                    currentStreak +=1;
                }
                longestStreak = max(longestStreak, currentStreak);
                
            }
        }
        return longestStreak;
        
    }
};