package practice_0429.실습;

public class NodeMgmt {
    Node head = null;

    public class Node{
        int value;
        Node left;
        Node right;

        public Node(int data) {
            this.value = data;
            this.left = null;
            this.right = null;
        }
    }

    public boolean insertNode(int data){
        //CASE 1: Node 하나도 없을 때
        if(this.head == null){
            this.head = new Node(data);
        }else {
            //CASE 2: Node 하나 이상 들어가 있을 때
            Node findNode = this.head;
            while(true) {
                //CASE 2-1: 현재 Node의 왼쪽에 Node가 들어가야 할 때
                if(data < findNode.value){
                    if(findNode.left != null){
                        findNode = findNode.left;
                    }else {
                        findNode.left = new Node(data);
                        break;
                    }
                }else {//CASE 2-2: 현재 Node의 오른쪽에 Node가 들어가야 할 때
                    if(findNode.right != null){
                        findNode = findNode.right;
                    } else {
                        findNode.right = new Node(data);
                        break;
                    }
                }
            }
        }
        return true;
    }

    public Node search(int data){
        return null;
    }

    public static void main(String[] args) {
        NodeMgmt myTree = new NodeMgmt();
        boolean result = myTree.insertNode(2);
        System.out.println(result);
        myTree.insertNode(3);
        myTree.insertNode(4);
        myTree.insertNode(6);

        Node testNode = myTree.search(6);
        System.out.println(testNode.toString());
        System.out.println(testNode.value);
    }
}
