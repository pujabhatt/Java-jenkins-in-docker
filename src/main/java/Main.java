public class Main {
    public static void main(String[] args) {
        System.out.println(checkIfInputIsAnEvenNumber(122)); // Testing in the main method
        System.out.println("Need line added to check trigger in jenkins");
    }

    public static boolean checkIfInputIsAnEvenNumber(int number){
        return number % 2 == 0;
    }
}
