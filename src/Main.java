import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> numbersList = new ArrayList<>(Arrays.stream(scanner.nextLine().split(" ")).toList());
        List<String> urlList = new ArrayList<>(Arrays.stream(scanner.nextLine().split(" ")).toList());

        Smartphone smartphone = new Smartphone(numbersList, urlList);
        for (String number: smartphone.getNumbers()){
            String result="";
            for (char symbol: number.toCharArray()){
                if (Character.isLetter(symbol)){
                    result="Invalid number!";
                    break;
                }else result= smartphone.call(number);
            }
            System.out.println( result);
        }
        for (String url: smartphone.getUrls()){
            String result="";
            for (char symbol: url.toCharArray()){
                if (Character.isDigit(symbol)){
                    result="Invalid URL!";
                    break;
                }else result= smartphone.browse(url);
            }
            System.out.println( result);
        }


    }


}
