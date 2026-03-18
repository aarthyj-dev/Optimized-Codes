// Problem Statement in https://www.hackerearth.com/community/practice/divisible-or-not-81b86ad7/
// Solution
#include <stdio.h>
int main(){
	int N = 0;
	scanf("%d", &N);
	long data[N];
	long last;
  // Get inputs
	for(auto i=0; i<N; i++)
	{
	    scanf("%ld", &data[i]);
	  	last=data[i];
  }
  //Check last element is divisible by 10 . No need to check all elements's last digit
	if(last%10==0)
	{
		printf("Yes");
	}
	else
	{
		printf("No");
	}
    return 0;
}
