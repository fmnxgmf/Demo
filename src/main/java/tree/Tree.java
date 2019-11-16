package tree;

/**
 * @description:
 * @author: gmf
 * @date: Created in 2019/11/13 14:39
 * @version:
 * @modified By:
 */
public interface Tree {
    //查找节点
    public Node find(int key);
    //插入新节点
    public boolean insert(int data);
    //中序遍历
    public void infixOrder(Node node);
}
