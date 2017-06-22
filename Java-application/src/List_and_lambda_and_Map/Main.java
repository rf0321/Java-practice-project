package List_and_lambda_and_Map;
import java.util.*;
import java.util.stream.Stream;

public class Main{
  public static void main(String[]args) {
      Map<Integer,String>map=new HashMap();
      map.put(1,"HogeMan");
      map.put(2,"FooMan");
      map.put(3,"BarMan");
          
      System.out.println(map);
    
      Stream<Entry<Integer,String>>stream=map.entrySet().stream();
      stream.forEach(e-> System.out.println(e.getKey()+":"+e.getValue()));
    
      List<Students> studentsList = new ArrayList<>();
      studentsList.add(new Students("かたいなかまま", -3));
      studentsList.add(new Students("白沢ノエル",45));
      studentsList.add(new Students("一の瀬さん",114514));

      System.out.println(studentsList);

      Collections.sort(studentsList,(student1,student2)
               ->Integer.compare(student1.getExamscore(),student2.hashCode()));
      System.out.println(studentsList);

      studentsList.stream() //streamAPI
              .filter(s ->s.getExamscore() >=30)
              .forEach(s->System.out.println(s.getStudentName()));

      if(studentsList.isEmpty()) {
              System.out.println("テストには、誰一人。。。。来ませんでした。。。");
              MessageClass msg=new MessageClass();
              String respone=msg.Action();
              System.out.println(respone);
          }
      }
  }


