package file;

import jdk.nashorn.internal.parser.JSONParser;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.*;

public class Read {

    private File file;

    public Read(File file){
        this.file = file;
    }

    public JSONObject parseToJSON() throws JSONException, IOException {
        return new JSONObject(readFromFile());
    }

    public String readFromFile() throws IOException {
        FileInputStream fis = new FileInputStream(file);
        byte[] data = new byte[(int) file.length()];
        fis.read(data);
        fis.close();
        String str = new String(data, "UTF-8");

        return str;
    }
}
