public class For {
    public static void main(String[] args){
        String[] days = {"Poniedziałek", "Wtorek", "środa", "Czwartek", "piątek", "Sobota", "niedziela"};

        for (int index = 0; index < days.length; index++){
            System.out.println(days[index]);
            //for (String day : days) { System.out.println(day); }
        }
    }
}
