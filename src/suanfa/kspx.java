package suanfa;
//快速排序
public class kspx {
    public static void main(String[] args) {
        int[] a={8,11,50,4,79,100};
        //冒泡：
//        for (int i = 0; i <a.length-1 ; i++) {
//            for (int j = 0; j <a.length-1-i ; j++) {
//                if (a[j]<a[j+1]){
//                    int temp=a[j];
//                    a[j]=a[j+1];
//                    a[j+1]=temp;
//                }
//            }
//        }
        int low = 0;
        int high = a.length - 1;
        QuickSort(a, low, high);
        for (int i = 0; i <a.length ; i++) {
            System.out.println(a[i]);
        }
    }
    private static void QuickSort(int[] R,int low,int high)//总快速排序
    {
        int temp;
        if(low<high)
        {
            temp = QuickPartition(R, low, high);
            QuickSort(R, low, temp - 1);
            QuickSort(R, temp + 1, high);
        }
    }
    private static int QuickPartition(int[] R, int low, int high)//单次快速排序方法
    {
        int x = R[low];
        while(low<high)
        {
            while(low <high && R[high]>=x)
            { high--; }
            R[low] = R[high];
            while(low<high && R[low]<=x)
            {low++;}
            R[high] = R[low];
        }
        R[low] = x;
        return low;
    }

}
