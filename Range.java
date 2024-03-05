
package example.pkg2;


public class Range {
    private int start;
    private int end;
    
    public Range(int start,int end)
    {
        this.start=start;
        this.end=end;
    }
    
    public void setStart(int start){
        this.start=start;
        
    }
    public int getStart(){
        return this.start;
    }
    public void setEnd(int end){
        this.end=end;
    }
    public int getEnd(){
        return this.end;
    }
    public boolean contains(int x){
        
        if (x>=this.start && x<=this.end){
            
            return true;
        }
        else return false;
    }
    
    public Range intersection(Range object2){
        
     Range object3=new Range(0,0);   
     if (this.start > object2.getStart()){
     object3.setStart(this.start);
     
     }else{
         object3.setStart(object2.getStart());
     }
     if (this.end<object2.getEnd()){
     object3.setEnd(this.end);}
     else{
             object3.setEnd(object2.getEnd());}
     
     if (object3.getStart()>object3.getEnd()) return null;
     
             
             else return object3;
    
    
    }
    
    
}
