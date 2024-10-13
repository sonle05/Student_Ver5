/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stuver5;
import java.util.Scanner;

public class Processor {
    public static void main(String[] args) {
        PersonList personList = new PersonList();
        Scanner scanner = new Scanner(System.in);
        int option;
        while (true) {
            System.out.println("1. Add new student");
            System.out.println("2. Add new teacher");
            System.out.println("3. Update person by id");
            System.out.println("4. Delete person by id");
            System.out.println("5. Display all students and teachers");
            System.out.println("6. Find the student with the highest GPA");
            System.out.println("7. Find teachers by department");
            System.out.println("8. Check book borrowing status");
            System.out.println("9. Exit");
            System.out.print("Choose an option: ");
            option = scanner.nextInt();
            scanner.nextLine(); 

            switch (option) {
                case 1:
                    personList.addStudent();
                    break;
                case 2:
                    personList.addTeacher();
                    break;
                case 3:
                    System.out.println("Enter Person ID to update:");
                    String updateId = scanner.nextLine();
                    personList.updatePerson(updateId);
                    break;
                case 4:
                    System.out.println("Enter Person ID to delete:");
                    String deleteId = scanner.nextLine();
                    personList.deletePersonById(deleteId);
                    break;
                case 5:
                    personList.displayEveryone();
                    break;
                case 6:
                    personList.findTopStudent();
                    break;
                case 7:
                    System.out.println("Enter Department to find teachers:");
                    String department = scanner.nextLine();
                    personList.findTeacherByDepartment();
                    break;
                case 8:
                    break;
                case 9:
                    System.out.println("Exiting program.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
