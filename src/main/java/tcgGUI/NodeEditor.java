package tcgGUI;

import com.mxgraph.layout.mxCircleLayout;
import com.mxgraph.swing.mxGraphComponent;
import core.CEdge;
import core.CGraph;
import core.CVertex;
import core.ConstantVertex;
import org.jgrapht.ListenableGraph;
import org.jgrapht.ext.JGraphModelAdapter;
import org.jgrapht.ext.JGraphXAdapter;
import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.graph.DefaultListenableGraph;
import org.jgrapht.graph.ListenableDirectedGraph;
import org.json.JSONException;
import org.json.JSONObject;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Iterator;

public class NodeEditor extends JApplet
{
    private ListenableGraph<CVertex, CEdge> g;
    private JGraphXAdapter<CVertex, CEdge> jgxAdapter;
    public NodeEditor(){}

    /*
      This init method is dedicated for loading inputs from file.
     */
    public void init(JSONObject json) throws JSONException {
        System.out.print(">>>>>eben");
        g = new DefaultListenableGraph(new CGraph(CEdge.class));
        jgxAdapter = new JGraphXAdapter(g);
        getContentPane().add(new mxGraphComponent(jgxAdapter));

        setSize(860,560);
        Iterator<String> keys = json.keys();
        ArrayList<Double> val = new ArrayList<Double>();
        int i = 0;
        while(keys.hasNext()){
            val.add(json.getDouble(keys.next()));
            ConstantVertex c = new ConstantVertex(val.get(i));
            g.addVertex(c);
            i++;
        }
        //g.addEdge(c,c2, new CEdge(0,0));
        mxCircleLayout layout = new mxCircleLayout(jgxAdapter);
        layout.execute(jgxAdapter.getDefaultParent());
    }

    @Override
    public void init(){
        g = new DefaultListenableGraph(new CGraph(CEdge.class));
        jgxAdapter = new JGraphXAdapter(g);
        getContentPane().add(new mxGraphComponent(jgxAdapter));
        setSize(860,560);

        mxCircleLayout layout = new mxCircleLayout(jgxAdapter);
        layout.execute(jgxAdapter.getDefaultParent());
    }

    @Override
    public void paintComponents(Graphics k){
        super.paintComponents(k);
        System.out.println(g.edgeSet());
    }

    public void calc()
    {

    }
}
