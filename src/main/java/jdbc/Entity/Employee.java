package jdbc.Entity;

public class Employee {

    private Integer id;
    private Integer age;
    private String first;
    private String last;


    public Integer getId() {
        return id;
    }


    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }
}
