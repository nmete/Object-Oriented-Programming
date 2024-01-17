package Exception_package;

public class Exception1{
    // abnormal behavior -> error
    // occures at runtime
    // handle edge cases instead of terminating

    // checked exception
    // unchecked exception
    // throwable, finally, final, try, catch, throw.

    public static void main(String[] args) throws Exception {
        final int a=100;
        try {
             throw new MyExceptions("hahah");
        }catch (Exception e){
            System.out.println(e);
        }finally {
            System.out.println("finally");
        }

        System.out.println("end statment");

        if(a==100){
            throw new Exception("Throwing custom exception");
        }
    }

    static void arith() throws Exception{
        int b= 4/0;

    }
}
