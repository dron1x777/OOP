public class Group {
    String groupName;
    String[] students;


    public Group(String groupName, String[] students) {
        this.students = students;
        this.groupName = groupName;
    }
    public String addStudent(String student) {
        String[] newStudents = new String[students.length + 1];
        for (int i = 0; i < students.length; i++) {
            newStudents[i] = students[i];
        }
        newStudents[newStudents.length - 1] = student;
        students = newStudents;
        return student + " has joined to " + groupName;
    }

    public void printStudents() {
        for(int i  = 0; i < students.length; i++) {
            System.out.println("student " + (i+1) + ": " + students[i]+ "  ");
        }
    }
    public int countStudents() {
        return students.length;
    }
}
