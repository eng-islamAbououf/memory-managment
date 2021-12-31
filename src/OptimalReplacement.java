import java.util.ArrayList;

public class OptimalReplacement implements Algorithm{
    int size  ;
    int counter ;
    int numOfSwap ;
    ArrayList<Character> queue = new ArrayList<>();
    public OptimalReplacement(int size) {
        this.size = size ;
        counter = 0 ;
        numOfSwap = 0 ;
    }


    public void replace(int index , char x){
        queue.remove(index) ;
        queue.add(index , x) ;
        numOfSwap ++ ;
        print();
    }
    @Override
    public boolean adToQueue(char x) {
        if (queue.isEmpty() || queue.size()<size){
            queue.add(x) ;
            print();
            return true ;
        }
        return false ;
    }

    @Override
    public void print() {
        for (Character i : queue){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
