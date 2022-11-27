package employees;

import java.util.Comparator;

public class AgeNameComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        int res = Integer.compare(e1.getAge(),e2.getAge());
        if(res==0)
            res=e1.getName().compareTo(e2.getName());
        return res;
    }
}
