package io.github.enisher.sr;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ObjectReaderTest {

  @Test
  public void testNextObject() throws Exception {
    final ObjectReader objectReader = new ObjectReader("-84, -19, 0, 5, 115, 114, 0, 19, 106, 97, 118, 97, 46, 117, " +
        "116, 105, 108, 46, 65, 114, 114, 97, 121, 76, 105, 115, 116, 120, -127, -46, 29, -103, -57, 97, -99, 3, 0, 1, " +
        "73, 0, 4, 115, 105, 122, 101, 120, 112, 0, 0, 0, 3, 119, 4, 0, 0, 0, 3, 115, 114, 0, 17, 106, 97, 118, 97, 46, " +
        "108, 97, 110, 103, 46, 73, 110, 116, 101, 103, 101, 114, 18, -30, -96, -92, -9, -127, -121, 56, 2, 0, 1, 73, " +
        "0, 5, 118, 97, 108, 117, 101, 120, 114, 0, 16, 106, 97, 118, 97, 46, 108, 97, 110, 103, 46, 78, 117, 109, 98, " +
        "101, 114, -122, -84, -107, 29, 11, -108, -32, -117, 2, 0, 0, 120, 112, 0, 0, 0, 1, 115, 113, 0, 126, 0, 2, 0, " +
        "0, 0, 2, 115, 113, 0, 126, 0, 2, 0, 0, 0, 3, 120");

    final Object o = objectReader.nextObject();
    assertTrue(o instanceof ArrayList);
    final ArrayList list = (ArrayList) o;
    for (Object el : list) {
      assertTrue(el instanceof Integer);
    }
  }
}