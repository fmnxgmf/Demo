package tree;

import org.junit.Test;

/**
 * @description:
 * @author: gmf
 * @date: Created in 2019/11/13 14:56
 * @version:
 * @modified By:
 */
public class DemoTree {
    @Test
    public  void demo() {
        BTree bt = new BTree();
        bt.insert(20);
        bt.insert(10);
        bt.insert(90);
        bt.insert(10);
        bt.insert(50);
        //bt.find(10).display();
        bt.infixOrder(bt.root);
    }
}
