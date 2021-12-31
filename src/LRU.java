import java.util.ArrayList;

public class LRU implements Algorithm{
    int size  ;
    int numOfSwap ;
    int counter ;
    ArrayList<Character> queue = new ArrayList<>();
    ArrayList<Character> pages = new ArrayList<>() ;

    public LRU(int size) {
        this.size = size ;
        numOfSwap = 0 ;
        counter = 0 ;
    }

    @Override
    public boolean adToQueue(char x) {

        if (queue.isEmpty() || queue.size()<size){
            queue.add(x) ;
            pages.add(x) ;
            return true ;
        }
        else if(!queue.contains(x)){


            pages.add(x) ;
            pages.remove(pages.indexOf(queue.get(counter))) ;

            queue.remove(counter) ;
            queue.add(counter , x) ;

            numOfSwap++ ;
            counter = queue.indexOf(pages.get(0)) ;
            if (counter==size)
                counter = 0 ;
            return true ;
        }
        pages.remove(pages.indexOf(x)) ;
        pages.add(x) ;
        counter = queue.indexOf(pages.get(0)) ;
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
