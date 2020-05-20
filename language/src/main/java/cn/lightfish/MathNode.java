package cn.lightfish;

import com.oracle.truffle.api.dsl.TypeSystemReference;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.Node;

@TypeSystemReference(MathTypes.class)
public abstract class MathNode extends Node  {
    abstract Object executeGeneric(VirtualFrame frame);
}