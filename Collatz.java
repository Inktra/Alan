public class Collatz {
 
    public void col(float num){
        if (num<=0){
            System.out.println("Introduce una entrada valida");
        } else {
            do {
            if (num == 1){
                System.out.print("1");
            }else{
                if (num %2 == 0){
                    System.out.print(num + ", ");
                    num = num/2;
                }else {
                    System.out.print(num + ", ");
                    num = (3 * num) + 1;
                }
            }

            } while (num != 1);
            System.out.println("1.0");
        }
    }
}
