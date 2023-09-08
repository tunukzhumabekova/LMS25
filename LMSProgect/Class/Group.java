package LMSProgect.Class;

import java.util.List;

public class Group {
    private int id;
    private String GroupName;
    private String description;
    private List<Lesson> lessons;
    private List<Student> students;
    private static int idd = 1;

    public Group( String groupName, String description, List<Lesson> lessons, List<Student> students) {
        this.id = idd++;
        GroupName = groupName;
        this.description = description;
        this.lessons = lessons;
        this.students = students;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGroupName() {
        return GroupName;
    }

    public void setGroupName(String groupName) {
        GroupName = groupName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public static int getIdd() {
        return idd;
    }

    public static void setIdd(int idd) {
        Group.idd = idd;
    }

    @Override
    public String toString() {
        return "Group{" +
                "id=" + id +
                ", GroupName='" + GroupName + '\'' +
                ", description='" + description + '\'' +
                ", lessons=" + lessons +
                ", students=" + students +
                '}';
    }
}