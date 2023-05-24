import java.util.ArrayList;
import java.util.List;
    public class Conversion_Of_arrayList_and_Array {
        public static void main(String[] args) {
            List<String> aList = new ArrayList<String>();
            aList.add("Nathan");
            aList.add("John");
            aList.add("Susan");
            aList.add("Betty");
            aList.add("Peter");
            Object[] objArr = aList.toArray();
            System.out.println("The array elements are: ");
            for (Object i : objArr) {
                System.out.println(i);
            }
        }
}

//In this Program Array Covert into ArrayList

//import java.util.Arrays;
//        import java.util.List;
//
//class  Conversion_Of_arrayList_and_Array {
//
//    public static void main(String[] args)
//    {
//
//        Integer arr[] = { 10, 20, 11, 21, 31 };
//
//        List<Integer> arrList= Arrays.asList(arr);
//
//        System.out.println("Integer Array as List: " + arrList);
//    }
//}

