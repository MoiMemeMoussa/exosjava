package sn.asmatech.exercices.json;

import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

public class JsonDecode {

    private String messagejson;

    public JsonDecode(String messagejson) {
        this.messagejson = messagejson;
    }

    public Object getMessageProperty( String key){
        JSONObject jsonObject = (JSONObject) JSONValue.parse(this.messagejson);
        return jsonObject.get(key);

    }
}
