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
    int[] temp;
    int med = (lo+hi)/2;
    for (int i = 0; i < med; i++) {
      if (i == med-1) {
        temp = new int[i];
      }
    }
    int[] temp2;
    for (int i = med; i < data.length; i++) {
      if (i == data.length-1) {
        temp2 = new int[i];
      }
    }
    for (int i = lo; i <= hi; i++) {
      temp[i] = data[i];
    }
    mergesortH(temp, lo, ((lo+hi)/2)-1);
    mergesortH(temp, (lo+hi)/2, hi);

  }

  public static void merge() {

  }
}
