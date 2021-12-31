public class Main {
    public static void main(String[] args) {

        String y= "70120304230321201701" ;
        int size = 3 ;

//        FIFO algorithm = new FIFO(size) ;
//        for (int i = 0 ; i<y.length() ; i++ ){
//            System.out.print(y.charAt(i) + " -> ");
//            if (algorithm.adToQueue(y.charAt(i)))
//                algorithm.print();
//            else
//                System.out.println();
//        }
//        System.out.println("Number Of Swapping = " + algorithm.numOfSwap);
//        System.out.println("Number Of Pages = " + (algorithm.numOfSwap+size));

/*
        LRU lru = new LRU(size) ;
        for (int i = 0 ; i<y.length() ; i++ ){
            System.out.print(y.charAt(i) + " -> ");
            if (lru.adToQueue(y.charAt(i)))
                lru.print();
            else
                System.out.println();
        }
        System.out.println("Number Of Swapping = " + lru.numOfSwap);
        System.out.println("Number Of Pages = " + (lru.numOfSwap+size));


 */

/*
        OptimalReplacement optimalReplacement = new OptimalReplacement(size) ;
        int index = 0 , op , l ;

        for (int i = 0 ; i<y.length() ; i++ ){
            System.out.print(y.charAt(i) + " -> ");
            if (!optimalReplacement.adToQueue(y.charAt(i))){
                if (!optimalReplacement.queue.contains(y.charAt(i))){
                    l = 0;
                    index =0 ;
                    for (int j = 0 ; j< size; j++){
                        char x = optimalReplacement.queue.get(j) ;
                        op = y.length()-1 ;
                        for (int i1 = i+1 ; i1<y.length() ; i1++){
                            if (y.charAt(i1)==x){
                                op = i1 ;
                                break;
                            }
                        }
                        if (op>l){
                            index = j ;
                            l = op ;
                        }
                    }
                    optimalReplacement.replace(index,y.charAt(i));
                }
                else
                    System.out.println();
            }
        }
        System.out.println();
        System.out.println("Number Of Swapping = " + optimalReplacement.numOfSwap);
        System.out.println("Number Of Pages = " + (optimalReplacement.numOfSwap+size));
    */
    }
}
