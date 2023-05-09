public class Man{
    static int fun(int a,int b) throws ArithmeticException{
        if(b==0){
            throw new ArithmeticException("this is an earror");
        }
        return a/b;
    }

    public static void main(String[] args) {
        int a=5;
        int b=0;
        try{
            fun(a,b);
            int c=a/b;

        }
        catch (Exception e){
           System.out.println(e);
            System.out.println(e.getClass());
        }
        finally {
            System.out.println("this will always execute");
        }
    }
}

//Ques1: WAP in which i am getting number format, input mismatch and null pointer exceptions ?
// Hint : null pointer : when reference variable is null
//     number format: When we convert String into some other datatype(LIke int,float etc)
//     input mismatch : when we put string in integer
