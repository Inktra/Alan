public class Finonnacci {

    public void fibo (float num){ 
        if (num <= 0){
            System.out.println("Ingresa una entrada razonable");
        }else{ 
            if (num % 2 == 0){
            int x = 1, y = 0;
            System.out.println("La serie de fibonnacci de " + num + " terminos queda como:");
            for (int i = 0; i < (num/2)-1; i++){
                System.out.print(y + ", " + x + ", ");
                y += x;
                x += y;
            }
            System.out.print(y + ", " + x + "\n");
            }else{
            int x = 1, y = 0;
            System.out.println("La serie de fibonnacci de " + num + " terminos queda como:");
            for (int j = 0; j< ((num-1)/2); j++){
            System.out.print(y + ", " + x + ", ");
            y += x;
            x += y;
            }
            System.out.print(y);
            System.out.println("");
            }   
        }
    }
}