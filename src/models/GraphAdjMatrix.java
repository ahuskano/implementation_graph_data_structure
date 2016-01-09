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
public class GraphAdjMatrix extends Graph{

    private int[][] adjMatrix;
    
    @Override
    public List<Integer> getNeighbors(int v) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void implementAddVertex() {
        int v=getNumVertices();
        if(v>=adjMatrix.length){
            int[][] incresedMatrix=new int[v*2][v*2];
            for(int i=0;i<adjMatrix.length;i++)
                for(int j=0;j<adjMatrix.length;j++)
                    incresedMatrix[i][j]=adjMatrix[i][j];
            adjMatrix=incresedMatrix;
        }
        for(int i=0;i<adjMatrix[v].length;i++){
            adjMatrix[v][i]=0;
        }
    }
  
    @Override
    public void implementAddEdge(int v, int w){
        adjMatrix[v][w]=1;
    }
    
    
}
