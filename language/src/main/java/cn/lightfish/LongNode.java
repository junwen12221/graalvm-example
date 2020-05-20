package cn.lightfish;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;

@NodeInfo()
public final class LongNode extends MathNode {
    private long value;

    public LongNode(long value) {
        this.value = value;
    }

    @Override
    Object executeGeneric(VirtualFrame frame) {
        return value;
    }
}
    