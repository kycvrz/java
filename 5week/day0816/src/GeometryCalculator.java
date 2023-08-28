public class GeometryCalculator {
    // calculateCircleArea(double radius) ：计算并返回圆的面积
    // calculateRectangleArea(double width, double height) ：计算并返回矩形的面积
    // 完成计算圆的面积以及计算矩形的面积等功能。
    double radius;
    double width;
    double height;
    public double calculateCircleArea(double radius){
        // S=πr²
        this.radius=radius;
//        return Math.PI*radius*radius;
        return Math.PI*Math.pow(radius,2);
    }
    public double calculateRectangleArea(double width, double height){
        // 长乘以宽
        this.width=width;
        this.height=height;
        return width*height;
    }
    public static void main(String[] args) {
        GeometryCalculator circleArea=new GeometryCalculator();
        System.out.println("圆的面积为："+circleArea.calculateCircleArea(5));
        GeometryCalculator rectangleArea=new GeometryCalculator();
        System.out.println("矩形的面积为："+rectangleArea.calculateRectangleArea(4,5));
    }
}
