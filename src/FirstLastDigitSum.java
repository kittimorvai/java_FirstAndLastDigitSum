public class FirstLastDigitSum {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(465));
    }

    public static int sumFirstAndLastDigit (int number){
        int getLastDigit = number % 10;
        int getFirstDigit = number;
        int sum = 0;

        while(getFirstDigit != 0){
            if(getFirstDigit < 0){
                return -1;
            }
            if (getFirstDigit < 10) {
                sum = getLastDigit + getFirstDigit;
                break;
            }
                getFirstDigit = getFirstDigit / 10;

        }
        return sum;
    }

}
