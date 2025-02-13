package wustemberg.gustavo.models;

import java.util.Scanner;

public class Inputs {
    public String Input() {
        Scanner inputText = new Scanner(System.in);
        return inputText.nextLine();
    }

    public int IntInput() {
        Scanner inputValue = new Scanner(System.in);
        return inputValue.nextInt();
    }

    public double DoubleInput() {
        Scanner inputValue = new Scanner(System.in);
        return inputValue.nextDouble();
    }

}
