package stuver5;

import java.util.Date;

public class Student extends Person {
    private float gpa;
    private String major;

    public Student(String id, String fullName, Date dateOfBirth, Date bookBorrowDate, Date bookReturnDate, float gpa, String major) {
        super(id, fullName, dateOfBirth, bookBorrowDate, bookReturnDate);
        this.gpa = gpa;
        this.major = major;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public void addPerson() {
        // Implement logic to add a student
    }

    @Override
    public void updatePerson(String id) {
        // Implement logic to update student by ID
    }

    @Override
    public void displayInfo() {
        System.out.println("Student ID: " + super.getId());
        System.out.println("Name: " + super.getFullName());
        System.out.println("Date of Birth: " + getFormattedDateOfBirth());
        System.out.println("GPA: " + gpa);
        System.out.println("Major: " + major);
        System.out.println("Book Overdue: " + (isBookOverdue() ? "Yes" : "No"));
    }
}