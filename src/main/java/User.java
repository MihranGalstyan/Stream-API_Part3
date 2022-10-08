/**
 * Created by Mihran Galstyan
 * All rights reserved
 */
public class User {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public User(final String name, final int age) {
        this.name = name;
        this.age = age;
    }
}
