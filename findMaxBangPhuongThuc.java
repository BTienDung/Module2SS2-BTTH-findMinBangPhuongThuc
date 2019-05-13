package season_2.FindMaxBangPhuongThuc;

public class findMaxBangPhuongThuc {
    public static void main(String[] args) {
        int arr[] = {4, 12, 7, 8, 10, 6, 9};
        int poi = findMin(arr);
        System.out.print("Min is: "+arr[poi-1]);
    }
    public static int findMin(int arr[]){
        int minArr =arr[0];
        int position = 1;
        for (int i=0;i<arr.length;i++){
            if (minArr>arr[i]){
                minArr = arr[i];
                position = i+1;
            }
        }
        return position;
    }
}
