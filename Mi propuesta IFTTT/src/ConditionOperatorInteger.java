
public class ConditionOperatorInteger extends ConditionOperator {

    public ConditionOperatorInteger(Operator operator) {
        super(operator);
    }

    @Override
    public boolean equal(Object left_object, Object right_object) {
        return (Integer) left_object == (Integer) right_object;
    }

    @Override
    public boolean not_equal(Object left_object, Object right_object) {
        return (Integer) left_object != (Integer) right_object;
    }

    @Override
    public boolean less_than(Object left_object, Object right_object) {
        return (Integer) left_object < (Integer) right_object;
    }

    @Override
    public boolean greater_than(Object left_object, Object right_object) {
        return (Integer) left_object > (Integer) right_object;
    }

    @Override
    public boolean less_equal_than(Object left_object, Object right_object) {
        return (Integer) left_object <= (Integer) right_object;
    }

    @Override
    public boolean greater_equal_than(Object left_object, Object right_object) {
        return (Integer) left_object >= (Integer) right_object;
    }
}
