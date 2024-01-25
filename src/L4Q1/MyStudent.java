package L4Q1;

public class MyStudent
{
    // Fields
    private String firstName;
    private double score;

    // Default constructor
    public MyStudent()
    {
        this.firstName = "Tyler";
        this.score = 100.0;
    };

    // Custom Constructor
    public MyStudent(String fName, double sc)
    {
        this.firstName = fName;
        this.score = sc;
    }

    // String equivalent is fName: sc
    public String toString()
    {
        return String.format("%s: %.2f", this.firstName, this.score);
    }
}
