package Recursion;

import java.util.ArrayList;

public class TargetFinding {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,5};
        int target = 4;
//        System.out.println(Search(arr,target,0));
//        System.out.println(SearchInd(arr,target,0));
//        SearchAllInd(arr,target,0);
//        System.out.println(list);
//        System.out.println(SearchAllIndnew(arr,target,0,new ArrayList<>()));
        System.out.println(SearchAllIndnew2(arr,target,0));
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
    static ArrayList<Integer> SearchAllIndnew2(int[] arr, int target, int index ) {
        ArrayList<Integer> list = new ArrayList<>();
        if(index == arr.length - 1){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        ArrayList<Integer> abc = SearchAllIndnew2(arr,target,index + 1);
        list.addAll(abc);
        return list;
    }
}
