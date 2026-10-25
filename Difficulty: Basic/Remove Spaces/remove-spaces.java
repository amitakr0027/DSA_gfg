class Solution {
    public String removeSpaces(String s) {
        // code here
       char[] arr = s.toCharArray();
              int n = arr.length;

              for (int i = 0; i < n; i++) {
                  if (arr[i] == ' ') {

                      // shift all characters to the left
                      // starting from current index
                      for (int j = i; j < n - 1; j++) {
                          arr[j] = arr[j + 1];
                      }
                      n--;
                      i--;
                  }
              }

              // return string up to new valid length
              // without spaces
              return new String(arr, 0, n); 
        }
}