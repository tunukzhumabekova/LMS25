package LMSProgect.Service;

import LMS21.Enum.Gender;
import LMSProgect.Class.DataBase;
import LMSProgect.Class.Student;
import LMSProgect.Interface.StudentInterface;

import java.util.Scanner;

public class StudentService implements StudentInterface {
    private DataBase dataBase;

    public StudentService(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    Scanner scanner = new Scanner(System.in);

    @Override
    public void addNewStudentToGroup() {
        System.out.println("Enter name of student");
        String name = scanner.nextLine();
        System.out.println("Enter surname of student");
        String lastname = scanner.nextLine();
        System.out.println("Enter email of student");
        String email = scanner.nextLine();
        System.out.println("Enter password of student");
        Object password = scanner.nextLine();
        String gender = scanner.nextLine();
        Gender gender1 = Gender.valueOf(gender);
        Student student1 = new Student(name, lastname, email, password, gender1);
        System.out.println("Enter group name to add");
        for (int i = 0; i < dataBase.getGroups().size(); i++) {


            dataBase.getGroups().get(i).getStudents().add(student1);
        }
    }


    @Override
    public void updateStudent(String studentName, String updatedStudent) {
        for (int i = 0; i < dataBase.getStudents().size(); i++) {
            if (dataBase.getStudents().get(i).getFirstName() == studentName) {
                dataBase.getStudents();
                break;
            }
        }
    }

    @Override
    public String findStudentByFirstName(String firstName) {
        for (int i = 0; i < dataBase.getGroups().size(); i++) {
            if (dataBase.getGroups().get(i).getStudents().get(i).getFirstName().equals(firstName)) {
                return dataBase.getStudents().toString();
            }
        }
        return null;
    }

    @Override
    public String getAllStudentsByGroupName(String groupName) {
        for (int i = 0; i < dataBase.getGroups().size(); i++) {
            if (dataBase.getGroups().get(i).getGroupName().equals(groupName)) {
                return dataBase.getGroups().toString();

            }
        }
        return null;
    }

    @Override
    public void deleteStudent(String studentName) {
        for (int i = 0; i < dataBase.getStudents().size(); i++) {
            if (dataBase.getStudents().get(i).getFirstName().equals(studentName)) {
                dataBase.getStudents().remove(i);
                break;
            }
        }
    }
}