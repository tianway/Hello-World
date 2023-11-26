package demo;

public class Search {
    /*遍历查找*/
    public static int traversalSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > target) break;
            if (arr[i] == target) return i;
        }
        return -1;
    }

    /*二分查找（循环写法）*/
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] > target) {
                right = mid - 1;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    /*二分查找递归写法*/
    public static int binarySearchByRecursion(int[] arr, int left, int right, int target) {
        if (left > right) return -1;
        int mid = (left + right) / 2;
        if (arr[mid] < target) {
            return binarySearchByRecursion(arr, mid + 1, right, target);
        } else if (arr[mid] > target) {
            return binarySearchByRecursion(arr, left, mid - 1, target);
        } else return mid;
    }
}
