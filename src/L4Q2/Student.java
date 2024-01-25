package L4Q2;

// Student Class
public class Student implements Comparable<Student>
{
    // Fields
    private double score;
    private String firstName;
    private String lastName;

    // Default Constructor
    public Student()
    {
        this.score = 100.0;
        this.firstName = "Tyler";
        this.lastName = "Liquornik";
    }

    // Custom Constructor
    public Student(String fName, String lName, double sc)
    {
        this.score = sc;
        this.firstName = fName;
        this.lastName = lName;
    }

    // Accessors and Mutators
    public double getScore() {return score;}
    public String getFirstName() {return firstName;}
    public String getLastName() {return lastName;}
    public void setScore(double score) {this.score = score;}
    public void setFirstName(String firstName) {this.firstName = firstName;}
    public void setLastName(String lastName) {this.lastName = lastName;}

    // Stringified student object
    @Override
    public String toString()
    {
        return String.format("%s %s: %.2f", firstName, lastName, score);
    }

    // For comparing students
    @Override
    public int compareTo(Student s)
    {
        // 1 if score > s.score, -1 if score < s.score, 0 if score = s.score
        return Double.compare(score, s.getScore());
    }
}
