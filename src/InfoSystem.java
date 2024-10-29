public class InfoSystem {
    void infoOn(int menuItem){
        switch (menuItem){
            case '1':
                System.out.println("Operator If: \n");
                System.out.println("if(condition) operator;");
                System.out.println("else operator;");
                break;
            case '2':
                System.out.println("Operator Switch: \n");
                System.out.println("switch(statement) {");
                System.out.println("  case constanta:");
                System.out.println("       sequences of operators");
                System.out.println("        break;");
                System.out.println("  // ...");
                System.out.println("}");
                break;
            case '3':
                System.out.println("Cycle For:\n");
                System.out.println("for(initialization; condition; iteration)");
                System.out.println("operator;");
                break;
            case '4':
                System.out.println("Cycle While:\n");
                System.out.println("while(condition) operator;");
                break;
            case '5':
                System.out.println("Cycle Do-While:\n");
                System.out.println("do {");
                System.out.println("    operator;");
                System.out.println("} while (condition);");
                break;
            case '6':
                System.out.println("Operator Break:\n");
                System.out.println("break; or break label;");
                break;
            case '7':
                System.out.println("Operator Continue:\n");
                System.out.println("continue; or continue label;");
                break;
        }
        System.out.println();
    }

    void showMenu(){
        System.out.println("Information about: ");
        System.out.println("1. If");
        System.out.println("2. Switch");
        System.out.println("3. For");
        System.out.println("4. While");
        System.out.println("5. Do-While");
        System.out.println("6. Break");
        System.out.println("7. Continue");
        System.out.println("Select the required menu item (to exit press q): ");
    }
    boolean isValid (int userChoice){
        if (userChoice < '1' | userChoice > '7' & userChoice != 'q') return false;
        else return true;
    }
}
