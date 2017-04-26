import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    public static String message = "";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfDigits = scanner.nextInt();
        int seq[] = new int[numOfDigits];

        for(int i=0;i<numOfDigits;i++) {
            seq[i] = scanner.nextInt();
        }

        int[] seq2 = Arrays.copyOf(seq, seq.length);

        if (isSorted(seq)) {
            System.out.println("yes");
        } else if (trySwap(seq) || tryReverse(seq2)) {
            System.out.println("yes");
            System.out.println(message);
        } else  {
            System.out.println("no");
        }
    }

    public static boolean tryReverse(int[] seq) {
        Integer inversionStart = null, inversionEnd = null;

        for (int i=0;i<seq.length-1;i++) {
            if (seq[i] > seq[i + 1]) {
                if (inversionStart == null) {
                    inversionStart = i;
                }
            }
            if (inversionStart != null && seq[i] < seq[i + 1]) {
                inversionEnd = i + 1;
                break;
            }
        }



        Arrays.sort(seq, inversionStart, inversionEnd);
        boolean result = isSorted(seq);
        if(result) {
            message = "reverse " + (inversionStart + 1) + " " + inversionEnd;
        }
        return result;
    }

    public static boolean isSorted(int[] seq) {
        for (int i = 0; i < seq.length - 1; i++) {
            if (seq[i] > seq[i+1]) {
                return false;
            }
        }

        return true;
    }

    public static boolean trySwap(int seq[]) {
        Integer inversionOneIndex = null, inversionTwoIndex = null;

        for (int i=0;i<seq.length-1;i++) {
            if (seq[i] > seq[i+1]) {
                if (inversionOneIndex == null) {
                    inversionOneIndex = i;
                } else if (inversionTwoIndex == null) {
                    inversionTwoIndex = i + 1;
                } else return false;
            }
        }

        if (inversionTwoIndex != null) {
            int swap = seq[inversionOneIndex];
            seq[inversionOneIndex] = seq[inversionTwoIndex];
            seq[inversionTwoIndex] = swap;
        } else if (inversionTwoIndex == null && inversionOneIndex != null) {
            int swap = seq[inversionOneIndex + 1];
            seq[inversionOneIndex + 1] = seq[inversionOneIndex];
            seq[inversionOneIndex] = swap;
        }

        boolean result = isSorted(seq);

        if (result) {
            if (inversionTwoIndex != null)
                message = "swap " + (inversionOneIndex + 1) + " " + (inversionTwoIndex + 1);
            else
                message = "swap " + (inversionOneIndex + 1) + " " + (inversionOneIndex + 2);
        }

        return result;

    }
}