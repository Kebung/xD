public class DoWhile {
    public static void main(String[] args){
        String[] days = {"Poniedziałek", "Wtorek", "środa", "Czwartek", "piątek", "Sobota", "niedziela"};

        int index = 0;
        do {
            System.out.println(days[index]);
            index++;
        } while (index < days.length);
    }
}
