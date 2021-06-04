import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("test.py");

        StringBuilder input = new StringBuilder();

        try (Scanner reader = new Scanner(file)) {
            while (reader.hasNextLine()) {
                input.append(reader.nextLine()).append('\n');
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        InputStream stream = new ByteArrayInputStream(input.toString().getBytes());

        System.out.println(generate(stream));
    }

    private static String generate(InputStream inputStream) throws IOException {
        CharStream stream = CharStreams.fromStream(inputStream);
        Python_grammarLexer lexer = new Python_grammarLexer(stream);

        CommonTokenStream commonTokenStream = new CommonTokenStream(lexer);
        Python_grammarParser parser = new Python_grammarParser(commonTokenStream);

        ParseTree tree = parser.program();
        Python_grammarListenerImpl listener = new Python_grammarListenerImpl();
        ParseTreeWalker.DEFAULT.walk(listener, tree);
        return listener.getCode().toString();
    }
}
