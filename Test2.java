public class TwoD{
public static void main(String[] args) {
static final int NUMROWS = 5;
static final int NUMCOLUMS = 10;
int[][] ary = new int[5][10];
for(int i = 0; i < NUMROWS; i++)
	for(int j = 0; j < NUMCOLUMS; j++)
		ary[i][j] = (int) (Math.random() * 101);
System.out.println(ary[i][j]);
}
}