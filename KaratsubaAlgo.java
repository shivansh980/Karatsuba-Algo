package assignment3;

public class KaratsubaAlgo {
    static long  Karatsuba(long  A,long  B,long  result){
        if (A<10 && B<10){
            result=A*B;
            return result;
        }
        else{
            String help1=String.valueOf(A);
            String help2=String.valueOf(B);
            long  num1=(long )Math.pow(10,help1.length()/2);
            long  num2=(long )Math.pow(10,help2.length()/2);
            long  a=A/num1;
            long  b=A%num1;
            long  c=B/num2;
            long  d=B%num2;
            long  ter=Karatsuba(a,c,result);
            long  per=Karatsuba(b,d,result);
            result= (long ) (Math.pow(num1,2)*ter+num1*(Karatsuba((a+b),(c+d),result)-ter-per)+per);

        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(Karatsuba(1245678,2484578,0));

    }
}
