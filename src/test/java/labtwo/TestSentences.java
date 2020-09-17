package labtwo;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import labtwo.Sentence;
import labtwo.Sentences;
import org.junit.Test;

/**
 * A JUnit test suite for the Sentences class.
 *
 * @author Janyl Jumadinova
 * @author Add Your Name Here
 */

public class TestSentences {

  @Test
  public void testSentenceReversalWithOneSentence() {
    Sentences sentences = new Sentences(1);
    Sentence.resetId();
    Sentence sentence = new Sentence("Hello there!");
    sentences.addSentence(sentence);
    Sentence[] originalArray = sentences.getSentences();
    sentences.reverseSentences();
    Sentence[] reversedArray = sentences.getSentences();
    assertArrayEquals(reversedArray, originalArray);
  }

  @Test
  public void testSentenceReversalWithTwoSentences() {
    Sentences sentences = new Sentences(2);
    Sentence.resetId();
    Sentence sentence = new Sentence("Hello there!");
    Sentence sentenceAgain = new Sentence("Hello there again!");
    sentences.addSentence(sentence);
    sentences.addSentence(sentenceAgain);
    Sentence[] originalArray = sentences.getSentences();
    sentences.reverseSentences();
    Sentence[] reversedArray = sentences.getSentences();
    assertEquals(reversedArray[1], originalArray[0]);
    assertEquals(reversedArray[0], originalArray[1]);
  }

  // TODO: Add a third test case to check for three sentences

}
