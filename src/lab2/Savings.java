package lab2;

public class Savings {
    public static void main(String[] args) {
        int allowance = 1500;
        int day1 = 35;
        int day2 = 90;
        int day3 = 46;
        int day4 = 105;
        int day5 = 40;
        
        int totalExpenses = day1+day2+day3+day4+day5;
        int totalsavings = allowance -  totalExpenses;
        System.out.println("Total Savings: " +totalsavings+" pesos");
    }

}
