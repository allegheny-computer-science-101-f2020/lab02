package labtwo;

import java.io.IOException;

/**
 * This takes all of the steps to read in and reverse a list of sentences.
 *
 * <p>Bugs: This class has no known bugs.
 *
 * @author Add Your Name Here
 */

public class SentencesReverser {

  /**
   * The starting point for executing the SentencesReverser.
   *
   * @param args The command line arguments
   *
   * @author Add Your Name Here
   */
  public static void main(String[] args) throws IOException {
    // STEP 1: Constructs the sentences object and read them from file
    // TODO: Make sure that you understand how these two lines work!
    Sentences sentences = new Sentences();
    sentences.readSentencesFromFile();

    // STEP 2: Display the sentences in their original order
    // TODO: Add the required labels so that the output is correct
    sentences.printSentences();

    // STEP 3: Reverse the sentences
    // TODO: Add the required labels so that the output is correct
    sentences.reverseSentences();

    // STEP 4: Display the sentences in the reversed order
    // TODO: Add the required labels so that the output is correct
    sentences.printSentences();
  }

}
