package curg.boardingGate.member;

public class Member {
    private int ID;
    private String name;
    private Grade grade;

    public Member(int ID, String name, Grade grade) {
        this.ID = ID;
        this.name = name;
        this.grade = grade;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }
}
