public class MadeBySelfForNumberCalculation {
    public String listPrimes(int num) {
        // TODO:
        StringBuilder result = new StringBuilder();
        for(int i = 2; i <= num; i++){
            if(isPrime(i)){
                result.append(i);
                result.append("-");
            }
        }
        result.deleteCharAt(result.lastIndexOf("-"));

        return result.toString();
    }


    public boolean isPrime(int num) {
        if(num == 2) {
            return true;
        }
        if(num % 2 == 0) {
            return false;
        }
        for(int i = 3; i <= Math.sqrt(num); i += 2){
          if(num % i == 0){
              return false;
          }
        }
        return true;
    }
}
