class InvPyramidMirror{
	public static void main(String[] args){
		//System.out.println("*");
		int rows = 7;
		int columns = 7;
		for(int i=1;i<=rows;i++){
			//System.out.println("Hi");
			for(int j=1;j<=columns;j++){
				if(j>=i){
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}