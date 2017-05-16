package tcg.tcgGUI.GUIcomponents;

import tcg.core.CEdge;
import tcg.core.CGraph;
import tcg.core.Dsf;

import java.util.ArrayList;

/**
 * This class include the user operations on graph.
 */

public class GGraph
{

    //Properties
    private boolean selected;
    private ArrayList<GVertex> vertices;
    private ArrayList<GEdge> edges;
    private CGraph graph;

    //Constructor
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

    /**
     * Add vertices
     * @param x x coordinate
     * @param y y coordinate
     * @param v
     */
    public void addVertex( int x, int y, Dsf v)
    {
        graph.addVertex(v);
        vertices.add(new GVertex(x,y,v));
    }

    /**
     * Add edges
     * @param from first point
     * @param to destination
     * @param e last point
     */
    public void addEdge (Dsf from, Dsf to, CEdge e)
    {
        graph.addEdge(from, to, e);
        edges.add(new GEdge(getGVertex(from), getGVertex(to), e));
    }

    /**
     * Add edges
     * @param from first point
     * @param to destination
     * @param e last point
     */
    public void addEdge ( GVertex from, GVertex to, CEdge e)
    {
        graph.addEdge ( from.getVertex(), to.getVertex(), e);
        edges.add ( new GEdge(from, to, e));
    }

    /**
     * Remove selected vertices and edges from the graph.
     */
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


    /**
     * Get vertex.
     * @param v
     * @return
     */
    public GVertex getGVertex ( Dsf v)
    {
        for ( GVertex gv : vertices)
        {
            if ( gv.getVertex() == v)
                return gv;
        }
        return null;
    }

    /**
     * Do calculations on graph
     */
    public void calc(){
        graph.calcGraph();
    }

    /**
     * Get vertices.
     * @return vertices
     */
    public ArrayList<GVertex> getVertices() {
        return vertices;
    }

    /**
     * Get edges.
     * @return edge
     */
    public ArrayList<GEdge> getEdges() {
        return edges;
    }

    /**
     * Get selected vertices
     * @return selected vertices
     */
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

    public ArrayList<Dsf> getInNodes(){
        return graph.getInNodes();
    }
}
