public class Area_and_Perimeter {
    int Length;
    int Breadth;
    public Area_and_Perimeter(int Length,int Breadth)
    {
        this.Length=Length;
        this.Breadth=Breadth;
    }
    public int Area(){
        return Length*Breadth;
    }
    public int Perimeter(){
        return 2 * (Length + Breadth);
    }
}
