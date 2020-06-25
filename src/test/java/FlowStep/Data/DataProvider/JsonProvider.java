package FlowStep.Data.DataProvider;

import FlowStep.Data.Entities.JsonEntities;
import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JsonProvider {
    private static List<JsonEntities> getJsonData() {
        Gson gson = new Gson();
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader("src\\test\\resources\\Data\\apiData.json"));
            JsonEntities[] jsonEntities = gson.fromJson(bufferedReader, JsonEntities[].class);
            return Arrays.asList(jsonEntities);
        } catch (FileNotFoundException ex) {
            throw new RuntimeException("Json file not found at path : ");
        } finally {
            try {
                if (bufferedReader != null)
                    bufferedReader.close();
            } catch (IOException io) {}
        }
    }


}
