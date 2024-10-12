public class average{
    public static void main(String[] args) {
        int []arr = {-25,5,12,3,-56,-89};
        int sum = 0;
        int count = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
            sum = sum + arr[i];
            count++;
            }
            
        }
        if(count >0){
            double avg = (double) sum/count;
            System.out.print("Avarage of positive number: "+avg);
        }else{
            System.out.println("No positive number in array");
        }
        
    }
}