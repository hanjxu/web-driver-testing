/*JSON deserialization refers to the process of converting a JSON (JavaScript Object Notation) string into an object
in a programming language. In essence, it's the reverse operation of serialization, which is converting an object
into a JSON string.
Deserialization is commonly used when data is received in JSON format, such as from an API response or a file, and
needs to be converted into usable objects within a programming language. This process involves interpreting the
structure and values within the JSON string and mapping them back into the appropriate data types and structures
in the programming language.*/

package support;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonStringDeserializer {
    public static void main(String[] args) {
        String jsonString = "{\"name\": \"John\", \"age\": 30, \"title\":\"Automation Engineer@1\"}";

        ObjectMapper objectMapper = new ObjectMapper();
        try {
            // Deserialize JSON to an object
            Person person = objectMapper.readValue(jsonString, Person.class);
            System.out.println("Deserialized Person: " + person.getName() + ", " + person.getAge() + ", " + person.getTitle());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class Person {
    private String name;
    private int age;
    private String title;

    // Getters and setters
    public String getName() {return name;}
    public int getAge() {return age;}
    public String getTitle() {return title;}
}

