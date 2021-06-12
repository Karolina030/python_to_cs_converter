import java.util.ArrayList;
import java.util.List;

public class CsCodeAssembler {
    private final List<String> expressions = new ArrayList<>();

    public void addExpression(String expression){
        expressions.add(expression);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        for (String expression : expressions){
            stringBuilder.append(expression).append("\n");
        }

        return stringBuilder.toString();
    }
}
