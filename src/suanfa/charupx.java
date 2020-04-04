package suanfa;
//插入排序
public class charupx {
    public static void main(String[] args) {
        int[] a={8,11,50,4,79,100};
        insertSort(a);
        for (int i = 0; i <a.length ; i++) {
            System.out.println(a[i]);
        }
    }
    public static void insertSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            //选择插入排序的数，保存为num
            int num = arr[i];
            //计算num前一个数的索引
            int preIndex = i - 1;
            for (; preIndex >= 0; preIndex--) {
                //进行检查，如果num小于前面的数，则将前一个数往后移，若比前一个数大，则结束此次循环
                if (num < arr[preIndex])
                    arr[preIndex + 1] = arr[preIndex];
                else
                    break;
            }
            //结束时的位置保存num
            if (num != arr[i])
                arr[preIndex + 1] = num;
        }}
}
