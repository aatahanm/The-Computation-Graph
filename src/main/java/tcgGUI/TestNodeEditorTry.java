package tcgGUI;

import core.CEdge;
import core.CGraph;
import core.ConstantVertex;
import file.FileUtilities;
import org.json.JSONException;
import tcgGUI.GUIcomponents.GGraph;

import javax.swing.*;
import java.io.File;
import java.io.IOException;

public class TestNodeEditorTry {
    public static void main( String[] a) throws IOException, JSONException {
        File file = new File("/Users/mertcinar/Downloads/jsonSample.txt");
        GGraph g = FileUtilities.parseToGGraph(file);
        NodeEditorTry n = new NodeEditorTry(g);
        JFrame frame = new JFrame("test");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600,600);
        frame.add(n);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
