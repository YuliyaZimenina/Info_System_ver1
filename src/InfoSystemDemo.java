public class InfoSystemDemo {
    public static void main(String[] args) throws java.io.IOException {
        char userInput, ignore;
        InfoSystem infoSystem1 = new InfoSystem();
        for (; ; ) {
            do {
                infoSystem1.showMenu();
                userInput = (char) System.in.read();
                do {
                    ignore = (char) System.in.read();
                }while (ignore != '\n');
            }while (!infoSystem1.isValid(userInput));
            if (userInput == 'q') break;
            System.out.println("\n");
            infoSystem1.infoOn(userInput);
        }
    }
}