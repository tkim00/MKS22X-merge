public class Merge {
  public static void main(String[] args) {
    int[] sample = {38, 27, 43, 3, 9, 82, 10};
    mergesort(sample);
    for (int i = 0; i < sample.length; i++) {
      System.out.print(sample[i]);
    }
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
    int k;//this is just to keep the index of temp independent from that of data
    if ((hi-lo)%2==0) { //if length of array is odd;this is because lo and hi is inclusive
      temp = new int[half];
      temp2 = new int[half+1];
      k = 0;
      for (int i = lo; i < med; i++) {
        temp[k] = data[i];
        k++;
      }
      k = 0;
      for (int i = med; i <= hi; i++) {
        System.out.print(k);
        System.out.println(i);
        temp2[k] = data[i];
        k++;
      }
    } else { //when it is even
      temp = new int[half+1];
      temp2 = new int[half+1];
      k = 0;
      for (int i = lo; i <= med; i++) {
        temp[k] = data[i];
        k++;
      }
      k = 0;
      for (int i = med+1; i <= hi; i++) {
        temp2[k] = data[i];
        k++;
      }
    }
    mergesortH(temp, lo, med-1);
    mergesortH(temp2, med, hi);
    int[] temp3 = new int[hi-lo+1];
    for (int i = 0; i < temp.length; i++) { //problem solved.
      if (temp[i] < temp2[i]) {
        temp3[i*2] = temp[i];
        temp3[i*2+1] = temp2[i];
      } else {
        temp3[i*2] = temp2[i];
        temp3[i*2+1] = temp2[i];
      }
    }
    if (temp3.length%2!=0) {//when merging uneven subarrays
      if (temp2[temp2.length-1] > temp3[temp3.length-2]) {
        temp3[temp3.length-1] = temp2[temp2.length-1];
      } else {
        int biggest = temp3[temp3.length-2];
        temp3[temp3.length-2] = temp2[temp2.length-1];
        temp3[temp3.length-1] = biggest;
      }
    }
    if (temp3.length == data.length) {
      data = temp3;
    }
  }
}
