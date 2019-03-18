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
    mergesortH(int[] data, lo, ((lo+hi)/2)-1);
    mergesortH(int[] data, (lo+hi)/2, hi);

  }
}
