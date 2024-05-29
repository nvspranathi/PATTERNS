public class MirrorPyramid{
	public static void main(String[] args){
		int rows = 4;
		int columns = 4;
		for(int i=1; i<=rows; i++){
			for(int j=0; j<=columns; j++){
				if(j<=(rows-i)){
					System.out.print(" ");
				}
				else{
					System.out.print("*");
				}
			}
/*
or instead of inner for loop :
for(int j=1;j<=n-1;j++){
//print(" ")
}
for(int j=1;j,=i;j++){
//print("*")
}
*/
			System.out.println();
		}
	}
}