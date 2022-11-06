

import java.util.Scanner;


public class PiComputation {

	public static void main(String[] args) {
	    double precision = 0.0001;
        double pi = 0;
        int count = 0;
        double pre = 3.14;
        while (Math.abs(pre - pi) >= precision) {
            pre = pi;
            count++;
            if (count % 2 == 0) {
                pi -= 4.0 / (2 * count - 1);
            } else {
                pi += 4.0 / (2 * count - 1);
            }

        }
        System.out.println(count);
        System.out.println(pi);
	}

}
