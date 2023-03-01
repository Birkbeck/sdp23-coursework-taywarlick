package sml.instruction;

import sml.Instruction;
import sml.Machine;
import sml.RegisterName;
import sml.Registers;

public class PrintInstruction extends Instruction {
    private final RegisterName result;
    private final RegisterName source;

    public static final String OP_CODE = "out";

    public PrintInstruction(String label, RegisterName result, RegisterName source) {
        super(label, OP_CODE);
        this.result = result;
        this.source = source;
    }

    public PrintInstruction(String label, Registers.Register result) {
        super(label, OP_CODE);
        this.result = result;
        this.source = source;
    }

    public int execute(Machine m) {
        int value1 = m.getRegisters().get(result);
        System.out.println(Registers.valueOf(s));
    }

    @Override
    public String toString() {
        return getLabelString() + getOpcode() + " " + result + " " + source;
    }
}
}