//name ascending and salary descending
import java.util.*;

public class TreeSetTest24{
    public static void main(String args[]){
        TreeSet<TreeSet24> ts1= new TreeSet(new NameComp());

        TreeSet24 e1=new TreeSet24(123,"ABC",78000);
        TreeSet24 e2=new TreeSet24(101,"XYZ",88000);
        TreeSet24 e3=new TreeSet24(105,"ASDEF",68000);
        TreeSet24 e4=new TreeSet24(199,"PQR",48000);
        TreeSet24 e5=new TreeSet24(153,"QWERTY",98000);

        ts1.add(e1);
        ts1.add(e2);
        ts1.add(e3);
        ts1.add(e4);
        ts1.add(e5);
        ts1.add(new TreeSet24(193,"MNR",99000));//anonymous object

        TreeSet<TreeSet24> ts2=new TreeSet(new SalaryComp());

        ts2.add(e1);
        ts2.add(e2);
        ts2.add(e3);
        ts2.add(e4);
        ts2.add(e5);
        ts2.add(new TreeSet24(193,"MNR",99000));

        System.out.println("printing name ascending..");
        Iterator<TreeSet24> itr1= ts1.iterator();
        while(itr1.hasNext()){
            System.out.println(itr1.next());
        }


        System.out.println("printing salary in descending.");
        Iterator<TreeSet24> itr2=ts2.iterator();
        while(itr2.hasNext()){
            System.out.println(itr2.next());
        }
    }
}

class NameComp implements Comparator<TreeSet24>{
    @Override
    public int compare(TreeSet24 e1, TreeSet24 e2){
        return e1.getEmpName().compareTo(e2.getEmpName());
    }
}

class SalaryComp implements Comparator<TreeSet24>{
    @Override
    public int compare(TreeSet24 e1, TreeSet24 e2){
        if(e2.getSalary()>e1.getSalary()){
            return 1;
        }else{
            return -1;
        }
    }
}