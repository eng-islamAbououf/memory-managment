import java.util.ArrayList;

public class FIFO implements Algorithm{
    int size  ;
    int counter ;
    int numOfSwap ;
    ArrayList<Character> queue = new ArrayList<>();

    public FIFO(int size) {
        this.size = size ;
        counter = 0 ;
        numOfSwap = 0 ;
    }

    @Override
    public boolean adToQueue(char x) {
        if (queue.isEmpty() || queue.size()<size){
            queue.add(x) ;
            return true ;
        }
        else if(!queue.contains(x)){
            queue.set(counter,x) ;
            counter++ ;
            numOfSwap ++ ;
            if (counter==size)
                counter = 0 ;
            return true ;
        }
        return false ;
    }

    @Override
    public void print(){
        for (Character i : queue){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
