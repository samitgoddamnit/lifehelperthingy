public class Subject {
    private String name;
    private int creditValue;
    private String teacherName;
    private String teacherEmail;

    public Subject(String name,int creditValue, String teacherName, String teacherEmail){
        this.name = name;
        this.creditValue  = creditValue;
        this.teacherName = teacherName;
        this.teacherEmail = teacherEmail;
    }

    public String name() {
        return name;
    }
    public int creditValue() {
        return creditValue;
    }
    public String teacherName() {
        return teacherName;
    }
    public String teacherEmail() {
        return teacherEmail;
    }

    public void sname(String name) {
        this.name = name;
    }

    public void screditValue(int creditValue) {
        this.creditValue = creditValue;
    }

    public void steacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public void steacherEmail(String teacherEmail) {
        this.teacherEmail = teacherEmail;
    }
}
