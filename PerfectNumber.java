/* Perfect number is, if the number and sum of its factors are equal
eg: num = 6 factors=1+2+3=6 then true*/

//Normal way with Time Complexity O(root n)
class Solution 
{
    public boolean checkPerfectNumber(int num) 
    {
        int sum=1;
        if(num==1) return false;
        for(int i=2;i<=num/2;i++)
        {
            if(num%i == 0)
            {
                sum+=i;
            }
        }
        if(sum==num) return true;
        else return false;
    }
}

//Optimized way with Time Complexity O(1)
/*In general there are only a few perfect number.
They are=>{6,28, 496, 8128, 33550336,8589869056, 137438691328, 2305843008139952128}
Since, the num is int datatype then take first 5 numbers in the above list.
Note : all perfect numbers ends with either 6 or 28.*/

class Solution 
{
    public boolean checkPerfectNumber(int num) 
    {
        if(num%10 == 6 || num%100==28)
        {
            if(num==6 || num== 28 || num== 496 || num== 8128 || num== 33550336)
            {
                return true;
            }
        } 
        return false;
        
    }
}


