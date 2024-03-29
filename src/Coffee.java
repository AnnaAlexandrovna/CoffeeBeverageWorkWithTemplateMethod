import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Coffee extends CaffeineBeverage {

    public void brew() {
        System.out.println("Dripping Coffee thought filter");
    }

    public void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }

    public boolean customerWantsCondiments(){
        String answer = getUserInput();

        if (answer.toLowerCase().startsWith("y")){
            return true;
        } else {
            return false;
        }
    }

    private String getUserInput(){
        String answer = null;
        System.out.println("Would you like milk and sugar with your coffee (y/n)?");

        BufferedReader input = new  BufferedReader(new InputStreamReader(System.in));
        try {
            answer = input.readLine();
        }catch (IOException ioexception){
            System.err.println("IO error trying to read answer");
        }
        if (answer == null){
            return "no";
        }
        return answer;
    }
}
