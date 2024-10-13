package stuver5;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class PersonList {
    private ArrayList<Person> personList = new ArrayList<>();
    private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    private Scanner scanner = new Scanner(System.in);

    public void addStudent() {
        System.out.print("Enter Student ID:");
        String id = scanner.nextLine();
        
        System.out.print("Enter Full Name:");
        String fullName = scanner.nextLine();
        
        System.out.print("Enter Date of Birth (dd/MM/yyyy):");
        Date dateOfBirth = new Date(scanner.nextLine()); 
        
        System.out.print("Enter Book Borrow Date (dd/MM/yyyy):");
        Date bookBorrowDate = new Date(scanner.nextLine());
        
        System.out.print("Enter Book Return Date (dd/MM/yyyy):");
        Date bookReturnDate = new Date(scanner.nextLine());
        
        System.out.print("Enter GPA:");
        float gpa = scanner.nextFloat();
        
        scanner.nextLine(); 
        
        System.out.print("Enter Major:");
        String major = scanner.nextLine();

        Student student = new Student(id, fullName, dateOfBirth, bookBorrowDate, bookReturnDate, gpa, major);
        personList.add(student);
        System.out.println("Student added successfully.");
    }

    public void addTeacher() {
        System.out.print("Enter Teacher ID:");
        String id = scanner.nextLine();
        
        System.out.print("Enter Full Name:");
        String fullName = scanner.nextLine();
        
        System.out.print("Enter Date of Birth (dd/MM/yyyy):");
        Date dateOfBirth = new Date(scanner.nextLine());  
        
        System.out.print("Enter Book Borrow Date (dd/MM/yyyy):");
        Date bookBorrowDate = new Date(scanner.nextLine());
        
        System.out.print("Enter Book Return Date (dd/MM/yyyy):");
        Date bookReturnDate = new Date(scanner.nextLine());
        
        System.out.print("Enter Department:");
        String department = scanner.nextLine();
        
        System.out.print("Enter Teaching Subject:");
        String teachingSubject = scanner.nextLine();

        Teacher teacher = new Teacher(id, fullName, dateOfBirth, bookBorrowDate, bookReturnDate, department, teachingSubject);
        personList.add(teacher);
        System.out.println("Teacher added successfully.");
    }

    public void updatePerson(String id) {
        for (Person person : personList) {
            if (person.getId().equals(id)) {
                person.updatePerson(id);  
                System.out.println("Person updated successfully.");
                return;
            }
        }
        System.out.println("Person not found.");
    }

    public void deletePersonById(String id) {
        if (personList.removeIf(person -> person.getId().equals(id))) {
            System.out.println("Person deleted successfully.");
        } else {
            System.out.println("Person not found.");
        }
    }

    public void displayEveryone() {
        for (Person person : personList) {
            person.displayInfo();
            System.out.println("-----------");
        }
    }

    public Student findTopStudent() {
        Student topStudent = null;
        float maxGpa = -1;
        for (Person person : personList) {
            if (person instanceof Student) {
                Student student = (Student) person;
                if (student.getGpa() > maxGpa) {
                    maxGpa = student.getGpa();
                    topStudent = student;
                }
            }
        }
        if (topStudent != null) {
            System.out.print("Top Student:");
            topStudent.displayInfo();
        } else {
            System.out.println("No students found.");
        }
        return topStudent;
    }

   public void findTeacherByDepartment() {
        System.out.print("Enter department to find teacher: ");
        String department = scanner.nextLine();
        boolean found = false;
        for (Person person : personList) {
            if (person instanceof Teacher) {
                Teacher teacher = (Teacher) person;
                if (teacher.getDepartment().equalsIgnoreCase(department)) {
                    teacher.displayInfo();
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("No teachers found in department: " + department);
        }
    }
    
    private Person findPersonByIdInternal(String id) {
        for (Person person : personList) {
            if (person.getId().equals(id)) {
                return person;
            }
        }
        return null;
    }
    
   
}