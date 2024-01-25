package L4Q2;

import java.util.Comparator;

// Student last name comparisons
public class HelperClassCompareLastNames implements Comparator<Student>
{
    @Override
    public int compare(Student s1, Student s2)
    {
        return s1.getLastName().compareTo(s2.getLastName());
    }
}
