public class Main {
    public static void main(String[] args) {
        int balance = 500;
        int refill = 1100;
        int total = balance + refill;
        int bonus;
        if (refill > 1000) { bonus = refill/100;
        } else  { bonus=0;
        }
            System.out.println(total + bonus);
        }
    }




