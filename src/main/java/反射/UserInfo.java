package main.java.反射;

public class UserInfo {
    private String name;
    public int age = 30;
    public final boolean wannaPlayGame = true;

    public UserInfo(String name ,int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", wannaPlayGame=" + wannaPlayGame +
                '}';
    }
}
