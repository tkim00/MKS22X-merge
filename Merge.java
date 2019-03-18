public class Merge {
  public static void main(String[] args) {

  }

  public static void mergesort(int[] data) {
    mergesortH(data, 0, data.length-1);
  }

  public static void mergesortH(int[] data, int lo, int hi) {
    if (lo >= hi) {
      return;
    }
    int[] temp = new int[data.length/2];
    mergesortH(temp, lo, ((lo+hi)/2)-1);
    mergesortH(temp, (lo+hi)/2, hi);

  }

  public static void merge() {
    
  }
}
