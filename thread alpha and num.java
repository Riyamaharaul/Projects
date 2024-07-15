class PrintNumbers extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
            try {
                Thread.sleep(500); // Sleep for 500 milliseconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class PrintAlphabets extends Thread {
    public void run() {
        for (char c = 'a'; c <= 'e'; c++) {
            System.out.print(c + " ");
            try {
                Thread.sleep(500); // Sleep for 500 milliseconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        PrintNumbers numbersThread = new PrintNumbers();
        PrintAlphabets alphabetsThread = new PrintAlphabets();

        numbersThread.start();
        alphabetsThread.start();
    }
}
