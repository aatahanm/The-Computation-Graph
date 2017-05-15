package tcg.tcgGUI.GUIcomponents;

import tcg.core.CEdge;
import tcg.core.CGraph;
import tcg.core.Dsf;

import java.util.ArrayList;

public class GGraph
{

    private boolean selected;
    private ArrayList<GVertex> vertices;
    private ArrayList<GEdge> edges;
    private CGraph graph;

    public GGraph ( CGraph graph)
    {
        selected = false;
        vertices = new ArrayList<GVertex>();
        edges = new ArrayList<GEdge>();
        this.graph = graph;
    }

    public CGraph getGraph()
    {
        return graph;
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

    public void removeSelected(){
        ArrayList<GVertex> vToRemove = new ArrayList<>();
        ArrayList<GEdge> eToRemove = new ArrayList<>();
        for (GVertex gv : vertices)
            if (gv.isSelected())
                vToRemove.add(gv);


        for (GEdge ge : edges)
            if (ge.isSelected())
                eToRemove.add(ge);

        for ( GVertex gv : vToRemove)
            for (GEdge ge : edges)
                if ( ge.getFrom() == gv || ge.getTo() == gv)
                    eToRemove.add(ge);

        for (GVertex gv : vToRemove)
            vertices.remove(gv);

        for (GEdge ge : eToRemove)
            edges.remove(ge);

        graph.removeSelected();
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
