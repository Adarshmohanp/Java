import java.util.*;
public class CollectionsTest23{
        public static void main(String[]args){
            List arrList =new ArrayList();

            arrList.add(new Collections23(123,"ABC",9.0,"Pune","XYZ"));
            arrList.add(new Collections23(456,"DEF",8.0,"Pune","XYZ"));
            arrList.add(new Collections23(789,"HIJ",7.0,"Pune","XYZ"));

            System.out.println(arrList);

            Iterator itr=arrList.iterator();
            while(itr.hasNext()){
                System.out.println(itr.next());
            }

            System.out.println("*************************");

            Iterator i=arrList.iterator();
            while(i.hasNext()){
                Collections23 s=(Collections23)i.next();
                System.out.println(s.id+" "+s.gpa);
            }
        }
}