# Dp 
It is a technique used to solve by breaking them down into smaller subproblem

Dp is used in problems like 
1 overlapping
2 optimal substructure


Types of appraoches
# Top-down (Memoization) Eg Fibonacci and recursion and dp[]
starting the main problem and break it into subproblems
Memoization is used to store the already solverd problem and used them directly

genaral template
int fibo(int n){
if(n==0 || n==1 )return n;
if(dp[n]!=-1) return dp[n]; //solved
return dp[n] =fibo(n-1,dp)+fibo(n-2,dp);
}

# Bottom up (Tabulation)  Iterative approach

We sovle the smaller subproblems and then use them to solve bigger problems
useing loops and iteration
we use array to store them

general template
int fibo(int n){
    int[] dp=new int[n+1];
    dp[0] = 0;
    dp[1] =1;
    for(int i=2;i<=n;i++){
        dp[i]=dp[i-1]+dp[i-2];

    }
    return dp[n];
}
# Space optimization
