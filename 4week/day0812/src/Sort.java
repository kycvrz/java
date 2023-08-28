public class Sort {
    // 有5位同学的姓名存储在一个一维数组names中
    // 三科成绩（数学，语文，英语）
    // 二维数组成绩scores
    public static void sortChinese(int[][] scores,String[] names,String[] courses){
        for (int i = 0; i < scores.length-1; i++) {
            for (int j = 0; j < scores.length-i-1; j++) {
                if (scores[j][1]<scores[j+1][1]){
                    int[] temp=scores[j];
                    scores[j]=scores[j+1];
                    scores[j+1]=temp;

                    String name=names[j];
                    names[j]=names[j+1];
                    names[j+1]=name;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[][] scores=new int[][]{
                {67,88,65},
                {78,90,77},
                {94,66,83},
                {76,57,88},
                {75,86,76}
        };
        String[] names=new String[]{"张三","李四", "王五","孙六","赵七"};
        String[] courses=new String[]{"数学","语文","英语"};
        sortChinese(scores,names,courses);
        for (int i = 0; i < scores.length; i++) {
            System.out.print("姓名："+names[i]+"\t");
            for (int j = 0; j < scores[i].length; j++) {
                System.out.print(courses[j]+"\t");
                System.out.print(scores[i][j]+"\t");
            }
            System.out.println();
        }
    }
}