public class LoopPuzzles {

    // Read REQ 02
    public int stepsToOne(int start) {
        if (start <= 0){
            return -1;
        }
        int value = start;
        int times = 0;
        while (value > 1){
            if (value%2==0 ){
                value /= 2;
                times += 1;
            } else {
                value = 3 * value + 1;
                times += 1;
            }
        }
        return times;
    }

    // Read REQ 03
    public int sumDigits(int n) {
        n = Math.abs(n);
        int sum = 0;

        while (n > 0){
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    // Read REQ 04
    public int reverseDigits(int n) {
        int sign = n < 0 ? -1 : 1;
        n = Math.abs(n);
        int reversed = 0;
        while (n > 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }
        return sign * reversed;
    }

    // Read REQ 05
    public boolean isPowerOfThree(int n) {
        if (n <= 0){
            return false;
        }
        while (n % 3 == 0){
            n /= 3;
        }
        return n == 1;
    }

    // Read REQ 06
    public int firstRunningTotalAbove(int limit) {
        int total = 0;
        int add = 1;
        while (total <= limit){
            total += add;
            add += 1;
        }
        return total;
    }

    public String readUntilSentinel(String csv, String sentinel) {
        String unread = csv;
        String result = "";
        while (!unread.isEmpty()) {
            int comma = unread.indexOf(",");
            String token;
            if (comma == -1) {
                token = unread;
                unread = "";
            } else {
                token = unread.substring(0, comma);
                unread = unread.substring(comma + 1);
            }
            if (token.equals(sentinel)) {
                break;
            }
            if (!result.isEmpty()) {
                result += " ";
            }
            result += token;
        }
        return result;
    }

    public int countDigits(int n) {
    n = Math.abs(n);
    int count = 0;
    do {
        count++;
        n /= 10;
    } while (n > 0);
    return count;
    }

    public int startWithMostSteps(int limit) {
    int bestStart = 1;
    int mostSteps = stepsToOne(1);
    for (int start = 2; start <= limit; start++) {
        int steps = stepsToOne(start);

        if (steps > mostSteps) {
            mostSteps = steps;
            bestStart = start;
        }
    }
    return bestStart;
    }
}