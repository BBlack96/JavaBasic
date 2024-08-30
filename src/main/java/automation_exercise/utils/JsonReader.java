package automation_exercise.utils;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class JsonReader {
    private JsonNode jsonNode;

    public JsonReader(String filePath) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            jsonNode = objectMapper.readTree(new File(filePath));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public JsonNode getRequestBody(String key) {
        return jsonNode.get(key);
    }
}
