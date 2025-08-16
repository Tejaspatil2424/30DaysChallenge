public class Challenge1 {

    public static void main(String[] args) {
        
        int [] arr={1,2,4,5,6,7,8,9};

        int sum1=0;

        for(int i=0;i<arr.length;i++){
            sum1+=arr[i];
        }
        System.out.println("Addition is"+sum1);

        int sum2=0;
        for(int i=0;i<=(arr.length+1);i++){
            sum2+=i;
        }
        System.out.println("Addition is"+sum2);

        System.out.println("Missing value is:"+ (sum2-sum1));
    }
}