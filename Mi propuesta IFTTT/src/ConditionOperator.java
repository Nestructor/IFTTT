
public abstract class ConditionOperator {

    enum Operator {
        EQUAL,
        NOT_EQUAL,
        LESS_THAN,
        GREATER_THAN,
        LESS_EQUAL_THAN,
        GREATER_EQUAL_THAN
    }

    private Operator operator;

    public ConditionOperator(Operator operator) {
        this.operator = operator;
    }

    public boolean evaluate(Object left_object, Object right_object) {
        boolean result;

        switch (this.operator) {
            case EQUAL:
                result = equal(left_object, right_object);
                break;
            case NOT_EQUAL:
                result = not_equal(left_object, right_object);
                break;
            case LESS_THAN:
                result = less_than(left_object, right_object);
                break;
            case GREATER_THAN:
                result = greater_than(left_object, right_object);
                break;
            case LESS_EQUAL_THAN:
                result = less_equal_than(left_object, right_object);
                break;
            case GREATER_EQUAL_THAN:
                result = greater_equal_than(left_object, right_object);
                break;
            default:
                result = false;
        }

        return result;
    }

    public abstract boolean equal(Object left_object, Object right_object);

    public abstract boolean not_equal(Object left_object, Object right_object);

    public abstract boolean less_than(Object left_object, Object right_object);

    public abstract boolean greater_than(Object left_object, Object right_object);

    public abstract boolean less_equal_than(Object left_object, Object right_object);

    public abstract boolean greater_equal_than(Object left_object, Object right_object);
}
