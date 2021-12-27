package com.bridgelabz.mergesort;

class MergeSortMainMain {
    public static void conquer(int arr[],int si,int mid,int ei){
        int merge[] = new int[ei - si + 1];

        int indx1 = si;
        int indx2 = mid + 1;
        int x = 0;

        while(indx1 <= mid && indx2 <= ei){
            if(arr[indx1] <= arr[indx2]){
                merge[x] = arr[indx2];
                x++; indx1++;
            }else{
                merge[x++]=arr[indx2++];
            }
        }
        while(indx1 <= mid){
            merge[x++]= arr[indx1++];
        }

        for(int i=0,j=0; i<merge.length;i++,j++){
            arr[j]=merge[i];
        }

    }
    public static void divide(int arr[],int si,int ei){
        if(si>=ei){                                    //either single element or array khatam
            return;
        }
        int mid=si + (ei - si)/2;
        divide(arr,si,mid);
        divide(arr,mid+1,ei);
        conquer(arr, si, mid, ei);

    }

        public static void main(String args[])
        {
            int arr[] = { 19, 34, 43, 85, 47, 89 };
            int n = arr.length;


            divide(arr,0,n-1);

            for(int i=0; i<n; i++){
                System.out.println(arr[i] + " ");
            }
        }
}
