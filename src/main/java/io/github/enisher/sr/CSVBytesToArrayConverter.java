package io.github.enisher.sr;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * @author <a href="mailto:enisher@gmail.com">Artem Orobets</a>
 */
public class CSVBytesToArrayConverter {
  private final ByteArrayOutputStream os;

  public CSVBytesToArrayConverter(String r) throws IOException {

    os = new ByteArrayOutputStream();

    convert(r);
  }

  private void convert(String r) throws IOException {
    Scanner scanner = new Scanner(r);
    scanner.useDelimiter(Pattern.compile("\\s*,\\s*"));

    while (scanner.hasNextInt()) {
      os.write(scanner.nextInt());
    }

    os.close();
  }

  public byte[] getBytes() {
    return os.toByteArray();
  }
}
