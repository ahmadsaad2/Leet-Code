class Solution {

    public int valurof(char s){
       if (s == 'I') return 1;
        if (s == 'V') return 5;
        if (s == 'X') return 10;
        if (s == 'L') return 50;
        if (s == 'C') return 100;
        if (s == 'D') return 500;
        if (s == 'M') return 1000;
        return 0;
    }
    
    public int romanToInt(String ss) {
        int sum=0;
        int prev=0;
        for(int i=ss.length()-1;i>=0;i--){
            int res=valurof(ss.charAt(i));

            if(res>=prev) sum +=res;
            else {sum -= res;}

            prev=res;

        }
        return sum;

}
}