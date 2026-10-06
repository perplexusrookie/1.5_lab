public class WhileLoops{
    public static void main(String[] args) {
        
        for (int i = 0; i<10; i++){

        }


        int count = 0; //initial value
        while (count <5){ //boolean condition
            System.out.println(count);
            count++; //iterator
        }
        
        WhileLoops w = new WhileLoops();
        w.demo();

        w.printUsername();

    }

    public void demo(){
        int current = 0;
        int next = 1;

        while(current < 100){
            System.out.println(current+" ");
            int sum = current + next;
            current = nex