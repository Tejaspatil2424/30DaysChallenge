public class challenge2 {
    public static int findduplicate(int arr[]){
          for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.println("Duplicate Number:"+arr[i]);
                }
               
            }
             
        } return 1;
    }
    public static void main(String[] args) {
        challenge2 sc=new challenge2();
        
        //Test case 1
        int [] arr1={1,3,4,2,2};
        sc.findduplicate(arr1);

        //Test case 2
        int [] arr2={3,1,3,4,2};
        sc.findduplicate(arr2);

        //Test case 3
        int [] arr3={1,1};
        sc.findduplicate(arr3);

        //Test case 4
        int [] arr4={1,4,4,2,3};
        sc.findduplicate(arr4);

        //Test case 5
        int n = 99999;
        int[] arr5 = new int[n + 1];
        for(int i = 0; i < n; i++){
            arr5[i] = i + 1;
        }
        arr5[n] = 50000; 
        sc.findduplicate(arr5);
    }
    
}
