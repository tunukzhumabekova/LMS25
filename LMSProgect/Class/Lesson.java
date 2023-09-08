package LMSProgect.Class;

public class Lesson {
    private int id;
    private String lessonName;
    private String TaskDescription;
    private static int idd=1;

    public Lesson( String lessonName, String taskDescription) {
        this.id = idd++;
        this.lessonName = lessonName;
        TaskDescription = taskDescription;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLessonName() {
        return lessonName;
    }

    public void setLessonName(String lessonName) {
        this.lessonName = lessonName;
    }

    public String getTaskDescription() {
        return TaskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        TaskDescription = taskDescription;
    }

    public static int getIdd() {
        return idd;
    }

    public static void setIdd(int idd) {
        Lesson.idd = idd;
    }

    @Override
    public String toString() {
        return "Lesson{" +
                "id=" + id +
                ", lessonName='" + lessonName + '\'' +
                ", TaskDescription='" + TaskDescription + '\'' +
                '}';
    }
}
