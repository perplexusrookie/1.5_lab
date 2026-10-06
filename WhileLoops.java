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
            current = next;
            next = sum;

        }
            System.out.println();
            System.out.println("Stopped at "+ current);
    }

    public void printUsername(){
        String username = "Hi";

        while (username.length() < 6){
            username += "_";
            System.out.println("Trying "+username);
        }

        System.out.println("Accepted "+username);
    }

    
}