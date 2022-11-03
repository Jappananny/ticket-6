public class Calculation {
    int number;

    public static void calculationNumber(int[] number){
        for(int i = 0; i < number.length; i++){
            if(number[i] % 2 == 1){
                number[i] += 1;
                if(number[i]> 3 && number[i] < 7){
                    System.out.println(number[i] + " Искомое число");
                }
            }
        }
    }
}
