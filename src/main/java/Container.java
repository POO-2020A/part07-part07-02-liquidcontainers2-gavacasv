
public class Container {
    private int contain;

    public Container() {
        this.contain=0;
    }
    
    public int contains(){
        return this.contain;
    }
    public void add(int amount){
        if(amount>0){
            if (this.contain + amount > 100) {
                this.contain = 100;
            } else
                this.contain += amount;
        }
           
        
               
    }
    public void remove(int amount){
        if(amount>0 ){
            if (this.contain - amount < 0) {
                amount = this.contain;
            }
            this.contain -= amount;
        }
        
    }
    @Override
    public String toString(){
        return this.contains()+"/100";
    }
}
