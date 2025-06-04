package interfaceexample;

public class StockTransfer implements StockTransferEdit
{

	public static void main(String[] args) 
	{
		System.out.println(StockTransfer.NOOFSTOCK);
		StockTransferView v=StockTransfer.example();//example of workbook
		System.out.println(v.NOOFSTOCK);
		StockTransferEdit e=new StockTransfer();
		
	}
	public void skuView() 
	{
		
	}
	public void ditributorview() 
	{
		
	}
	public void skuEdit() 
	{
		
	}

	public void ditributorEdit() 
	{
		
	}
	public static StockTransfer example()
	{
		return new StockTransfer();
	}
}
