<h2><a href="https://www.geeksforgeeks.org/problems/counting-number-of-sentences-and-words-in-text3226/1">Count Sentences and Words</a></h2><h3>Difficulty Level : Difficulty: Easy</h3><hr><div class="problems_problem_content__Xm_eO" style="--text-color: var(--problem-text-color);"><p><span style="font-size: 18px;">Given a string <strong>s</strong> representing a text, count the number of sentences and words in it.</span></p>
<ul>
<li><span style="font-size: 18px;">A sentence is a sequence of space-separated tokens ending with one or more of<strong> .</strong>,<strong> !</strong>, or<strong> ?</strong>. If the text does not end with a sentence-ending punctuation mark, the last sequence of tokens is also considered a sentence.</span></li>
<li><span style="font-size: 18px;">A word is a maximal sequence of alphabetic characters (a-z or A-Z).</span></li>
</ul>
<p><span style="font-size: 18px;">Return an array [sentenceCount, wordCount].</span></p>
<p><strong><span style="font-size: 18px;">Examples:</span></strong></p>
<pre><span style="font-size: 18px;"><strong>Input: </strong>s = "Sentences"<strong>
Output: </strong>[1, 1]<strong>
Explanation: </strong>There is one sentence and one word in the given text.</span></pre>
<pre><span style="font-size: 18px;"><strong>Input: </strong>s = "many??? Sentences are"<strong>
Output: </strong>[2, 3]<strong>
Explanation: </strong>The text contains two sentences: "many???", "Sentences are". <br>The words are: "many", "Sentences", "are". Hence, the answer is [2, 3].</span></pre>
<p><span style="font-size: 18px;"><strong>Constraints:</strong><br>1 ≤ |s| ≤ 10<sup>5</sup></span></p></div><br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Strings</code>&nbsp;