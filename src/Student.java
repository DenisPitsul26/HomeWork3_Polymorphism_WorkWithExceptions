public class Student extends Person {
    private boolean stipend;
    private double averageScore;
    private int numberOfTheRecordBook;

    public Student(String firstName, String lastName, boolean sex, int age,
                   boolean stipend, double averageScore, int numberOfTheRecordBook) {
        super(firstName, lastName, sex, age);
        this.stipend = stipend;
        this.averageScore = averageScore;
        this.numberOfTheRecordBook = numberOfTheRecordBook;
    }

    public Student(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public Student() {
    }

    public boolean isStipend() {
        return stipend;
    }

    public void setStipend(boolean stipend) {
        this.stipend = stipend;
    }

    public double getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(double averageScore) {
        this.averageScore = averageScore;
    }

    public int getNumberOfTheRecordBook() {
        return numberOfTheRecordBook;
    }

    public void setNumberOfTheRecordBook(int numberOfTheRecordBook) {
        this.numberOfTheRecordBook = numberOfTheRecordBook;
    }


    @Override
    public void showInfo() {
        System.out.println("Student{" +
                "firstName=" + getFirstName() +
                ", lastName=" + getLastName() +
                ", sex=" + (getSex() ? "male" : "female") +
                ", age=" + getAge() +
                ", stipend=" + stipend +
                ", averageScore=" + averageScore +
                ", numberOfTheRecordBook=" + numberOfTheRecordBook +
                '}');
    }


    @Override
    public String toString() {
        return "Student{" +
                "firstName=" + getFirstName() +
                ", lastName=" + getLastName() +
                ", sex=" + (getSex() ? "male" : "female") +
                ", age=" + getAge() +
                ", stipend=" + stipend +
                ", averageScore=" + averageScore +
                ", numberOfTheRecordBook=" + numberOfTheRecordBook +
                "}\n";
    }
}
