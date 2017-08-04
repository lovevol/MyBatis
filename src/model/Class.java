package model;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: liuhao
 * Date: 2017/8/4
 * Time: 17:01
 */
public class Class {
    private int id;
    private String code;
    private List<Student> students;

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public Class(String code) {
        this.code = code;
    }

    public Class(int id, String code) {

        this.id = id;
        this.code = code;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "Class{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", students=" + students +
                '}';
    }
}
