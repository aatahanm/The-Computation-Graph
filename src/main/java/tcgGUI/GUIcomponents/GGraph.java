package tcgGUI.GUIcomponents;

import core.CEdge;
import core.CGraph;
import core.CVertex;
import core.Dsf;

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

    public void addVertex( int x, int y, Dsf v)
    {
        graph.addVertex(v);
        vertices.add(new GVertex(x,y,v));
    }

    public void addEdge (Dsf from, Dsf to, CEdge e)
    {
        graph.addEdge(from, to, e);
        edges.add(new GEdge(getGVertex(from), getGVertex(to), e));
    }

    public void addEdge ( GVertex from, GVertex to, CEdge e)
    {
        graph.addEdge ( from.getVertex(), to.getVertex(), e);
        edges.add ( new GEdge(from, to, e));
    }
    public GVertex getGVertex ( Dsf v)
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

    public ArrayList<GVertex> getSelected()
    {
        ArrayList<GVertex> selected = new ArrayList<>();

        for ( GVertex v : vertices)
        {
            if (v.isSelected())
                selected.add(v);
        }
        return selected;
    }
}
