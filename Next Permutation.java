class Solution {
    void reverse(int a[],int i,int j){
        while(i<j){
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            i++;
            j--;
        }
    }
    void  swap(int nums[],int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public void nextPermutation(int[] nums) {
        int i=nums.length-2;
        if(nums==null||nums.length<=1) return ;
        // finding the dip(nums[i]<nums[i+1]);
     while(i>=0&&nums[i]>=nums[i+1]){
         i--;
        }
        // finding the just greater element from num[i];
    if(i>=0)
    {       int j=nums.length-1;
        while(nums[i]>=nums[j]) j--;
        swap(nums, i,j);
      }
   
    reverse(nums,i+1,nums.length-1);
    }
    
}

