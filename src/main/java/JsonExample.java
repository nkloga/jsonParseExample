import com.google.gson.Gson;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * simple example of creating and reading json files
 */
public class JsonExample {
    public static void main(String[] args) throws IOException {

        // Reading from json file
        FileReader fr = new FileReader("src/main/java/post.json");
        StringBuilder sb = new StringBuilder();
        while (fr.ready())
        {
            sb.append((char)fr.read());
        }
        fr.close();
        String fileRead = sb.toString();

        Gson json = new Gson();
        Person person1 = json.fromJson(fileRead, Person.class);
        System.out.println(person1);

        // Creating a json file out of class
        Person person = new Person();
        person.setAuthor("NK");
        person.setBody("some text");
        person.setLikes(122);
        person.setPublished(true);
        person.setTitle("Homo Deus");

        String jsonWrite = json.toJson(person);
        System.out.println(jsonWrite);

        FileWriter fw = new FileWriter("src/main/java/postWrite.json");
        fw.write(jsonWrite);
        fw.close();
    }
}
