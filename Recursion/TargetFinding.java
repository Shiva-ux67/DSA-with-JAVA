package Recursion;

import java.util.ArrayList;

public class TargetFinding {
    public static void main(String[] args) {
        int[] arr = {7,45,43,5,5,24,23};
        int target = 5;
        System.out.println(Search(arr,target,0));
        System.out.println(SearchInd(arr,target,0));
        SearchAllInd(arr,target,0);
        System.out.println(list);
        System.out.println(SearchAllIndnew(arr,target,0,new ArrayList<>()));
    }

    static boolean Search(int[] arr, int target, int index) {
        if(index == arr.length - 1){
            return false;
        }
        if(arr[index] == target){
            return true;
        }
        return Search(arr,target,index + 1);
    }

    static int SearchInd(int[] arr, int target, int index) {
        if(index == arr.length - 1){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }
        return SearchInd(arr,target,index + 1);
    }

    static ArrayList<Integer> list = new ArrayList<>();
    static void SearchAllInd(int[] arr, int target, int index) {
        if(index == arr.length - 1){
            return ;
        }
        if(arr[index] == target){
             list.add(index);
        }
         SearchAllInd(arr,target,index + 1);
    }
    static ArrayList<Integer> SearchAllIndnew(int[] arr, int target, int index,ArrayList<Integer> list ) {
        if(index == arr.length - 1){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        return SearchAllIndnew(arr,target,index + 1,list);
    }
}
