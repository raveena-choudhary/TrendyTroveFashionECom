import java.net.SocketException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortByName{

    private String name;
    private int age;

    public SortByName(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {

        List<SortByName> list = new ArrayList<>();
        list.add(new SortByName("abc",1));
        list.add(new SortByName("aac",2));
        list.add(new SortByName("adc",3));

        Collections.sort(list, new Comparator<SortByName>(){
                    @Override
                    public int compare(SortByName s1, SortByName s2)
                    {
                        return s1.getName().compareTo(s2.getName());
                    }
                }
        );

        for(SortByName s: list)
        {
            System.out.println(s.getName() + ": " + s.getAge());
        }
    }
}
