public class Zadanko {
    public static void main(String[] args) {
        System.out.println("Siema robimy niby proste zadanko");
        System.out.println(" ");

        String[] month = {"Styczeń", "Luty", "Marzec", "Kwiecień", "Maj", "Czerwiec", "Lipiec", "Sierpień", "Wrzesień", "Październik", "Listopad", "Grudzień"};
        int index = 0;
        while (index < month.length) {
            System.out.println(month[index]);
            index++;
        }
        System.out.println(" ");
        int i = 0;
        while (i < month.length) {
            if (month[i].length() >= 4){
                System.out.println(month[i]);
            }
        i++;

        }



    }
}
