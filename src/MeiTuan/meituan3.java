package MeiTuan;

import java.util.Scanner;

public class meituan3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int disfinal = sc.nextInt();
        int stucknode = sc.nextInt();
        int stucknum = sc.nextInt();
        final int INF = Integer.MAX_VALUE-8000;
        int[][] matrix = new int[][]{
                {0,1,2,7,INF,INF},
                {1,0,2,INF,5,4},
                {2,2,0,4,4,INF},
                {7,INF,4,0,6,INF},
                {INF,5,4,6,0,3},
                {INF,4,INF,INF,3,0}};
        for (int i=0;i<matrix.length;i++){
            if (matrix[stucknode][i]!=0){
                matrix[stucknode][i] += stucknum;
            }
        }
        for (int i=0;i< matrix.length;i++){
            if (matrix[i][stucknode]!=0){
                matrix[i][stucknode] += stucknum;
            }
        }
        System.out.println(matrix[1].toString());
        int[] mvtex = new int[]{0,1,2,3,4,5};
        boolean[] isVisited = new boolean[mvtex.length];
        int[] dist= new int[mvtex.length];
        //初始化
        for (int i=0;i< mvtex.length;i++){
            isVisited[i]=false;
            dist[i]=matrix[0][i];
        }
        isVisited[0]=true;
        dist[0]=0;
        int k=0;//最短路径的下标
        for (int i=1;i<mvtex.length;i++){
            int min=INF;
            for (int j=0;j< mvtex.length;j++){
                if (isVisited[j]==false&&min>dist[j]){
                    min=dist[j];
                    k=j;
                }
            }
            isVisited[k]=true;
            for (int j=0;j< mvtex.length;j++){
                int tmp = (matrix[k][j]==INF?INF:(min+matrix[k][j]));
                if (isVisited[j]==false&&(tmp<dist[j])){
                    dist[j]=tmp;
                }
            }
        }
        System.out.println(dist[disfinal]);
    }
}
