package LMSProgect.Service;


import LMSProgect.Class.DataBase;
import LMSProgect.Class.Lesson;
import LMSProgect.Interface.LessonInterface;

import java.util.List;


public class LessonService implements LessonInterface {
private DataBase dataBase;

    public LessonService(DataBase dataBase) {
    }

    @Override
    public List<Lesson> getAllStudentsLessons( String StudentsName) {

        System.out.println("Enter name of student that you want to find");
        for (int i = 0; i < dataBase.getGroups().size(); i++) {


            if (dataBase.getGroups().get(i).getStudents().get(i).getFirstName().equals(StudentsName)){
                return dataBase.getGroups().get(i).getLessons();
            }
        }
                return null;

    }

    @Override
    public List<Lesson> getAllLessonsByGroupName(String groupName) {


        for (int i = 0; i < dataBase.getGroups().size(); i++) {


            if (dataBase.getGroups().get(i).getGroupName().equals(groupName)){
                return dataBase.getGroups().get(i).getLessons();
            }
        }
        return null;

    }


    @Override
    public void deleteLesson(String lessonName) {
        for (int i = 0; i < dataBase.getGroups().size(); i++) {
           dataBase.getGroups().get(i).getLessons().remove(lessonName); 
        }
    }

    @Override
    public void getLessonByName(String lessonName) {
        for (int i = 0; i < dataBase.getGroups().size(); i++) {
            if(dataBase.getGroups().get(i).getLessons().get(i).getLessonName().equals(lessonName));
            System.out.println(dataBase.getGroups().get(i).getLessons());
        }
    }


}

