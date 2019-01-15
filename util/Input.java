package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner = new Scanner(System.in).useDelimiter("\n");

    public String getString(){
        return scanner.next();
    }

    public String getString(String prompt){
        System.out.print(prompt);
        return scanner.next();
    }
    public boolean yesNo(){
        String input = getString();
        return input.equalsIgnoreCase("y")
                || input.equalsIgnoreCase("yes")
                || input.equalsIgnoreCase("yeah")
                || input.equalsIgnoreCase("yesh")
                || input.equalsIgnoreCase("yea")
                || input.equalsIgnoreCase("yep")
                || input.equalsIgnoreCase("yup");
    }
    public boolean yesNo(String prompt){
        System.out.print(prompt);
        return yesNo();
    }

    public int getInt(){
        return scanner.nextInt();
    }
    public int getInt(int min, int max){
        int num = getInt();
        if (num >= min && num <= max){
            return num;
        }
        System.out.format("Enter a number between %s and %s: ", min, max);
        return getInt(min, max);
    }
    public int getInt(int min, int max,  String prompt){
        System.out.print(prompt);
        return getInt(min, max);
    }

    public double getDouble(){
        return scanner.nextDouble();
    }

    public double getDouble(String prompt){
        System.out.print(prompt);
        return scanner.nextDouble();
    }
    public double getDouble(double min, double max){
        double num = getDouble();
        if (num >= min && num <= max){
            return num;
        }
        System.out.format("Enter a number between %s and %s: ", min, max);
        return getDouble(min, max);
    }
    public double getDouble(double min, double max,  String prompt){
        System.out.print(prompt);
        return getDouble(min, max);
    }

}
