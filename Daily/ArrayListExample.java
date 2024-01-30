import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {

//        ArrayList<Integer> list = new ArrayList<>();
//
////        ADD Elements
//
//        list.add(12);
//        list.add(13);
//        list.add(14);
//        list.add(16);
//
//        System.out.println(list);
//
////        Change Element
//
//        list.set(0, 007);
//        System.out.println(list);
//
////        REMOVE Element
//
//        list.remove(2);
//        System.out.println(list);
//
////        SIZE of ArrayList
//
//        list.size;
//        System.out.println(list);
//
//        Taking INPUT with FOR LOOP

        Scanner in = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            arr.add(in.nextInt());
        }
        System.out.println(arr);
    }
}
