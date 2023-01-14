package TestTask;

public class ThirdTask {
    public static void main(String[] args) {
        int[] a = new int[100];
        for (int i = 1; i<100; i++)
            a[i] =i;
        for (int i =1; i<a.length;i++) if (a[i]%3==0) System.out.println(a[i]);
    }
}
