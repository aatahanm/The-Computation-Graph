package file;

import core.*;
import jdk.nashorn.internal.parser.JSONParser;
import org.json.JSONException;
import org.json.JSONObject;
import tcgGUI.GUIcomponents.GGraph;
import tcgGUI.GUIcomponents.GVertex;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;

public class FileUtilities {

    public static GGraph parseToGGraph(File file) throws IOException, JSONException {
        int x,y,type;
        double val;
        ArrayList<CVertex> vertexAl = new ArrayList<CVertex>();
        JSONObject json = parseToJSON(file);
        CGraph cg = new CGraph(CEdge.class);
        GGraph gg = new GGraph(cg);
        JSONObject vjson = (JSONObject) json.get("vertices");
        Iterator vkeys = vjson.keys();
        while (vkeys.hasNext()){
            CVertex currentV = null;
            JSONObject currentvertex = (JSONObject) vjson.get((String)(vkeys.next()));
            x = (Integer) currentvertex.get("x");
            y = (Integer) currentvertex.get("y");
            type = (Integer) currentvertex.get("type");
            if (type == STATICS.CONSTANT_VERTEX){
                val = (Double) currentvertex.get("val");
                currentV = new ConstantVertex(val);
            }
            else if (type == STATICS.INPUT_VERTEX)
                currentV = new InputVertex();
            else if (type == STATICS.ADDITION_VERTEX)
                currentV = new AdditionVertex();
            else if (type == STATICS.MULTIPLICATION_VERTEX)
                currentV = new MultiplicationVertex();
            else if (type == STATICS.OUTPUT_VERTEX)
                currentV = new OutputVertex();
            else if (type == STATICS.SIGMOID_VERTEX)
                currentV = new SigmoidVertex();

            vertexAl.add(currentV);
            gg.addVertex(x,y,currentV);
        }

        return gg;
    }

    public static JSONObject parseToJSON(File file) throws JSONException, IOException {
        return new JSONObject(readFromFile(file));
    }

    public static String readFromFile(File file) throws IOException {
        FileInputStream fis = new FileInputStream(file);
        byte[] data = new byte[(int) file.length()];
        fis.read(data);
        fis.close();
        String str = new String(data, "UTF-8");

        return str;
    }
}
