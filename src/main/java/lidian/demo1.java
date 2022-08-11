package lidian;

import java.util.function.IntBinaryOperator;

/**
 * @ClassName demo1
 * @Description TODO
 * @Date 2022/8/11 23:46
 */
public class demo1 {
    public static void main(String[] args) {
        System.out.println(calculate((left, right) -> left + right));
    }
    public static int calculate(IntBinaryOperator operator){
        int a=10;
        int b=10;
        return operator.applyAsInt(a,b);
    }
}
