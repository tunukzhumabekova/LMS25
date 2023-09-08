package LMSProgect.Class;

import java.util.List;

public class DataBase {
    private List<Group>groups;
    private List<Lesson> lessons;
    private List<Student> students;

    public DataBase(List<Group> groups, List<Lesson> lessons, List<Student> students) {
        this.groups = groups;
        this.lessons = lessons;
        this.students = students;
    }

    public DataBase(List<Group> group1) {
        this.groups=group1;
    }

    public List<Group> getGroups() {
        return groups;
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }

    public List<Lesson> getLessons() {
        return lessons;
    }

    public void setLessons(List<Lesson> lessons) {
        this.lessons = lessons;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "DataBase{" +
                "groups=" + groups +
                ", lessons=" + lessons +
                ", students=" + students +
                '}';
    }
}
