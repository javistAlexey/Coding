package InterviewTasks.MySclad;

import java.util.ArrayList;
import java.util.List;

/**
 * условие задачи в ресурсах на картинке
 */
public class _1 {
    public static void main(String[] args) {

    }

    public class Util {
        public static List<Node> toFlatList(Node n) {
            List<Node> result = new ArrayList<>();
            if (n != null) {
                result.add(n);
                for (Node child : n.child) {
                    result.addAll(toFlatList(child));
                }
            }
            return result;
        }
    }
    public static class Node {
        public List<Node> child = new ArrayList();
    }
}
