package labtwo;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * This class represents a collection of sentences.
 *
 * <p>Bugs: This class has no known bugs but it is missing features.
 *
 * @author Add Your Name Here
 */

public class Sentences {

  /** The array of sentences. */
  private Sentence[] sentences;

  /** The index of the current sentence in the array. */
  private int currentSentence;

  /** The starting index for the currentSentence. */
  private static final int STARTING_CURRENT_SENTENCE = 0;

  /** The file that contains the sentences. */
  private static final String SENTENCESFILE = "input/sentences.txt";

  /** The total number of sentences supported by the array. */
  private static final int NUMBER_OF_SENTENCES = 10;

  /** Constructs a new instance of the Sentences, creating default array. */
  public Sentences() {
    sentences = new Sentence[NUMBER_OF_SENTENCES];
    currentSentence = STARTING_CURRENT_SENTENCE;
  }

  /** Constructs a new instance of the Sentences, creating sized array. */
  public Sentences(int size) {
    sentences = new Sentence[size];
    currentSentence = STARTING_CURRENT_SENTENCE;
  }

  /**
   * Adds a new sentence to the array.
   *
   * @param sentence The new sentence to add to the array.
   */
  public void addSentence(Sentence sentence) {
    sentences[currentSentence] = sentence;
    currentSentence = (currentSentence + 1) % NUMBER_OF_SENTENCES;
  }

  /**
   * Returns the sentences in the array.
   *
   * @return the array of the sentences.
   */
  public Sentence[] getSentences() {
    // TODO: Add a correct implementation of this method
    return null;
  }

  /** Reads the sentences from the file and adds them to the array. */
  public void readSentencesFromFile() throws IOException {
    // TODO: Add an implementation of this method that
    // uses an iteration construct to read in all of the
    // lines from the file, construct sentences, and then
    // add them to the sentences array
  }

  /** Displays all of the sentences to the screen. */
  public void printSentences() {
    // TODO: Add an implementation of this method that
    // uses an iteration construct to print out each of
    // the sentences inside of the sentences array
  }

  /** Reverses the sentences in the sentences[] array. */
  public void reverseSentences() {
    // TODO: Add an implementation of this method that
    // reverses the sentences array so that the first
    // sentence is now the last one and the last one is
    // now the first one, following this pattern fully
  }

}
