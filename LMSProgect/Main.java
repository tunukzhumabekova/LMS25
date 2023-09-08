package LMSProgect;

import LMS21.Enum.Gender;
import LMSProgect.Class.DataBase;
import LMSProgect.Class.Group;
import LMSProgect.Class.Lesson;
import LMSProgect.Class.Student;
import LMSProgect.Service.GroupService;
import LMSProgect.Service.LessonService;
import LMSProgect.Service.StudentService;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        List <Lesson> lessons=new ArrayList<>();
        Lesson lesson2=new Lesson("Set","Tree Set");
        lessons.add(lesson2);
        List<Student>students=new ArrayList<>();
        Student student2=new Student("Tunuk","Zhumabekova","Tunuk@gmail.com",123456, Gender.FEMALE);
        students.add(student2);
        Group groups=new Group("Java 11","The best group",lessons,students);
        List<Group> group1=new ArrayList<>();
        group1.add(groups);
        DataBase dataBase=new DataBase(group1);
        GroupService G=new GroupService(dataBase);
        StudentService S=new StudentService(dataBase);
        LessonService l=new LessonService(dataBase);
        Scanner scanner = new Scanner(System.in);

        while(true) {


            System.out.println(" 1 -> Add new group\n" +
                    " 2 -> Get group by name\n" +
                    " 3 -> Update group name\n" +
                    " 4 -> Get all groups\n" +
                    " 5 ->Add new student to group\n" +
                    " 6 -> Update student\n" +
                    " 7 -> Find student by first name\n" +
                    " 8 -> Get all students by group name\n" +
                    " 9 -> Get all student's lesson\n" +
                    "10 -> Delete student\n" +
                    "11 -> Add new lesson to group\n" +
                    "12 -> Get lesson by name\n" +
                    "13 -> Get all lesson by group name\n" +
                    "14 -> Delete Lessons\n" +
                    "15 -> Delete group");

            int a = scanner.nextInt();

            switch (a) {
                case 1:
                    G.addNewGroup(group1.toString());
                    break;
                case 2:
                    System.out.println(G.getGroupByName("Java 11"));
                    break;
                case 3:
                    System.out.println("Enter group name that you want to update");
                    String oldName=scanner.nextLine();
                    System.out.println("Enter new name to update");
                    String newName=scanner.nextLine();
                    G.updateGroupName(oldName, newName);

                    break;
                case 4:
                    System.out.println(G.getAllGroups());
                    break;
                case 5:
                    S.addNewStudentToGroup();
                    break;
                case 6:
                    System.out.println("Enter name of student that you want to update");
                    String oldName1=scanner.nextLine();
                    System.out.println("Enter new name to update");
                    String newName1=scanner.nextLine();
S.updateStudent(oldName1,newName1);                    break;
                case 7:
                    System.out.println("Enter name of student to find");
                    String name=scanner.nextLine();
                    S.findStudentByFirstName(name);
                    break;
                case 8:
                    System.out.println("Enter a group name to get students");
                    String groupName=scanner.nextLine();
                    S.getAllStudentsByGroupName(groupName);
                    break;
                case 9:
                    System.out.println("Enter a student's name");
                    String sName=scanner.nextLine();
                    l.getAllStudentsLessons(sName);
                    break;
                case 10:
                    System.out.println("Enter a student name that you want to delete");
                    String nameS=scanner.nextLine();
S.deleteStudent(nameS);                    break;
                case 11:
                    break;
                case 12:
                    System.out.println("Enter a lesson to get");
                    String name1=scanner.nextLine();
l.getLessonByName(name1);
                    break;
                case 13:
                    System.out.println();
                    break;
                case 14:
                    System.out.println();
                    break;
                case 15:
                    System.out.println();
                    break;
            }
        }
    }
}
