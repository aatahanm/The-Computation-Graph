package tcgGUI.GUIcomponents;

import core.CEdge;
import core.CGraph;
import core.CVertex;

import java.util.ArrayList;
import java.util.Random;

/**
 * {GGraph}
 * Author: Yaman Yağız Taşbağ
 * Version: {8.05.2017}
 */
public class GGraph
{
    private ArrayList<GVertex> vertices;
    private ArrayList<GEdge> edges;
    private CGraph graph;
    public GGraph ( CGraph graph)
    {
        vertices = new ArrayList<GVertex>();
        edges = new ArrayList<GEdge>();
        Random random = new Random();
        this.graph = graph;
        for (CVertex v : graph.vertexSet())
        {
            vertices.add ( new GVertex(random.nextInt(200),random.nextInt(200), v));
        }
        for (CEdge e : graph.edgeSet())
        {
            edges.add(new GEdge( getGVertex(e.getSource()), getGVertex(e.getTarget()), e) );
        }
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

    public ArrayList<GVertex> getVertices() {
        return vertices;
    }

    public ArrayList<GEdge> getEdges() {
        return edges;
    }
}
