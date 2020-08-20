package Graph;

import java.util.Arrays;

public class dijkstrademo {
    static final int INF = Integer.MAX_VALUE-800;
    public static int[] dijkstra(int[][] matrix,int[] vetex,int start){
        boolean[] isVisited = new boolean[vetex.length];
        int[] dist = new int[vetex.length];
        //初始化
        for (int i=0;i< vetex.length;i++){
            isVisited[i]=false;
            dist[i]=matrix[start][i];
        }
        isVisited[start]=true;
        dist[start]=0;
        //对vetex进行遍历，每次找到一个最短的路径
        int min_index = 0;
        for (int i=0;i< vetex.length;i++){
            int min = INF;
            //这个循环是为了找到当前最短的路径
            for (int j=0;j< vetex.length;j++){
                if (isVisited[j]==false&&min>dist[j]){
                    min=dist[j];
                    min_index=j;
                }
            }
            isVisited[min_index]=true;
            //更新节点状态
            for (int j=0;j< vetex.length;j++){
                int tmp = (matrix[min_index][j]==INF?INF:(min+matrix[min_index][j]));
                if (isVisited[j]==false&&tmp<dist[j]){
                    dist[j]=tmp;
                }
            }
        }
        return dist;
    }

    public static void main(String[] args) {
        int[][] matrix = new int[][]{
                {0,1,2,7,INF,INF},
                {1,0,2,INF,5,4},
                {2,2,0,4,4,INF},
                {7,INF,4,0,6,INF},
                {INF,5,4,6,0,3},
                {INF,4,INF,INF,3,0}};
        int[] vetex = new int[]{0,1,2,3,4,5};
        System.out.println(Arrays.toString(dijkstra(matrix,vetex,1)));
    }
}
