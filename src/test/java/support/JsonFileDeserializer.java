package support;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;

public class JsonFileDeserializer {
    public static void main(String[] args) {
        try {
            String path = System.getProperty("user.dir") + "/src/test/resources/data/" + "data.json";
            File jsonFile = new File(path);
            ObjectMapper objectMapper = new ObjectMapper();
            Person1 person1 = objectMapper.readValue(jsonFile, Person1.class);
            System.out.println("Deserialized Person: " + person1.getName() + ", " + person1.getAge() + ", " + person1.getEmail());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class Person1 {
    private String name;
    private int age;
    private String email;
//    private String special_key;

    // Getters and setters...
    public String getName() { return name;}
    public int getAge() { return age;}
    public String getEmail() { return email;}
}

