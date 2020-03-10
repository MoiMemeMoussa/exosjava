package sn.asmatech.exercices;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

@SpringBootApplication
public class ExercicesApplication {


    public static void lireFichier() throws FileNotFoundException {
        File file = ResourceUtils.getFile("classpath:message.json");
        JSONParser jsonParser = new JSONParser();
        try {

            Object obj = jsonParser.parse(new FileReader(file.getAbsolutePath()));
            JSONObject jsonObject = (JSONObject) obj;
            System.out.println(jsonObject);

            JSONObject  mainObject = (JSONObject) jsonObject.get("glossary");

			System.out.println("====================================");

			JSONObject  glossDivObject = (JSONObject) mainObject.get("GlossDiv");

			System.out.println(glossDivObject);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }


    }


    public static void main(String[] args) {

        SpringApplication.run(ExercicesApplication.class, args);

        try {
            lireFichier();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

}
