/**
 * 
 */
package javap.io.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author nexu
 *
 */
public class BufferedInputFile {
	public static String read(String filename) throws IOException{
		BufferedReader in = new BufferedReader(new FileReader(filename));
		String s;
		StringBuilder sb = new StringBuilder();
		while((s=in.readLine())!=null){
			sb.append(s+"\n");
			
		}
		in.close();
		return sb.toString();
	}
	
	

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println(read("C:\\Users\\max\\git\\home\\javaP\\src\\javap\\io\\test\\BufferedInputFile.java"));
		
		//java提取当前文件目录的几种方法

	    System.out.println(Thread.currentThread().getContextClassLoader().getResource(""));    
	    System.out.println(BufferedInputFile.class.getClassLoader().getResource(""));       
	    System.out.println(ClassLoader.getSystemResource(""));       
	    System.out.println(BufferedInputFile.class.getResource(""));   //bin src dir    
	    System.out.println(BufferedInputFile.class.getResource("/")); //Class文件所在路径
	    //System.out.println(new File("/").getAbsolutePath());       
	    System.out.println(System.getProperty("user.dir"));   

	

		
	}

}
