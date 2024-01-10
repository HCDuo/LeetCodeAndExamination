package 笔试;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * <pre>
 *
 * </pre>
 *
 * @author <a href="https://github.com/HCDUO">HCDUO</a>
 * @date:2023/9/6 13:47
 */
public class SHINE {
    private int capacity;
    private int rate;
    private int tokens;

    public SHINE(int capacity ,int rate,int tokens){
        this.capacity = capacity;
        this.rate = rate;
        this.tokens = tokens;
    }

    public int countLimit(List<int[]> requests) {
        int limitCount  = 0;
        int LastTime = 0;
        for (int[] request : requests) {
            int time = request[0];
            int count = request[0];
            int timeLimit = time - LastTime;
            int tokensG = Math.min(timeLimit/100,rate);
            tokens+=tokensG;
            if (tokens > capacity) {
                tokens = capacity;
            }
            int tokensS = Math.min(count,tokens);
            tokens -= tokensS;
            if (tokensS<count){
                limitCount += count - tokensS;
            }
            LastTime = time;
        }
        return limitCount;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int totalLines = in.nextInt();
        in.nextLine();
        List<int[]> requests = new ArrayList<>();
        for (int i = 0; i <totalLines; i++) {
            String line = in.nextLine();
            String[] tokens = line.split(" ");
            int time = Integer.parseInt(tokens[0]);
            int count = Integer.parseInt(tokens[1]);
            requests.add( new int[] {time,count});
        }
        SHINE shine = new SHINE(150,10,100);
        int c = shine.countLimit(requests);
        System.out.println(c);
    }
}
