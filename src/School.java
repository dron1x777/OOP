public class School {
    private int number;
    private String name;
    String[] school;

    void  setNumber(int number) {
        this.number = number;
    }
    void setName(String name) {
        this.name = name;
    }
    int getNumber() {
        return number;
    }
    String getName() {
        return name;
    }
    String getSchool(String[] school) {
        return school[number];
    }

}
