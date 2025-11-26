class Power {

    public static int power(int base, int exp) {
      int result = 1;
        if(exp == 0){
          return result;
        }
        for(int i = 1; i<=exp; i++){
          result = result * base;
        }
        return result;
    }
    
    public static int recursivePower(int base, int exp) {
        if(exp == 0){
          return 1;
        }
        return base * recursivePower(base, exp-1);
    }

    public static void main(String[] args) {
        System.out.println(power(2, 5));
        System.out.println(recursivePower(2, 5));
    }
}