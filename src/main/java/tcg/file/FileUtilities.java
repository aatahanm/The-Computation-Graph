package tcg.file;

import tcg.core.*;
import org.json.JSONException;
import org.json.JSONObject;
import tcg.tcgGUI.GUIcomponents.GEdge;
import tcg.tcgGUI.GUIcomponents.GGraph;
import tcg.tcgGUI.GUIcomponents.GVertex;

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
            CVertex currentV;
            JSONObject currentVertex = (JSONObject) vjson.get((String)(vkeys.next()));
            x = (Integer) currentVertex.get("x");
            y = (Integer) currentVertex.get("y");
            type = (Integer) currentVertex.get("type");

            if (type == STATICS.CONSTANT_VERTEX){
                val = Double.parseDouble(currentVertex.get("val").toString());
                currentV = new ConstantVertex(val);
            }
            else
                currentV = (CVertex) STATICS.typeToVertex(type, 0.0);

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

    public static void writeToFile(JSONObject json, String path) throws JSONException {
        try{
            PrintWriter writer = new PrintWriter(path, "UTF-8");
            writer.println(json.toString());
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
