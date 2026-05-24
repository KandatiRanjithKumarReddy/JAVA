// public class Error_handling {
//     public static void main(String[] args)throws Exception {

//💥Exception handling:- 
// in Java that helps manage runtime errors and maintain the normal flow of a program. 
// An exception is an unwanted or unexpected event that occurs during program execution
// disrupting the normal flow.

// int a=10;
// int b=0;
// try{

// int ans = a/b;
// System.out.println(ans);
// }
// catch(ArithmeticException e){
// System.out.println("Cannot Divide with Zero");
// }

// finally{
// System.out.println("Program countinues......");
// }

// throw keywords in exception handling
// We Manually Throwing an Exception
// int a = 20;
// int b = a;

// try {
//     throw new Exception("a is not there");
// } catch (Exception e) {
//     System.out.println(e);
// }
// fun();
//}

//Throws KeyWords
//The method does not handle the exception internally.
//It leaves the responsibility of handling the exception to the caller method.    
// class Error_handling {
//     public static void main(String[] args) {

//         try {
//             divide();
//         }

//         catch (ArithmeticException e) {
//             System.out.println("Handled exception: " + e);
//         }

//         System.out.println("Program continues...");
//     }

//     public static void divide() throws ArithmeticException {
//         int result = 10 / 0;
//     }
// }

//Defining Custom Exceptions
// class Custom_Exception extends Exception{

//     public Custom_Exception(String msg) {
//         super(msg);
//         System.out.println("You Need To UnderStand How JavaScript Works Internally");

//     }
// }

// class Error_handling {
//     public static void main(String[] args) throws Custom_Exception{
//         Boolean web_Developer = true;
//         if(web_Developer){
//             throw  new Custom_Exception("That's The Basic");
//         }
//         else{
//             System.out.println("Fine! Let's Start");
//         }

//     }
// }

//Defining Custom Exceptions-Real Life Example(Bank With Draw)
class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String msg) {
        super(msg);
    }
}

class Error_handling {
    public static void main(String[] args) throws InsufficientBalanceException {
        int balance = 5000;
        int withdrawAmount = 7000;

        if (withdrawAmount > balance) {
            throw new InsufficientBalanceException("Insufficient Balance! Please Enter Money Accordingly");
        } else {
            System.out.println("Withdrawal Successful");
        }
    }
}