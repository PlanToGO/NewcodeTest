package Graph;

public class Dijkstra {
    char[] mvexs;//顶点的集合
    int[][] mmatrix;//邻接矩阵
    final int INF = Integer.MAX_VALUE;
    public void dijkstrademo(int vs,int[] prev,int[] dist){
        boolean[] isVisited = new boolean[mvexs.length];
        //初始化
        for (int i=0;i< mvexs.length;i++){
            isVisited[i]=false;
            prev[i]=0;
            dist[i]= mmatrix[vs][i];
        }
        isVisited[vs]=true;
        dist[vs]=0;
        //对mvexs.length-1次遍历，每次找出一个最短的路径
        int k=0;//表示最短路径的下标
        for (int i=1;i< mvexs.length;i++){
            int min=INF;
            for (int j=0;j< mvexs.length;j++){
                if (isVisited[j]==false&&dist[j]<min){
                    min=dist[j];
                    k=j;
                }
            }
            isVisited[k]=true;
            //当已经找到了顶点k的最短路径之后，更新未获得最短路径的顶点和前驱节点
            for (int j=0;j< mvexs.length;j++){
                int tmp = (mmatrix[k][j]==INF?INF:(min+mmatrix[k][j]));
                if (isVisited[j]==false&&(tmp<dist[j])){
                    dist[j]=tmp;
                    prev[j]=k;
                }
            }
        }
        System.out.println("当前节点到各个节点的最短路径为：");
        System.out.println(dist.toString());
    }
}