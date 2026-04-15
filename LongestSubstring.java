//Visit problem statement in website(through link given in readme)
//Solution part
class Solution {
    public int lengthOfLongestSubstring(String s) 
    {
        int left=0,maxlength=0;
        char[] arr= s.toCharArray();
        Set<Character> charset=new HashSet<>();
        for(int right=0;right<s.length();right++)
        {
            while(charset.contains(arr[right]))
            {
                charset.remove(arr[left]);
                left+=1;
            }
            charset.add(arr[right]);
            maxlength=Math.max(maxlength,right-left+1);
        }    
        return maxlength;
    }
}
