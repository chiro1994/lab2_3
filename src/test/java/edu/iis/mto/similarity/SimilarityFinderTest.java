package edu.iis.mto.similarity;

import static org.junit.Assert.assertThat;

import org.hamcrest.Matchers;
import org.junit.Test;

public class SimilarityFinderTest {

	@Test
	public void comparingTwoIdenticalSetsIsCorrect() {

		final int[] sequence = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		SequenceSearcherDubler sequenceSearcher = new SequenceSearcherDubler();
		SimilarityFinder similarityFinder = new SimilarityFinder(sequenceSearcher);

		assertThat(similarityFinder.calculateJackardSimilarity(sequence, sequence), Matchers.is(1.0d));
	}

	@Test
	public void comparingTwoDifferentSetsIsCorrect() {

		final int[] sequence = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		final int[] otherSequence = new int[] { 10, 11, 12, 13, 14, 15, 16 };

		SequenceSearcherDubler sequenceSearcher = new SequenceSearcherDubler();
		SimilarityFinder similarityFinder = new SimilarityFinder(sequenceSearcher);

		assertThat(similarityFinder.calculateJackardSimilarity(sequence, otherSequence), Matchers.is(0.0d));
	}

}
