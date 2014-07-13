package io.github.enisher.sr;

import org.junit.Test;

import static org.junit.Assert.*;

public class CSVBytesToArrayConverterTest {
  @Test
  public void testEmptyStreamConversion() throws Exception {
    final String inputString = "";
    final byte[] expectedResult = new byte[0];

    final CSVBytesToArrayConverter converter = new CSVBytesToArrayConverter(inputString);
    byte[] result = converter.getBytes();

    assertArrayEquals(expectedResult, result);
  }

  @Test
  public void testSingleValue() throws Exception {
    final String inputString = "255";
    final byte[] expectedResult = {(byte)255};

    final CSVBytesToArrayConverter converter = new CSVBytesToArrayConverter(inputString);
    byte[] result = converter.getBytes();

    assertArrayEquals(expectedResult, result);

  }

  @Test
  public void testArray() throws Exception {
    final String inputString = "1, 2, 17, 127, 255, 128";
    final byte[] expectedResult = {(byte) 1, 2, 17, 127, -1, -128};

    final CSVBytesToArrayConverter converter = new CSVBytesToArrayConverter(inputString);
    byte[] result = converter.getBytes();

    assertArrayEquals(expectedResult, result);
  }
}