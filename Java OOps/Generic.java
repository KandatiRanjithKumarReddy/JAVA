// import java.util.*;
// public class Generic {
//     public static void main(String[] args) {
//         GenericsExample<Integer> obj = new GenericsExample<>();
//         obj.add(1);
//         obj.add(2);
//         obj.add(3);
//         obj.add(4);
//         System.out.print("Integer List:");
//         obj.remove(4);
//         obj.display();
//     }
// }

// class GenericsExample<T> {
//     private List<T> list = new ArrayList<>();

//     public void add(T val){
//         list.add(val);
//     }

//     public void remove(T val){
//         if(list.isEmpty()){
//             System.out.println("The List Is Empty! Remove Failed");
//             return;
//         }
//         list.remove(val);
//     }

//     public void display(){
//         if(list.isEmpty()){
//             System.out.println("The List Is Empty! Display Failed");
//             return;
//         }
//         for(T val : list){
//             System.out.print(val+" ");
//         }
//     }
// }






import java.util.*;

public class Generic {
    public static void main(String[] args) {
        GenericsExample<Integer> obj = new GenericsExample<>();
        obj.add(10);
        obj.add(20);
        obj.remove(10);
    }
}

class GenericsExample<T> {
    private List<T> list = new ArrayList<>();

    public void add(T val){
        list.add(val);
    }

    public void remove(T val){
        if(list.isEmpty()){
            System.out.println("The List Is Empty! Remove Failed");
            return;
        }
        list.remove(val);
    }
}


// class ClassName {
//     <T> void methodName(T param) {
//         // Generic Method
//     }
// }