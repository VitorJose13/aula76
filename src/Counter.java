public class Counter {
    
    public static void main(String[] args) {
        
        int counter = 0;

        // Incrementando o contador
        do {
            System.out.println(counter);
            counter ++; ////5
        } while (counter < 5);

        // Decrementando o contador 
        do {
            counter --;
            System.out.println(counter);
        }while (counter > 0);
    }
}
