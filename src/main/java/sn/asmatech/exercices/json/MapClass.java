package sn.asmatech.exercices.json;

import org.json.simple.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class MapClass {

    private String firstName;
    private String lastName;

    private int age;

    public MapClass(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public Map getJsonObject() {

        Map map = new HashMap();

        map.put("firstName", this.firstName);
        map.put("lastName", this.lastName);
        map.put("age", this.age);

        return map;
    }

}
