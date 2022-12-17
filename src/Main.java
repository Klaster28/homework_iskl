public class Main {
    public static void main(String[] args) {

        boolean success = Data.validate ("123as", "123qwerty","123qwerty");
            if (success){
            System.out.println("Данные валидны");
        } else {
            System.out.println("Данные не валидны");
        }

        }

}