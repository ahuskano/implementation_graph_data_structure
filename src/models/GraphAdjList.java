/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author ahuskano
 */
public class GraphAdjList extends Graph{

    private Map<Integer, ArrayList<Integer>> adjListsMap;
    
    @Override
    public List<Integer> getNeighbors(int v) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void implementAddVertex() {
        int v=getNumVertices();
        ArrayList<Integer> neighbours=new ArrayList();
        adjListsMap.put(v, neighbours);
    }

    @Override
    public void implementAddEdge(int v, int w) {
        adjListsMap.get(v).add(w);
    }
    
    
    
}
