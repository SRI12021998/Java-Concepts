package filereadwrite;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
public class FileHandling
{

	public static void main(String[] args) 
	{
		FileHandling fh = new FileHandling();
		fh.listTextFiles();
	}
	
	public void textFileCreation()
	{
		File f=new File("D:\\shrideev.txt");
		boolean present=f.exists();
		if (present==false)
		{
			try
			{
				if(f.createNewFile())
				{
					System.out.println("Text file created successfully "+f.getName());
				}
				
			}
			catch (IOException  e)
			{
				System.out.println("Some error occurred while creating the file");
			}
			finally
			{
				System.out.println("Closing file creation");
			}
		}
		else
		{
			System.out.println("File already exists with same name");
		}
	}
	
	public void textFileDeletion()
	{
		File f=new File("D:/shrideev.txt");
		boolean present=f.exists();
		if (present==true)
		{
			try
			{
				if(f.delete())
				{
					System.out.println("Text file deleted successfully "+f.getName());
				}
			}
			catch (Exception e)
			{
				System.out.println("Some error occurred while deleting the file");
			}
			finally
			{
				System.out.println("Closing file deletion");
			}
		}
		else
		{
			System.out.println("File does not exists");	
		}
		
	}
	
	public void xlsxFileCreation()
		{
			File f=new File("D:\\shrideev.xlsx");
			try
			{
				if(f.createNewFile())
				{
					System.out.println("xlsx file created successfully "+f.getName());
				}
				else
				{
					System.out.println("File already exists with same name");
				}
			}
			catch (IOException  e)
			{
				System.out.println("Some error occurred while creating the file");
			}
			finally
			{
				System.out.println("Closing file creation");
			}
		}
		
	public void xlsxFileDeletion()
		{
			File f=new File("D:\\shrideev.xlsx");
			try
			{
				if(f.delete())
				{
					System.out.println("xlsx file deleted successfully "+f.getName());
				}
				else
				{
					System.out.println("File does not exists");
				}
			}
			catch (Exception e)
			{
				System.out.println("Some error occurred while deleting the file");
			}
			finally
			{
				System.out.println("Closing file deletion");
			}
	}

	public void textFileRename()
	{
		File f=new File("D:\\shrideev.txt");
		File rename=new File ("D:\\Shrideev krishna.txt");
		try
		{
			if(f.renameTo(rename))
			{
				System.out.println("File rename successful");	
			}
			else
			{
				System.out.println("File not found with the specied name");
			}
		}
		catch (Exception e)
		{
			System.out.println("Some error occurred while renaming the file");
		}
		finally
		{
			System.out.println("Closing file renaming");
		}
	}
	
	public void foldersCreation()
	{
		for (int num=1;num<=50;num++)
		{
			
			File f=new File("D:\\Disk Folder\\New folder by java"+num);
			if(f.mkdirs())
			{
				System.out.println("Folder-"+num+" created successfully");
			}
			else
			{
				System.out.println("Folders not created check the path");
				num=51;
			}
		}
	}

	public void listAllItems()
	{
		File f=new File("D:\\");
		boolean present=f.exists();
		if (present==true)
		{
			String files[]=f.list();//returns names of files/directories
			for (String output:files)
			{
				System.out.println(output);
			}
		}
		else
		{
			System.out.println("path not found");
		}
	}

	public void listTextFiles()
	{
		File f=new File("D:\\");
		boolean present=f.exists();
		if (present==true)
		{
			String [] files=f.list();
			for (String print:files)
			{
				if(print.contains(".txt"))
				{
					System.out.println(print);
				}
			}
		}
		else
		{
			System.out.println("path not found");
		}
	}
	
	public void listJsonFiles()
	{
		File f=new File("D:\\");
		boolean present=f.exists();
		if (present==true)
		{
			String [] files=f.list();
			for (String print:files)
			{
				if(print.contains(".json"))
				{
					System.out.println(print);
				}
			}
		}
		else
		{
			System.out.println("path not found");
		}
	}
	
	public void listXlsxFiles()
	{
		File f=new File("D:\\");
		boolean present=f.exists();
		if (present==true)
		{
			String [] files=f.list();
			for (String print:files)
			{
				if(print.contains(".xlsx"))
				{
					System.out.println(print);
				}
			}
		}
		else
		{
			System.out.println("path not found");
		}
	}

	public void listFolders()
	{
		File f=new File("D:\\My Documents");
		File [] items=f.listFiles();//returns Full File objects with path info
		if (items!=null)
		{
			for (File file:items)
			{
				if (file.isDirectory())
				{
					System.out.println(file.getName());
				}
			}
		}
	}

	public void textJsonFileRead(String p)
	{
		try
		{
			BufferedReader reader=new BufferedReader(new FileReader(p));
			String line;
			while ((line=reader.readLine())!=null)
			{
				System.out.println(line);
			}
			reader.close();
			System.out.println("Read task completed");
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

	public void textJsonFileWrite(String p)
	{
		try 
		{
			BufferedWriter writer=new BufferedWriter (new FileWriter(p));
			writer.write("Starting my exploration");
			writer.close();
			System.out.println("Write task completed");
		} 
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void copyTextFromOtherFile(String source, String destiny)
	{
		try
		{
			BufferedReader reader=new BufferedReader (new FileReader (source));
			BufferedWriter writer=new BufferedWriter (new FileWriter (destiny));
			String line;
			while ((line=reader.readLine())!=null)
			{
				writer.write(line);
				writer.newLine();
			}
			reader.close();
			writer.close();
			System.out.println("Copy task completed");
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void fileCopying()
	{
		Path source=Paths.get("D:\\My Documents\\Sriram Resume.pdf") ;
		Path destination=Paths.get("D:\\Sriram Resume.pdf") ;
		try 
		{
			Files.copy(source, destination);
			System.out.println("Copy task completed");
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
	}
	
	public void fileMoving()
	{
		Path source=Paths.get("D:\\My Documents\\Sriram Resume.pdf") ;
		Path destination=Paths.get("D:\\Sriram Resume.pdf") ;
		try 
		{
			Files.move(source,destination);
			System.out.println("Move task completed");
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
	}
}
