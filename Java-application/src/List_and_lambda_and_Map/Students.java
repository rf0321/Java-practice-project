package List_and_lambda_and_Map;

public class Students {
    private String studentName;
    private int examscore;

    public Students(String studentName, int examscore) {
        this.examscore = examscore;
        this.studentName = studentName;
    }

    public String getStudentName() {
        return this.studentName;
    }

    public int getExamscore() {
        return this.examscore;
    }

    @Override
    public String toString() {
        return studentName + "は" + examscore + "点ね";
    }
}
 class MessageClass {
    private String EmptyMessage = "生徒０人";

    public String Action() {
        return EmptyMessage;
    }
}

