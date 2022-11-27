import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Address address1=new Address("Street1",1);
        Address address2=new Address("Street2",2);

        Person person1=new Person("Person1",address1);
        Person person2=new Person("Person2",address2);

        List<Person> persons = Arrays.asList(person1,person2);
        System.out.println(getAddress(persons));

        List<String>names = Arrays.asList("Ivan","Maria", "Stephan", "John","Amalia");
        System.out.println(listWithoutnamesLength4(names));

        List<Integer>ints1= Arrays.asList(1,2,3,4);
        List<Integer>ints2= Arrays.asList(5,2,3,8);
        System.out.println(yesOrNo(ints1,ints2));

        System.out.println(reversed(ints1));






    }
    //1.Есть два класса: Address с полями улица и номер дома и
    // Person с полями  name and address.  нужно написать
    // метод List<Address> getAddress(List<Person> persons).
    // то есть по списку persons вернуть список их адресов
   public static List<Address> getAddress(List<Person> persons){
        List<Address>returnAddress = new ArrayList<>();

        for(Person p:persons){
            returnAddress.add(p.getAddress());
        }
        return returnAddress;
   }




    //2. есть список с именами Ivan,Maria, Stephan, John,Amalia.
    // Написать метод, который вернет список не содержащий
    // имена исходного списка длиной 4
    //Ivan,Maria, Stephan, John,Amalia. -> Maria, Stephan,Amalia.

    public static List<String> listWithoutnamesLength4(List<String>names){
        List<String>res=new ArrayList<>();
        for(String s:names){
            if(s.length()!=4)
                res.add(s);
        }
        return res;
    }

    //3. Есть два списка одинаковой длины с целыми числами. Написать метод, который вернет
    // списиок с элементами Yes или No где значение на i-м месте зависит от того равны ли
    // элементы двух списков под номером i
    //{1,2,3,4} ,{5,2,3,8} ->{No,Yes,Yes,No}
    public static List<String> yesOrNo(List<Integer>list1,List<Integer>list2){
        List<String>resultYesNo = new ArrayList<>();

        for(int i=0;i<list1.size();i++){
            if(list1.get(i)==list2.get(i))
                resultYesNo.add("Yes");
            else resultYesNo.add("No");
        }
        return resultYesNo;
    }

    //4.Написать метод, реверсирующий список,т.е. возвращающий список элементов в обратном порядке
    // 1,2,3 -> 3,2,1   Можно использовать методы класса Collections
    public static List<Integer> reversed(List<Integer>list){
        Collections.reverse(list);

        return list;
    }

    //5*.Написать метод, который возвращает строку, встречающуюся раньше в листе: самую
    // короткую или самую длинную. Если несколько строчек самые короткие или самые длинные,
    // тогда вернуть первую встреченную  из них. Лист не пустой
    //"bb","a","ff","ddd" -> "a"
    //"bb","aaa","ff","d" -> "aaa"
}
