import java.io.*;
import java.util.*;


class Edge{
public int w;
public int v1;
public int v2;
public Edge(int v1,int v2,int w){
    this.w=w;
    this.v1=v1;
    this.v2=v2;
};    
};

public class Solution {
    
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in); 
       int v = s.nextInt();
       int en = s.nextInt();
       HashMap<Integer,ArrayList<Edge>> h = new HashMap<>();        
       for(int i = 0; i<en;i++){            
         Edge e = new Edge(s.nextInt(),s.nextInt(),s.nextInt());
         if(!h.containsKey(e.v1)){
           h.put(e.v1,new ArrayList<Edge>());
         }  
         if(!h.containsKey(e.v2)){
           h.put(e.v2,new ArrayList<Edge>());
         }    
         
         h.get(e.v1).add(e);  
         h.get(e.v2).add(e);
       }
       int start=s.nextInt();
       
       ArrayList<Edge> el = new ArrayList<>();
       ArrayList<Integer> vl = new ArrayList<>();
       vl.add(start);
        
       while(vl.size()!=v){
           Edge min=new Edge(-1,-1,Integer.MAX_VALUE);
           for(Integer i : vl){
               for(Edge e : h.get(i)){
                   if(e.w<min.w && !el.contains(e) && (!vl.contains(e.v1) || !vl.contains(e.v2))){
                     min=e;
                   }
               }
           }
           if(min.v1==-1)continue;
           el.add(min);
           if(!vl.contains(min.v1)) vl.add(min.v1);
           else vl.add(min.v2);
       }
        
       int total=0;
        
       for (Edge e : el){
           total+=e.w;
       }
       
        System.out.println(total);
    }
}