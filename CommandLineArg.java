class CommandLineArg{
	
	public static void main(String[] args){
		
		int n;
		try{
			n = Integer.parseInt(args[0]);
			for (int index = 0; index <= n; index++){
				int squareRoot = index * index;
				System.out.println("SquareRoot of  " + index +" = " + squareRoot);
			}
		}catch (NumberFormatException e){
			System.err.println(e);
		}
		
	}
	
	
}