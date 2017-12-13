import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Q01 {


    public static void main(String[] args) {
        List<String> list1 = new ArrayList();
        list1.add("Red");
        list1.add("Green");
        list1.add("Blue");

        List<String> list2 = new ArrayList();
        list1.add("1");
        list1.add("2");
        list1.add("3");

//        list1.add(0,"black" );
//        list1.set(1, "Pink");
//        list1.remove(1);
//        System.out.println(list1.contains("Red"));




        Collections.sort(list1);//сотрировка элементов массива
        Collections.copy(list1, list2);

//        Collections.shuffle(list1);//перемешивание
//        Collections.reverse(list1);
//        List<String> sub_list = list1.subList(2,5);
//        System.out.println(sub_list);



        for (String element: list1){
            System.out.println(element);
        }









        ArrayList<String> c1= new ArrayList();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");

        Iterator<String> iterator =c1.iterator();

        while (iterator.hasNext()){
            if ("Red".equals(iterator.next())){
                iterator.remove();
            }
//            System.out.println(iterator.next()+"--");

        }
        System.out.println(c1);


    }
}
