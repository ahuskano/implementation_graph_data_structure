/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.List;

/**
 *
 * @author ahuskano
 */
public abstract class Graph {
    
    private int numVertices;
    private int numEdges;

    public abstract List<Integer> getNeighbors(int v);
    public abstract void implementAddVertex();
    
    public Graph() {
        this.numVertices=0;
        this.numEdges=0;
    }

    public Graph(int numVertices, int numEdges) {
        this.numVertices = numVertices;
        this.numEdges = numEdges;
    }

    public void addVertex(){
        implementAddVertex();
        numVertices++;
    }
    
    public int getNumVertices() {
        return numVertices;
    }

    public void setNumVertices(int numVertices) {
        this.numVertices = numVertices;
    }

    public int getNumEdges() {
        return numEdges;
    }

    public void setNumEdges(int numEdges) {
        this.numEdges = numEdges;
    }
  
}
