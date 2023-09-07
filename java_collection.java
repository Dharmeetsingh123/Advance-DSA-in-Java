import java.util.*;
public class java_collection {
    public static void main(String arr[]){
        ArrayList<String> list=new ArrayList<String>();
        list.add("ravi");
        list.add("raj");
        for(String name:list){
            System.out.println(name);
        }
       
System.out.println(list.size());
        list.remove(1);
  
        Iterator itr=list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }




        List<Integer> num=new ArrayList<>();
        num.add(10);
        num.add(30);
        num.add(20);
        num.add(40);
        num.add(60);
        num.sort(null);
        for (int n:num){
            System.out.println(n);
        }



        Vector<Integer> v=new Vector<>();
        v.add(10);
        v.add(20);
        v.remove(0);
        for(int i:v){
            System.out.println(i);
        }

        Iterator itr1=v.iterator();
        while(itr1.hasNext()){
            System.out.println(itr1.next());
        }
        



        Map<Integer,String> map=new HashMap<>();
        map.put(1, "rahul");
        map.put(2,"amit");
       for (Map.Entry m:map.entrySet()){
        System.out.println(m.getKey()+":"+m.getValue());
       }

    }
    
}
