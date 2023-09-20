package Practiceset;

class AlphabetThread extends Thread {
    public void run() {
        for (char c = 'A'; c <= 'Z'; c++) {
            System.out.print(c + " ");
            try {
                Thread.sleep(550); // Sleep for 100 milliseconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class NumberThread extends Thread {
    public void run() {
        for (int i = 1; i <= 26; i++) {
            System.out.print(i + " ");
            try {
                Thread.sleep(550); // Sleep for 100 milliseconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Assignment_no_12_ques1 {
    public static void main(String[] args) {
    	AlphabetThread alphabetThread = new AlphabetThread();
        NumberThread numberThread = new NumberThread();

        alphabetThread.start();
        numberThread.start();
    }
}
