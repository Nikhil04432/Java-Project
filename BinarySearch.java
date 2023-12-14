public class BinarySearch {
    public static void main(String[] args) {

        int[] arr = {11, 25, 39, 48, 67, 98, 99};
        int tar = 98;

        int ele = binary1(arr, tar);

        System.out.println(ele);
    }

    static int binary1(int[] arr, int tar)
    {
        int start= 0;
        int end = arr.length-1;

        while(start<=end)
        {
            int mid = start + (end-start)/2;

            if(tar<arr[mid])
            {
                end = mid -1;
            } else if (tar>arr[mid])
            {
                start = mid +1;       // in last iteration start will exceed end then it breaks loop but it will return*** start
            }                                 // here it will not return it will only assign but in celing we return start
            else
                return mid ;



        }

        return -1;
    }

    }


