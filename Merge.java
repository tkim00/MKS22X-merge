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
    int med = (lo+hi)/2; //this is for the index of the arrays; this is more like the middle number
    int half = (hi-lo)/2; //this is for the length of the arrays
    int[] temp;
    int[] temp2;
    int k = 0;//this is just to keep the index of temp independent from that of data
    if (half%2==0) { //if length of array is odd;this is because lo and hi is inclusive
      temp = new int[half];
      temp2 = new int[half+1];
      for (int i = lo; i < med; i++) {
        temp[i] = data[i];
      }
      for (int i = med; i <= hi; i++) {
        temp2[i] = data[i];
      }
    } else { //when it is even
      temp = new int[half+1];
      temp2 = new int[half+1];
      for (int i = lo; i <= med; i++) {
        temp[i] = data[i];
      }
      for (int i = med+1; i <= hi; i++) {
        temp[i] = data[i];
      }
    }
    mergesortH(temp, lo, med);
    mergesortH(temp2, med+1, hi);
    int[] temp3 = new int[hi-lo+1];
    for (int i = 0; i < hi-lo+1; i+=2) { //the problem is the temporary index should not match the index of data.

    }
  }

  public static void merge() {

  }
}
