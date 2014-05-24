//印出陣列的內容和長度
public class ArrayDemo{
   public static void main(String args[]){
        int i;
        int arr[] = new int[3];
        arr[0] = 5;
        arr[1] = 8;
        for(i=0; i<arr.length; i++){
        System.out.print("arr[" +  i  + "]=" + arr[i] + "it");
        System.out.println("arr length = " + arr.length);
        }
   }
}