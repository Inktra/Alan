public class Factorial {

        public int fact (int num){
           if (num <0){
                System.out.println("Introduce un valor positivo o 0");
                return 0;
           }else {
                if (num == 1 || num == 0){
                    return 1;
                } else {
                    return num * fact(num-1);
                }
           }
        }    
}
