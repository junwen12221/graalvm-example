package cn.lightfish;

import org.graalvm.polyglot.Context;
import org.graalvm.polyglot.Source;
import org.graalvm.polyglot.Value;

import java.util.HashMap;

public class MathMain {

    public static void main(String[] args) throws Exception{
        String lgName = "Math";
        Source source = Source.newBuilder(lgName, "(1+2)", "<stdin>").build();
        Context.Builder builder = Context.newBuilder(lgName).in(System.in).out(System.out).options(new HashMap<>());
        try (Context context = builder.build()) {
            Value res = context.eval(source);
            System.out.println(res.toString());
        }
    }
}