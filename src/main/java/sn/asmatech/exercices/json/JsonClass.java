package sn.asmatech.exercices.json;

import org.json.simple.JSONObject;

public class JsonClass {


    private String firstName;
    private String lastName;

    private int age;

    private  String competences[];


    public JsonClass(String firstName, String lastName, int age, String[] competences){

        this.firstName = firstName;
        this.lastName = lastName;
        this.age  = age;
        this.competences = competences;

    }

    public JSONObject getJsonObject() {

        JSONObject jsonObject = new JSONObject();

        jsonObject.put("firstName", this.firstName);
        jsonObject.put("lastName", this.lastName);
        jsonObject.put("age", this.age);
        jsonObject.put("competences", this.competences);

        return jsonObject;
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

    public String[] getCompetences() {
        return competences;
    }

    public void setCompetences(String[] competences) {
        this.competences = competences;
    }
}
