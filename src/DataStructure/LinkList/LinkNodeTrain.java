package DataStructure.LinkList;

public class LinkNodeTrain {
    //public Node head=null;

    /**
     * 从链表尾部插入数据
     * @param head 头结点
     * @param data 节点携带的数据
     * @return head
     */
    public static Node insertNodeFromTail(Node head,int data){
        Node node=new Node(data);
        Node tmp=head;
        while (tmp.next!=null){
            tmp=tmp.next;
        }
        tmp.next=node;
        return head;
    }

    /**
     * 从链表头部插入数据
     * @param head 头结点
     * @param data 插入节点数据
     * @return 头结点
     */
    public static Node insertNodeFromHead(Node head,int data){
        Node node=new Node(data);
        node.next=head;
        return node;
    }

    /**
     * 迭代遍历
     * @param head 头结点
     */
    public static void printLink(Node head){
        while (head!=null){
            System.out.println(head.data);
            head=head.next;
        }
    }

    /**
     * 递归遍历
     * @param head 头结点
     */
    public static void printsLink(Node head){
        if (head==null){
            return;
        }
        printsLink(head.next);
        System.out.println(head.data);
    }

    public static void main(String[] args) {
        Node head=new Node(1);
        head=insertNodeFromHead(head,2);
        head=insertNodeFromHead(head,9);
        printLink(head);
        printsLink(head);
    }
}
