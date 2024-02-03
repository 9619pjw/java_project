import java.util.*;
import java.io.*;

public class Main {

    public static int N, M, x, y, direction;
    // 방문한 위치를 저장하기 위한 맵을 생성하여 0으로 초기화
    public static int[][] d = new int[50][50];
    // 전체 맵 정보
    public static int[][] arr = new int [50][50];

    // 북 동 남 서
    public static int dx[] = {-1, 0, 1, 0};
    public static int dy[] = {0, 1, 0, -1};

    // 왼쪽으로 회전
    public static void turn_left() {
        direction -= 1;
        if (direction == -1) direction = 3;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        x = Integer.parseInt(st.nextToken());
        y = Integer.parseInt(st.nextToken());
        direction = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }


        br.close();
    }
}