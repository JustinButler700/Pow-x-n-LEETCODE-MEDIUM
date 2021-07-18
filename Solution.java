class Solution {
    public double myPow(double x, int n) {
        double temp = x;
        if(n == 0){return 1;} // anything to ^0 is = 1
        if(x == 1.0 || (x == -1.0 && n%2!=0)){return x;} // if x is 1 or -1 where the power is odd
        if(x == -1.0){return -1 * x;} // if x is -1 where the power is even
        for(int i = 0; i < abs(n)-1; i++)
        {
            if(x <= 100000) // given absolute value x^n <= 10^4.
            {
                x *= temp;
            }
            else
            {
                return 0; // if out of range or larger than 100000 but negative
            }
        }
        return n < 0 ? 1/x : x;
    }
    // gets the Absolute value of a passed int
    public int abs(int val)
    {
        return val < 0 ? -1 * val: val;
    }
}
