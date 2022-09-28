public class ChatBotRunner {
    public static void main(String[] args) {
        ChatBot debbie = new ChatBot("Debbie", 7);
        debbie.greeting("Steven");
        debbie.weather();
        System.out.println("Did you know that 40 feet in meters is: " + debbie.convertFeetToMeters(40));
        debbie.favoriteNumber(5);
        System.out.println("1321 + 6 + 945 is: " + debbie.addNumbers(1321, 6, 945) + "!");
        System.out.println("Did you know that 75.3 squared is: " + debbie.square(75.3));
        debbie.botCrisis();
        System.out.println(debbie.goodbye());
    }
}