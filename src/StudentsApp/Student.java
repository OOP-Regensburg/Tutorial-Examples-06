package StudentsApp;

public class Student {

    private static int nextID = 1;

    private String name;
    private double grade;
    private int creditPoints;
    private int id;

    public Student(String name, double grade) {
        this.name = name;
        this.grade = grade;
        creditPoints = 0;
        id = nextID;
        nextID++;
    }

    public String getName() {
        return name;
    }

    public double getGrade() {
        return grade;
    }

    public int getCreditPoints() {
        return creditPoints;
    }

    public void addCreditPoints(int points) {
        this.creditPoints += points;
    }

    public int getID() {
        return id;
    }

}
