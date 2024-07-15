public class InterleavedThread {

    public static void main(String[] args) {
        Thread thread1 = new Thread(new NumberPrinter(1, 5));
        Thread thread2 = new Thread(new AlphabetPrinter('A', 'E'));

        thread1.start();
        thread2.start();
    }
}

class NumberPrinter implements Runnable {

    private int startNumber;
    private int endNumber;

    public NumberPrinter(int startNumber, int endNumber) {
        this.startNumber = startNumber;
        this.endNumber = endNumber;
    }

    @Override
    public void run() {
        for (int i = startNumber; i <= endNumber; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print(i);
        }
    }
}

class AlphabetPrinter implements Runnable {

    private char startLetter;
    private char endLetter;

    public AlphabetPrinter(char startLetter, char endLetter) {
        this.startLetter = startLetter;
        this.endLetter = endLetter;
    }

    @Override
    public void run() {
        for (char letter = startLetter; letter <= endLetter; letter++) {
            System.out.println(letter);
        }
    }
}
