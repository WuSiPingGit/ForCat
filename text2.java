public class text2
{
	public text2()
	{
		System.out.println("USE TEXT2");
	}
	private int i=1;
	private final int j=2;
	abstract static class fulei
	{
		public abstract void sum();
	}
	public static void main(String[] args)
	{
		int k=3;
		text2.fulei fu=new text2.fulei(){
											public void sum()
													{
														System.out.println("LLLLLL\n"+(k+1));
													}
											
										};
		k=4;
		System.out.println("/nk=="+k);
		fu.sum();
	}
}