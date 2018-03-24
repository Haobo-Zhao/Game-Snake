package Snake;


/**
 * Created by Hao.
 */

public class Node {
    private final int x;
    private final int y;

    public Node(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * 对比是否相等
     * @param ano another Node
     * @return boolean
     */
    public boolean equals(Node ano) {
        if (this.getX() == ano.getX() && this.getY() == ano.getY()) {
            return true;
        }
        return false;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }
}
