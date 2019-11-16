package tree;

/**
 * @description:
 * @author: gmf
 * @date: Created in 2019/11/13 14:34
 * @version:
 * @modified By:
 */
public class Node {
    /**
     * 节点数据
     **/
    int data;
    /**
     * 左节点的引用
     */
    Node leftChild;
    /**
     * 右节点的引用
     */
    Node rightChild;
    /**
     * 表示节点是否删除
     */
    boolean isDelete;
    public Node(){ }
    public Node(int data){
        this.data = data;
    }
    //打印节点的内容
    public  void  display(){
        System.out.println(data);
    }
}
