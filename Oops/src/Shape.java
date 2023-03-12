class Shape
{
    static int height;
    int weight;
    Shape(int h,int w)
    {
        height=h;
        weight=w;
    }
    public void area()
    {
        System.out.println("Area of shape is: "+height*weight);
    }
}
