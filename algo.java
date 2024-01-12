
class Solution {
    int mid = 0;

    int Binary_search(int a[], int value, int n, int start, int end) {
        mid = (start + end) / 2;
        while (start <= end) {
            if (a[mid] == value) {
                System.out.println("found element at" + (mid + 1));
                break;
            } else {
                if (a[mid] < value) {
                    Binary_search(a, value, n, mid + 1, end);
                } else {
                    Binary_search(a, value, n, start, mid - 1);

                }
            }
            return 0;
        }
        return 1;
    }
}

class algo {
    public static void main(String[] args) {
        int a;
        Solution s = new Solution();
        int arr[] = { 1, 2, 3, 4, 5 };
        a = s.Binary_search(arr, 7, 5, 0, 4);
        if (a == 0) {
            System.out.println("Not found");
        }
    }
}