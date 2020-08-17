package com.in28mintues.loops;

public class MyNumber {
    private final int i;
    public MyNumber(int i) {
        this.i = i;
    }

    public boolean isPrime() {
        if (i < 2){
            return false;
        }
        for (int m = 2; m <= i - 1; m++){
            if (i % m == 0){
                return false;
            }
        }
        return true;
    }

    public int sumUpToN() {
        int summary = 0;
      for(int m = 1; m<=i; m++){
          summary += m;
      }
      return summary;
    }

    public int sumOfDivisors() {
        int sumofdivisors = 0;
        for(int m = 2; m <= i - 1; m++){
            if(i % m == 0){
                sumofdivisors += m;
            }
        }
        return sumofdivisors;
    }

    public void printANumberTriangle() {
        String result = "";
        for(int m = 0; m <= i; m++){
            result +=  m + " ";
            System.out.println(result);
        }
    }
}
