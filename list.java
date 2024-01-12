//{ Driver Code Starts
//Initial Template for Java

import java.util.*;

class Main{
    public static void main(String[] args) {
        int edges [][]={{5,7},{0,1},{0,4},{1,2},{1,3},{1,4},{2,3},{3,4}};
        Solution s=new Solution();
        System.out.println(s.printGraph(7,edges));
    }
}

//User function Template for Java
class Solution {
    public List<List<Integer>> printGraph(int V, int edges[][]) {
        int count=0;
        int rows=edges.length;
        int columns=edges[0].length;
        
        List<List<Integer>> list2=new ArrayList<List<Integer>>();
        while(count<V){
        List<Integer> list1=new ArrayList<Integer>();
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                if(count==edges[i][j]){
                    if(j+1<columns){
                    list1.add(edges[i][j+1]);
                    }
                    else if(j-1>=0){
                    list1.add(edges[i][j-1]);
                    }
                }
            }
        }
        count++;
        list2.add(list1);
        }
        return list2;
    }
}