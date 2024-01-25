package L4Q2;

import java.util.Comparator;

// Student first name comparisons
public class HelperClassCompareFirstNames implements Comparator<Student>
{
    @Override
    public int compare(Student s1, Student s2)
    {
        return s1.getFirstName().compareTo(s2.getFirstName());
    }
}
