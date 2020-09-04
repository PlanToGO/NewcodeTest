package BinaryTree;

public class BalanceTree {
    private int data = 0;
    private BalanceTree nextLeftTree;	//左子树
    private BalanceTree nextRightTree;	//右子树
    private int Lheight = 0;		//左高度
    private int Rheight = 0;		//右高度
    BalanceTree(){}					//无参构造函数
    BalanceTree(int xdata){
        this.data = xdata;
    }

    //左旋调整
    public BalanceTree LL(BalanceTree t){
        BalanceTree t1 = new BalanceTree();
        t1 = t.nextLeftTree;			//t1指向t的左孩子
        t.nextLeftTree = t1.nextRightTree;
        t1.nextRightTree = t;						//t1的右孩子指向t
        return t1;
    }
    //右旋调整
    public BalanceTree RR(BalanceTree t){
        BalanceTree t1 = new BalanceTree();
        t1 = t.nextRightTree;			//t1指向t的右孩子
        t.nextRightTree = t1.nextLeftTree;
        t1.nextLeftTree = t;						//t1的左孩子指向t
        return t1;
    }
    public BalanceTree LR(BalanceTree t){
        t.nextLeftTree = RR(t.nextLeftTree);
        t = LL(t);
        return t;
    }
    public BalanceTree RL(BalanceTree t){
        t.nextRightTree = LL(t.nextRightTree);
        t = RR(t);
        return t;
    }

    //保持平衡操作
    public BalanceTree ChangeToBalance(BalanceTree tree,int value){
        if(tree == null)
            return tree;
        AddHeight(tree);
        if(tree.Lheight - tree.Rheight > 1){
            if(value < tree.data && value >tree.nextLeftTree.data){
                System.out.println("执行LR平衡调整!");
                tree = LR(tree);
            }
            else{
                System.out.println("执行LL平衡调整!");
                tree = LL(tree);
            }
        }
        else if(tree.Lheight - tree.Rheight < -1){
            if(value > tree.data && value <tree.nextRightTree.data){
                System.out.println("执行RL平衡调整!");
                tree = RL(tree);
            }
            else{
                System.out.println("执行RR平衡调整!");
                tree = RR(tree);
            }
        }
        if(value < tree.data)
            tree.nextLeftTree = ChangeToBalance(tree.nextLeftTree,value);			//注意一定要等于  值传递！！！！！！！
        else
            tree.nextRightTree = ChangeToBalance(tree.nextRightTree,value);
        return tree;
    }
    //计算各节点左右子树高度
    public void AddHeight(BalanceTree tree){
        if(tree == null)
            return;
        AddHeight(tree.nextLeftTree);				//上下顺序很重要
        AddHeight(tree.nextRightTree);
        tree.Lheight = maxHeight(tree.nextLeftTree);
        tree.Rheight = maxHeight(tree.nextRightTree);
    }
    //辅助计算左右子树高度
    public int maxHeight(BalanceTree tree){
        if(tree != null)
            return tree.Lheight >= tree.Rheight ? tree.Lheight+1 : tree.Rheight+1;
        else
            return 0;
    }

    //遍历二叉树（中序遍历）
    public static void ergodic (BalanceTree tree){
        if(tree == null) return;
        System.out.println(tree.data);
        ergodic(tree.nextLeftTree);
        ergodic(tree.nextRightTree);
    }

    //插入操作
    public BalanceTree InTree(BalanceTree tree , int value){
        BalanceTree tree2 = new BalanceTree();
        if(tree.data == 0){
            tree.data = value;
            return tree;
        }
        tree2 = tree;
        while(tree2 != null){
            if(value < tree2.data){
                System.out.println("左"+"value:"+value);
                if(tree2.nextLeftTree != null){
                    tree2 = tree2.nextLeftTree;
                }
                else{
                    tree2.nextLeftTree = new BalanceTree(value);
                    break;
                }
            }
            if(value >= tree2.data){
                System.out.println("右"+"value:"+value);
                if(tree2.nextRightTree != null){
                    tree2 = tree2.nextRightTree;
                }
                else{
                    tree2.nextRightTree = new BalanceTree(value);
                    break;
                }
            }
        }
        System.out.println((tree.Lheight +":::" +tree.Rheight));
        tree = ChangeToBalance(tree,value);
        return tree;
    }

    //查找节点
    public BalanceTree findNode (BalanceTree tree ,int value){
        while(tree !=null){
            if(value < tree.data)
                tree = tree.nextLeftTree;
            else if(value > tree.data)
                tree = tree.nextRightTree;
            else if(value == tree.data)
                return tree;
        }
        System.out.println("不存在要查询的数据！！！！");
        return null;
    }

    //删除节点
    public BalanceTree deleteNode (BalanceTree tree ,int value){
        BalanceTree t = new BalanceTree();
        BalanceTree parent = null;			//一定要是null作为是否是删除根节点的判断
        t = tree;
        while(tree !=null&&value != t.data){
            parent = t;
            if(value < t.data)
                t = t.nextLeftTree;
            else if(value > t.data)
                t = t.nextRightTree;
        }
        if(t == null)
            System.out.println("不存在要删除的数据！！！！");
        else if(t.nextLeftTree !=null && t.nextRightTree != null){
            BalanceTree tree2 = t.nextRightTree;
            BalanceTree pre = t;
            while(tree2.nextLeftTree != null){
                pre = tree2;
                tree2 = tree2.nextLeftTree;
            }
            t.data = tree2.data;
            if(pre == t)
                pre.nextRightTree = tree2.nextRightTree;		//不需要判断tree2.nextRightTree 是不是null，为空就给他赋值为空
            else
                pre.nextLeftTree = tree2.nextRightTree;
        }
        else{
            BalanceTree tree3;
            if(t.nextLeftTree == null) tree3 = t.nextRightTree;
            else tree3 = t.nextLeftTree;
            if(parent == null)
                return tree3;
            else if(parent.nextLeftTree == t) parent.nextLeftTree = tree3;
            else parent.nextRightTree = tree3;
        }
        return tree;
    }

    //修改节点
    public BalanceTree changeNode (BalanceTree tree ,int oldvalue ,int newvalue){
        BalanceTree t = new BalanceTree();							//会破坏排序树的性质
        t = tree;
        while(tree !=null){
            if(oldvalue < t.data)
                t = t.nextLeftTree;
            else if(oldvalue > t.data)
                t = t.nextRightTree;
            else if(oldvalue == t.data){
                t.data = newvalue;
                return tree;
            }
        }
        System.out.println("不存在要修改的数据！！！！");
        return tree;
    }
    public static void main(String[] args) {
        BalanceTree aBalanceTree = new BalanceTree();
//		int[] num = {20,12,6,28,16,36,32,10,2,30,8};
        int[] num = {20,12,6,28,16,36,32};
        for(int n : num){
            aBalanceTree = aBalanceTree.InTree(aBalanceTree, n);
        }
        ergodic(aBalanceTree);
        System.out.println("-------------------------------");
        BalanceTree aaa = aBalanceTree.deleteNode(aBalanceTree, 32);
        ergodic(aaa);
    }
}