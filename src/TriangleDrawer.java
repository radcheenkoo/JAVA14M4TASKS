public class TriangleDrawer {
    public String drawTriangle(int side){
        String symbol = "*";
        String str = "";
        int i = side;
        while (i > 0){
            str += symbol.repeat(i);
            i--;
            str += "\n";
        }

        return str;

    }

    public static void main(String[] args) {
        System.out.println(new TriangleDrawer().drawTriangle(3));
    }
}
