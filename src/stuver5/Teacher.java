package stuver5;

import java.util.Date;

public class Teacher extends Person {
    private String department;
    private String teachingSubject;

    public Teacher(String id, String fullName, Date dateOfBirth, Date bookBorrowDate, Date bookReturnDate, String department, String teachingSubject) {
        super(id, fullName, dateOfBirth, bookBorrowDate, bookReturnDate);
        this.department = department;
        this.teachingSubject = teachingSubject;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getTeachingSubject() {
        return teachingSubject;
    }

    public void setTeachingSubject(String teachingSubject) {
        this.teachingSubject = teachingSubject;
    }

    @Override
    public void addPerson() {
    }

    @Override
    public void updatePerson(String id) {
    }

    @Override
    public void displayInfo() {
        System.out.println("Teacher ID: " + super.getId());
        System.out.println("Name: " + super.getFullName());
        System.out.println("Date of Birth: " + getFormattedDateOfBirth());
        System.out.println("Department: " + department);
        System.out.println("Teaching Subject: " + teachingSubject);
        System.out.println("Book Overdue: " + (isBookOverdue() ? "Yes" : "No"));
    }
}


