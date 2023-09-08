package LMSProgect.Interface;

import LMSProgect.Class.Lesson;

import java.util.List;

public interface LessonInterface {
    public List<Lesson> getAllStudentsLessons(String StudentName) ;
    public List<Lesson> getAllLessonsByGroupName(String groupName) ;
        public void deleteLesson(String lessonName) ;
        public void getLessonByName(String lessonName);


}
