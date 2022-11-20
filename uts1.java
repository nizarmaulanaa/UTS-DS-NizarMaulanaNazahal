public class Main {
    public static void main(String[] args) {
        int arka[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        System.out.println("bilangan genap");
        for (int i = 0; i< arka.length; i++){
            if (arka[i]%2 == 0){
                System.out.println(arka[i]);
            }
        }
        System.out.println("bilangan ganjil");
        for (int i =0; i<arka.length; i++){
            if (arka[i]%2!= 0){
                System.out.println(arka[i]);
            }
        }
    }
}