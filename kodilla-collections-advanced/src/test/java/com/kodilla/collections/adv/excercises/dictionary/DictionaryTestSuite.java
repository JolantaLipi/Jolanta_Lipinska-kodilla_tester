package com.kodilla.collections.adv.excercises.dictionary;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DictionaryTestSuite {
    @Test
    public void testAddWord() {
        // given
        Dictionary dictionary = new Dictionary();
        String polishWord = "stos";
        EnglishWord englishWord = new EnglishWord(PartOfSpeech.NOUN, "stack");
        // when
        dictionary.addWord(polishWord, englishWord);
        // then
        assertEquals(1. dictionary.size());
    }
}