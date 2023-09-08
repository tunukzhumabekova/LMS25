package LMSProgect.Interface;

import LMSProgect.Class.Student;

public interface StudentInterface {

    void addNewStudentToGroup();


    void updateStudent(String studentName, String updatedStudent);

    public String findStudentByFirstName(String firstName);
    public String getAllStudentsByGroupName(String groupName) ;
    public void deleteStudent(String StudentName) ;


    }
