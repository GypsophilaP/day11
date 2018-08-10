package cn.day17_Set_Son.cn.itcast_08;

/**
 * Created by Gypsophila on 2018/4/28.
 */
public class Student {
    private String name;
    private int chineseScore;
    private int englishScore;
    private int mathScore;
    private int total;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", chineseScore=" + chineseScore +
                ", englishScore=" + englishScore +
                ", mathScore=" + mathScore +
                ", total=" + total +
                '}';
    }

    public int getTotal() {
        return this.chineseScore+this.englishScore+this.mathScore;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (chineseScore != student.chineseScore) return false;
        if (englishScore != student.englishScore) return false;
        if (mathScore != student.mathScore) return false;
        return name.equals(student.name);

    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + chineseScore;
        result = 31 * result + englishScore;
        result = 31 * result + mathScore;
        return result;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getChineseScore() {
        return chineseScore;
    }

    public void setChineseScore(int chineseScore) {
        this.chineseScore = chineseScore;
    }

    public int getEnglishScore() {
        return englishScore;
    }

    public void setEnglishScore(int englishScore) {
        this.englishScore = englishScore;
    }

    public int getMathScore() {
        return mathScore;
    }

    public void setMathScore(int mathScore) {
        this.mathScore = mathScore;
    }

    public Student(String name, int chineseScore, int englishScore, int mathScore) {

        this.name = name;
        this.chineseScore = chineseScore;
        this.englishScore = englishScore;
        this.mathScore = mathScore;
    }
}
