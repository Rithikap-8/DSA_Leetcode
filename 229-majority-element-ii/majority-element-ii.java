class Solution {
    public List<Integer> majorityElement(int[] nums) {
      

    List<Integer> res = new ArrayList<Integer>();
    int count1=0,count2=0, person1=0, person2=0;
    for(int i=0;i<nums.length;i++)  {
        if(count1==0 && nums[i]!=person2) {
            count1=1;
            person1=nums[i];
        }
        else if(count2==0 && nums[i]!=person1){
           count2=1;
           person2=nums[i];
        }
        else if(person1==nums[i]){
            count1++;
        }
        else if(person2==nums[i]){
           count2++;
        }
        else{
            count1--;
            count2--;
        }
    }

    int threshold = nums.length/3;

    int p1=0,p2=0;
    for(int i=0;i<nums.length;i++)  {
        if(nums[i]==person1) {
            p1++;
        }
        else if(nums[i]==person2){
            p2++;
        }
    }

    if(p1>threshold){
        res.add(person1);
    }
    if(p2>threshold){
        res.add(person2);
    }
    return res;
    }
}