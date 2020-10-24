public class getHouses {

    public static void main(String[] args){
        System.out.println(getHouses(2,new int[]{-1,4,5,2}));
    }

    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     * 返回能创建的房屋数
     * @param t int整型 要建的房屋面宽
     * @param xa int整型一维数组 已有房屋的值，其中 x0 a0 x1 a1 x2 a2 ... xi ai 就是所有房屋的坐标和房屋面宽。 其中坐标是有序的（由小到大）
     * @return int整型
     */
    public static int getHouses(int t, int[] xa) {
        // write code here
        int n = 0;
        if (xa == null || xa.length == 0) return n;
        for (int i = 0; i < xa.length-2; i += 2){
            int dis1 = xa[i+2] - xa[i];
            double dis2 = dis1 - 0.5*(xa[i+3] + xa[i+1]);
            if (dis2 > (double) t) n += 2;
            if (dis2 == (double) t) n++;
        }
        return n+2;
    }
}
