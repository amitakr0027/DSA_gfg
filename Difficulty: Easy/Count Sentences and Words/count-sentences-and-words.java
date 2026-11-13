class Solution {
    public ArrayList<Integer> sentenceWord(String s) {
       int sentences = 0, words = 0;
              boolean word = false, content = false;

              for (char c : s.toCharArray()) {

                  if (Character.isLetter(c)) {
                      if (!word) words++;
                      word = true;
                      content = true;
                  } else {
                      word = false;
                  }

                  if (c == '.' || c == '!' || c == '?') {
                      if (content) {
                          sentences++;
                          content = false;
                      }
                  }
              }

              if (content) sentences++;

              ArrayList<Integer> ans = new ArrayList<>();
              ans.add(sentences);
              ans.add(words);

              return ans;
        
    }
}