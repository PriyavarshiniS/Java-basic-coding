package basics;

public class Fact {
    public static int fact(int x){
        if(x==1||x==0){
            return 1;
        }else{
            return(x*fact(x-1));
        }
    }
    public int trailingZeroes(int x) {
        int m=fact(x);
        String s=String.valueOf(m);
        char c[]=s.toCharArray();
        int ct=0;
        System.out.print(m);
        for(int i=c.length-1;i>=0;i--){
            if(c[i]=='0'){
                ct++;
            }else{
                break;
            }
        } return ct;
        //return(Integer.numberOfTrailingZeros(m));
    }
}


