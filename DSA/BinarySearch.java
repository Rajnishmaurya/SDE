public class BinarySearch {
    public static void main(String[] args)
    {
        int nums[]={1,12,23,25,26,28,89,91,95,99};
        int target=91;
        int result=binarysearch(nums,target);

        if(result!=-1)
        {
            System.out.println("Element found at index: "+result);
        }
        else
        {
            System.out.println("Element not found.....");
        }
    }

    public static int binarysearch(int[] nums,int target)
    {
        int start=0;
        int end=nums.length-1;
        while(start<end)
        {
            int mid=(start+end)/2;

            if(nums[mid]==target)
            return mid;

            else if(nums[mid]>target)
            end=mid-1;

            else
            start=mid+1;
        }

        return -1;
    }
}
