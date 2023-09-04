public class Demo01{
    public static void languages(int[][] scores,String[] names){
        // 相当于一维数组的排名
        for(int i=0;i<scores.length-1;i++){
            for(int j=0;j<scores.length-i-1;j++){
                if(scores[j][1]<scores[j+1][1]){
                    // 语文成绩的排名
                    int[] temp=scores[j];
                    scores[j]=scores[j+1];
                    scores[j+1]=temp;
                    // 名字的排名
                    String name=names[j];
                    names[j]=names[j+1];
                    names[j+1]=name;
                }
            }
        }
    }
    public static void main(String[] args){
        String[] names=new String[]{"张三","李四","王五","孙六","赵七"};
        String[] courses=new String[]{"数学","语文","英语"};
        int[][] scores=new int[][]{
                {77,87,94},
                {63,75,48},
                {94,79,87},
                {78,96,86},
                {90,79,58}
        };
        languages(scores,names);
        for(int i=0;i<scores.length;i++){
            System.out.print("姓名："+names[i]+"\t");
            for(int j=0;j<scores[i].length;j++){
                System.out.print(courses[j]+"\t");
                System.out.print(scores[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
