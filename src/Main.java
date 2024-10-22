public class Main {                                           //ders1.test7
    public static void main(String[] args) {
        int say=0;
        for(int a=1; a<100; a++ ){
            if( (a%3)==0 && (a&5)==0){
                say++;
            }

        }
        System.out.println("1-dən 100-ə qədər 3 və 5-ə bölünən ədədlərin sayı= "+say);
    }
}