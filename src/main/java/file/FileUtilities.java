package file;

import core.*;
import jdk.nashorn.internal.parser.JSONParser;
import org.json.JSONException;
import org.json.JSONObject;
import tcgGUI.GUIcomponents.GEdge;
import tcgGUI.GUIcomponents.GGraph;
import tcgGUI.GUIcomponents.GVertex;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;

public class FileUtilities {

    public static JSONObject parseFromGraph(GGraph graph) throws JSONException {

        int order = 1;
        JSONObject json = new JSONObject();
        JSONObject vjson = new JSONObject();
        for (GVertex gv : graph.getVertices()){
            vjson.put("v" + order, gv.parseToJson());
            order++;
        }
        order = 1;
        JSONObject ejson = new JSONObject();
        for (GEdge ge : graph.getEdges()){
            JSONObject e = new JSONObject();
            e.put("from", graph.getVertices().indexOf(ge.getFrom()));
            e.put("to", graph.getVertices().indexOf(ge.getTo()));
            e.put("fromOrder", ge.getFromOrder());
            e.put("toOrder", ge.getToOrder());
            ejson.put("e" + order, e);
            order++;
        }
        json.put("vertices", vjson);
        json.put("edges", ejson);
        return json;
    }

    public static GGraph parseToGGraph(File file) throws IOException, JSONException {
        int x,y,type;
        double val;
        ArrayList<CVertex> vertexAl = new ArrayList<CVertex>();
        JSONObject json = parseToJSON(file);
        CGraph cg = new CGraph(CEdge.class);
        GGraph gg = new GGraph(cg);
        JSONObject vjson = (JSONObject) json.get("vertices");
        JSONObject ejson = (JSONObject) json.get("edges");
        Iterator vkeys = vjson.keys();
        Iterator ekeys = ejson.keys();
        while (vkeys.hasNext()){
            CVertex currentV = null;
            JSONObject currentVertex = (JSONObject) vjson.get((String)(vkeys.next()));
            x = (Integer) currentVertex.get("x");
            y = (Integer) currentVertex.get("y");
            type = (Integer) currentVertex.get("type");
            if (type == STATICS.CONSTANT_VERTEX){
                val = (Double) currentVertex.get("val");
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

        while (ekeys.hasNext()){
            int from,to,toOrder,fromOrder;
            JSONObject currentEdge = (JSONObject) ejson.get((String)(ekeys.next()));
            from = (Integer) currentEdge.get("from");
            to = (Integer) currentEdge.get("to");
            toOrder = (Integer) currentEdge.get("toOrder");
            fromOrder = (Integer) currentEdge.get("fromOrder");
            gg.addEdge(vertexAl.get(from), vertexAl.get(to), new CEdge(toOrder, fromOrder));
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

    public static void writeToFile(JSONObject json) throws JSONException {
        try{
            PrintWriter writer = new PrintWriter("jsonSample1.cgf", "UTF-8");
            writer.println(json.toString());
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
