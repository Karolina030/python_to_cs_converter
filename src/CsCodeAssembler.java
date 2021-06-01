import java.util.ArrayList;
import java.util.List;

public class CsCodeAssembler {
    private final List<String> variables = new ArrayList<>();

    public void addVariable(String variable){
        variables.add(variable);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        for (String variable : variables){
            stringBuilder.append("var ").append(variable).append(";\n");
        }

        return stringBuilder.toString();
    }
}
