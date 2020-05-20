package cn.lightfish;

import com.oracle.truffle.api.CallTarget;
import com.oracle.truffle.api.Truffle;
import com.oracle.truffle.api.TruffleLanguage;
import com.oracle.truffle.api.frame.FrameDescriptor;

@TruffleLanguage.Registration(id = "Math", name = "Math")
public final class MathLanguage extends TruffleLanguage<MathContext> {
    @Override
    protected MathContext createContext(Env env) {
        return new MathContext();
    }

    @Override
    protected CallTarget parse(ParsingRequest request) throws Exception {
        String source = request.getSource().getCharacters().toString();
        FrameDescriptor frame = new FrameDescriptor();
        LongNode longNode = new LongNode(1);
        MathRootNode mathRootNode = new MathRootNode(this, frame, longNode);
        return Truffle.getRuntime().createCallTarget(mathRootNode);
    }

    @Override
    protected boolean isObjectOfLanguage(Object object) {
        return true;
    }

}