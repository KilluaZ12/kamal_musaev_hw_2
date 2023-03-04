import java.util.Random;

public class Main {
    public static void main(String[] args) {

        String answer = getAnswer(generateRandomAge(), 29);
        System.out.println(answer);
        String answer2 = getAnswer(generateRandomAge(), 25);
        System.out.println(answer2);
        String answer3 = getAnswer(generateRandomAge(), 32);
        System.out.println(answer3);
        String answer4 = getAnswer(generateRandomAge(), 28);
        System.out.println(answer4);
        String answer5 = getAnswer(generateRandomAge(), 15);
        System.out.println(answer5);

    }

    public static String getAnswer(int age, int temperature){
        String answer;
        if(age >= 20 && age <= 45 && temperature >= -20 && temperature < 30){
            answer = "Можно идти гулять";
        }else if (age < 20 && temperature > 0 && temperature < 28){
            answer = "Можно идти гулять";
        }else if (age > 45 && temperature > -10 && temperature < 25){
            answer = "Можно идти гулять";
        }else {
            answer = "Оставайтесь дома";
        }
        return answer;
    }

    public static int generateRandomAge(){
        Random newRandom = new Random();
        return newRandom.nextInt(0 , 100);
    }

}