package interviewbit;

public class Factorial {
    public static void main(String... args){
        //printFactorial(4);
        System.out.print(printFactorRecursion(4,1));
    }
    static void printFactorial(int num){
        int factor = 1;
        if(num == 0 )return ;
        while(num > 0){
            factor *= num;
            num--;
        }
        System.out.println(factor);
    }

    static int printFactorRecursion(int num,int factor ) {
        if (num == 0) return factor;
        factor *= num;
        return  printFactorRecursion(num-1, factor);
    }
}
