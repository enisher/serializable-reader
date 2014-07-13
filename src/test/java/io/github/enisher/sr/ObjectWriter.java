package io.github.enisher.sr;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 * @author <a href="mailto:enisher@gmail.com">Artem Orobets</a>
 */
public class ObjectWriter {
  public static void main(String[] args) throws IOException {
    final ArrayList<Integer> l = new ArrayList<Integer>();
    l.add(1);
    l.add(2);
    l.add(3);

    final ByteArrayOutputStream bs = new ByteArrayOutputStream();
    final ObjectOutputStream s = new ObjectOutputStream(bs);

    s.writeObject(l);
    s.close();


    final byte[] bytes = bs.toByteArray();

    for (byte b : bytes) {
      System.out.print(b + ", ");
    }
  }
}
