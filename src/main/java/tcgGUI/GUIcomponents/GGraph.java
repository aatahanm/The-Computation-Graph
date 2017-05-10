package tcgGUI.GUIcomponents;

import core.CEdge;
import core.CGraph;
import core.CVertex;

import java.util.ArrayList;
import java.util.Random;

public class GGraph
{
    private ArrayList<GVertex> vertices;
    private ArrayList<GEdge> edges;
    private CGraph graph;

    public GGraph ( CGraph graph)
    {
        vertices = new ArrayList<GVertex>();
        edges = new ArrayList<GEdge>();
        this.graph = graph;
    }

    public void addVertex( int x, int y, CVertex v)
    {
        graph.addVertex(v);
        vertices.add(new GVertex(x,y,v));
    }

    public void addEdge ( CVertex from, CVertex to, CEdge e)
    {
        graph.addEdge(from, to, e);
        edges.add(new GEdge(getGVertex(from), getGVertex(to), e));
    }

    public GVertex getGVertex ( CVertex v)
    {
        for ( GVertex gv : vertices)
        {
            if ( gv.getVertex() == v)
                return gv;
        }
        return null;
    }

    public void calc(){
        graph.calcGraph();
    }

    public ArrayList<GVertex> getVertices() {
        return vertices;
    }

    public ArrayList<GEdge> getEdges() {
        return edges;
    }
}
