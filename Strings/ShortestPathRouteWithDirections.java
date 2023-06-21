package Strings;

public class ShortestPathRouteWithDirections {

    public static double ShortestPath(String direction_string){
        int length = direction_string.length();
        int x=0,y=0;
        for(int i=0;i<length;i++)
        {
            if(direction_string.charAt(i) == 'W') {
                x = x-1; //West
            } else if (direction_string.charAt(i)=='E') {
                x = x+1; //East
            } else if (direction_string.charAt(i)=='N') {
                y = y+1; //North
            }
            else {
                y = y-1; //South
            }
        }
        return (Math.sqrt(Math.pow(x,2)+Math.pow(y,2)));
    }
    public static void main(String args[])
    {
        String direction_string = "WNEENESENNN";
        System.out.println(ShortestPath(direction_string));
    }
}
