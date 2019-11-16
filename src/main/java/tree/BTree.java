package tree;

/**
 * @description:
 * @author: gmf
 * @date: Created in 2019/11/13 14:41
 * @version:
 * @modified By:
 */
public class BTree implements Tree{
    /**
     * 根节点
     */
    public Node root;

    @Override
    public Node find(int key) {
        Node current = root;
        while (current != null){
            //当前值比查找值大，搜索左子树
            if(current.data > key){
                current = current.leftChild;
            }else if(current.data < key){
                //当前值比查找值小，搜索右子树
                current = current.rightChild;
            }else{
                //值相等就返回
                return current;
            }
        }
        return null;
    }

    @Override
    public boolean insert(int data) {
        Node newNode = new Node(data);
        //当前树为空就直接插入
        if(root == null){
            root = newNode;
            return true;
        }else {
            Node current = root;
            Node parrenNode = null;
            while (current != null){
                parrenNode = current;
                if(current.data > data){
                    current = current.leftChild;
                    if(current == null){
                        parrenNode.leftChild = newNode;
                        return true;
                    }
                }else if(current.data < data){
                    current = current.rightChild;
                    if(current == null){//右子节点为空插入
                        parrenNode.rightChild = newNode;
                        return true;
                    }
                }else{
                    System.out.println(current.data+"已经存在");
                    return false;
                }
            }
        }
        return false;
    }

    @Override
    public void infixOrder(Node node) {
        Node current = node;
        if(current != null){
            infixOrder(current.leftChild);
            System.out.println(current.data+"  ");
            infixOrder(current.rightChild);
        }
    }
}
