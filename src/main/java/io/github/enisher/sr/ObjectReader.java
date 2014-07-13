package io.github.enisher.sr;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * @author <a href="mailto:enisher@gmail.com">Artem Orobets</a>
 */
public class ObjectReader {

  private final ObjectInputStream stream;

  public ObjectReader(String source) throws IOException {
    stream = new ObjectInputStream(new ByteArrayInputStream(new CSVBytesToArrayConverter(source).getBytes()));
  }

  public Object nextObject() throws IOException, ClassNotFoundException {
    return stream.readObject();
  }
}
