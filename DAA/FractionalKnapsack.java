import java.util.Arrays;
import java.util.Scanner;

public class FractionalKnapsack {

    public static void main(String[] args) {
        int i, n;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no of items: ");
        n = sc.nextInt();

        // values
        int[] v = new int[n];
        System.out.println("Enter the values of each items:");
        for (i = 0; i < n; i++)
            v[i] = sc.nextInt();

        // weights
        int[] w = new int[n];
        System.out.println("Enter the weights of each items: ");
        for (i = 0; i < n; i++)
            w[i] = sc.nextInt();

        System.out.println("Enter maximum volume of knapsack :");
        int cap = sc.nextInt();
        Item[] items = new Item[n];
        for(i=0;i<n;i++){
            double r = (v[i] *1.0)/w[i];
            Item item = new Item(v[i],w[i], r);
            items[i] = item;
        }
        // sorting array of items
        Arrays.sort(items);


        double vib = 0;
        int rc = cap;
        for (i=n-1;i>=0;i--){
            if(rc==0){
                break;
            }
            if(items[i].wt<=rc){
                vib +=items[i].val;
                rc -= items[i].wt;
            }else{
                vib +=items[i].val *((double) rc/items[i].wt);
                rc =0;
                break;
            }
        }
        System.out.println(vib);
    }

    public static class Item implements Comparable<Item>{
        int val;
        int wt;
        double r;

        Item(int val, int wt, double r) {
            this.val = val;
            this.wt = wt;
            this.r = r;
        }

        @Override
        public int compareTo(Item o) {
            if(this.r > o.r){
                return 1;
            }else if(this.r<o.r){
                return -1;
            }
            return 0;
        }
    }
}
