package arraydemo;
public class ArrayDemo {
    public static void main(String[] args) {
        int i;
        int arr[] = new int[3];
        arr[0] = 5;
        arr[1] = 8;
        for(i=0; i<arr.length; i++)
            System.out.println("arr [" + i + "]=" + arr[i] + " it" );
        System.out.println("arr length = " + arr.length);
        
    }
}




