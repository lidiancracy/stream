package lidian.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MethodDemo {
    interface UseString{
        String use(String str,int start,int length);
    }
    public static String subAuthorName(String str, UseString useString){
        int start = 0;
        int length = 1;
        return useString.use(str,start,length);
    }
    public static void main(String[] args) {

        subAuthorName("三更草堂", String::substring);

    }
}
